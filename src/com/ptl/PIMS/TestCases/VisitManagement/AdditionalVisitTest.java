package com.ptl.PIMS.TestCases.VisitManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.VisitManagement.VisitAddSelectInmatePage;
import com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq.AdditionalVisitAddUpdatePage;
import com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq.AdditionalVisitCreatePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class AdditionalVisitTest extends TestBase{

	
	@Test(dataProvider = "getVisitData")
	public void createAdditionalVisits(Hashtable<String,String> data) {
		
		loginToApplication();
		AdditionalVisitAddUpdatePage additionalAddUpdate = getTopMenu().gotoVisitAdditional();
		
		VisitAddSelectInmatePage visitInmateSelection = additionalAddUpdate.CreateNewVisit();
		visitInmateSelection = visitInmateSelection.doSearch(registrationNo, "", "");		
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		AdditionalVisitCreatePage additionalCreatePage = visitInmateSelection.selecFirstInmateforAdditionalVist();
		
		additionalCreatePage.fillVisitorDetails(data.get("Name"), data.get("NIC"), data.get("Relationship"),
				data.get("Pass"));
		additionalCreatePage.fillItemDetails(data.get("Description"), data.get("Quantity"), data.get("Value"));
		
		additionalAddUpdate = additionalCreatePage.createVisit(TestUtil.getPastDateandtime("0-0-1-0-0"));
		
		assertTrue(additionalAddUpdate.successMessageAvaiable(), "Success message was not found in Additional Visit Create.");		
	}

	
	@DataProvider
	public Object[][] getVisitData() {
		return TestUtil.getTestData("Visit Test", xls);
	}
	
}
