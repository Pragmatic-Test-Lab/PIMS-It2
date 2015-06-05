package com.ptl.PIMS.TestCases.IncidenceManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.IncidenceManagement.IncidenceAddInmateSelectionPage;
import com.ptl.PIMS.Pages.IncidenceManagement.IncidenceAddPage;
import com.ptl.PIMS.Pages.IncidenceManagement.IncidenceAuthorizeInmateSelectionPage;
import com.ptl.PIMS.Pages.IncidenceManagement.IncidenceAuthorizePage;
import com.ptl.PIMS.Pages.IncidenceManagement.Recapture.RecaptureAddInmatePage;
import com.ptl.PIMS.Pages.IncidenceManagement.Recapture.RecaptureAddPage;
import com.ptl.PIMS.Pages.IncidenceManagement.Recapture.RecaptureAuthorizePage;
import com.ptl.PIMS.Pages.IncidenceManagement.Recapture.RecaptureAuthorizeSelectionPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class IncidenceTest extends TestBase{

	
	@Test(dataProvider = "getIncidenceData")
	public void createIncidence(Hashtable<String,String> data) {

		loginToApplication(); 
		IncidenceAddInmateSelectionPage addIncidence = getTopMenu().gotoAddIncidence();
		
		addIncidence = addIncidence.doSearch(data.get("RegNo"), "", "");
		IncidenceAddPage inicidenceAddPage  = addIncidence.addNewIncidence();

		addIncidence = inicidenceAddPage.addIncidences(data.get("Date"), data.get("EventType"), data.get("EventD"), data.get("Action"), data.get("Place"));
				
		assertTrue(addIncidence.successMessageAvaiable(), "Success message was not found in Add Incidence.");		
	}
	
	@Test(dataProvider = "getIncidenceData", dependsOnMethods = "createIncidence")
	public void authorizeIncidence(Hashtable<String,String> data) {

		IncidenceAuthorizeInmateSelectionPage authIncidenceSelect = getTopMenu().gotoAuthIncidence();
		
		authIncidenceSelect = authIncidenceSelect.searchIncidence(data.get("RegNo"), data.get("EventType"), data.get("EventD"));
		IncidenceAuthorizePage authIncidence  = authIncidenceSelect.authorizeIncidence();

		authIncidenceSelect = authIncidence.authorizeRecord();
				
		assertTrue(authIncidenceSelect.successMessageAvaiable(), "Success message was not found in Authorize Incidence.");		
	}
	
	@Test(dataProvider = "getIncidenceData", dependsOnMethods = "authorizeIncidence")
	public void recordRecapture(Hashtable<String,String> data) {

		RecaptureAddInmatePage recapSelection = getTopMenu().gotoAddRecapIncidence();
		
		recapSelection = recapSelection.doSearch(data.get("RegNo"), "", "");
		RecaptureAddPage recapPage  = recapSelection.addNewRecapture();

		recapSelection = recapPage.addRecapture(data.get("EventD"), data.get("Action"), data.get("Recap Date"));
				
		assertTrue(recapSelection.successMessageAvaiable(), "Success message was not found in Add Recapture.");		
	}
	
	@Test(dataProvider = "getIncidenceData", dependsOnMethods = "recordRecapture")
	public void authorizeRecapture(Hashtable<String,String> data) {

		RecaptureAuthorizeSelectionPage authRecapSelect = getTopMenu().gotoAuthorizeRecapIncidence();
		
		authRecapSelect = authRecapSelect.searchRecapture(data.get("RegNo"), data.get("EventType"), data.get("EventD"));
		RecaptureAuthorizePage authRecap  = authRecapSelect.authorizeRecapture();

		authRecapSelect = authRecap.authorizeRecapture();
				
		assertTrue(authRecapSelect.successMessageAvaiable(), "Success message was not found in Authorize Recapture.");		
	}
	
	@DataProvider
	public Object[][] getIncidenceData() {
		return TestUtil.getTestData("Incidence Test", xls);
	}
}
