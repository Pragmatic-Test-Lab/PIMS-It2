package com.ptl.PIMS.TestCases.VisitManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.VisitManagement.VisitAddSelectInmatePage;
import com.ptl.PIMS.Pages.VisitManagement.VisitAddUpdatePage;
import com.ptl.PIMS.Pages.VisitManagement.VisitAuthorizePage;
import com.ptl.PIMS.Pages.VisitManagement.VisitAuthorizeSelectionPage;
import com.ptl.PIMS.Pages.VisitManagement.VisitCreatePage;
import com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq.VisitFreqAddUpdatePage;
import com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq.VisitFreqUpdatePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class VisitManagementTest extends TestBase{


	@Test
	public void configureInmateForVisit() {
		
		loginToApplication();
		
		//Uses appeal inmate if appeal test was run before or creates a new inmate for visit test
		if(appealRegistrationNo.equals(""))
			createInmateForVisit();
		else visitRegistrationNo = appealRegistrationNo;
				
	}
	
	
	//@Test(dataProvider = "getVisitData")
	public void configureVisitorFreq(Hashtable<String,String> data) {
		
		loginToApplication();
		VisitFreqAddUpdatePage visitFreqAddUpdate = getTopMenu().gotoVisitFreq();
		visitFreqAddUpdate = visitFreqAddUpdate.searchForFreq(data.get("Freq Cat"));
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		VisitFreqUpdatePage visitFreqUpdate = visitFreqAddUpdate.selectFirstFreq();
		
		visitFreqAddUpdate = visitFreqUpdate.editFreq(data.get("freq"), data.get("noOfVisitors"));
		assertTrue(visitFreqAddUpdate.successMessageAvaiable(), "Success message was not found in Visit Freq Update.");		
	}
	
	
	@Test(dataProvider = "getVisitData", dependsOnMethods = "configureInmateForVisit")
	public void createVisitRecord(Hashtable<String,String> data) {
		
		VisitAddUpdatePage visitPage = getTopMenu().gotoVisitAddUpdate();		
		VisitAddSelectInmatePage visitInmateSelection = visitPage.CreateNewVisit();
		
		visitInmateSelection = visitInmateSelection.doSearch(visitRegistrationNo, "", "");
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		VisitCreatePage newVisit =  visitInmateSelection.selecFirstInmateforVist();
		
		newVisit.fillVisitorDetails(data.get("Name"), data.get("NIC"), data.get("Relationship"),data.get("Pass"));
		newVisit.fillItemDetails(data.get("Description"), data.get("Quantity"), data.get("Value"));
		
		visitPage = newVisit.createVisit();
		
		assertTrue(visitPage.successMessageAvaiable(), "Success message was not found in Visit Add.");		
	}
	
	@Test(dataProvider = "getVisitData", dependsOnMethods = "createVisitRecord")
	public void authorizeVisitRecord(Hashtable<String,String> data) {
		
		VisitAuthorizeSelectionPage visitAuthSelection = getTopMenu().gotoVisitAuthorization();
		
		visitAuthSelection = visitAuthSelection.doVisitSearch(visitRegistrationNo, "", "", "");
		VisitAuthorizePage visitAuth = visitAuthSelection.AuthorizeFirstVisit();
		
		visitAuthSelection = visitAuth.authorizeVisit();
		
		assertTrue(visitAuthSelection.successMessageAvaiable(), "Success message was not found in Visit Authorize.");		
	}
	
	@DataProvider
	public Object[][] getVisitData() {
		return TestUtil.getTestData("Visit Test", xls);
	}
}
