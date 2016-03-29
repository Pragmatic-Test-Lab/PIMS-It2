package com.ptl.PIMS.TestCases.AppealManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.AppealManagement.AppealAddUpdatePage;
import com.ptl.PIMS.Pages.AppealManagement.EditAppealPage;
import com.ptl.PIMS.Pages.AppealManagement.NewAppeal;
import com.ptl.PIMS.Pages.AppealManagement.NewAppeal_InmateSelect;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class AppealCreateUpdateTest extends TestBase {

	AppealAddUpdatePage appealPage;
	
	@Test(dataProvider = "getAppealData")
	public void createAppealTestData(Hashtable<String, String> data) {
		
		loginToApplication();
		
		createInmateForAppeal(data.get("courts"),data.get("caseNos"), TestUtil.getTodaysDate(), TestUtil.getTodaysDate(), data.get("offensecode"),data.get("Offenses"),data.get("Sentences"), data.get("Days"), 	data.get("Months"), data.get("Years"),
				data.get("Fines"));

	}

	
	@Test(dataProvider = "getAppealData", dependsOnMethods = "createAppealTestData", groups="AppealCreateUpdateTest")
	public void createAppealTest(Hashtable<String, String> data) {
		
		//Create New Appeal
		appealPage =  getTopMenu().gotoAppealAddUpdate();		
		NewAppeal_InmateSelect inmateSelectionPage = appealPage.CreateNewAppeal();
		inmateSelectionPage.doSearch(appealRegistrationNo, "", "");
		
		try {   Thread.sleep(2000);		} catch (InterruptedException e) {e.printStackTrace();}

		NewAppeal newAppealPage = inmateSelectionPage.clickFirstInmate();
		appealPage = newAppealPage.AddNewAppeal(data.get("caseNos"), data.get("courts"), data.get("Reason"), data.get("Request"));
		
    	assertTrue(appealPage.successMessageAvaiable(), "Could not find Success Message element in Appeal Add/Update Page.");
		//
	}
	
	@Test(dataProvider = "getAppealData", dependsOnMethods = "createAppealTest", groups="AppealCreateUpdateTest" )
	public void updateAppealTest(Hashtable<String, String> data) {
		
		
		//Edit Created Appeal
		appealPage = appealPage.AppealForSearch(appealRegistrationNo, "", "", "", data.get("Reason"));
		EditAppealPage editAppealPage =  appealPage.SelectFirstAppeal();
		appealPage = editAppealPage.EditAppealDetails(data.get("caseNos"), data.get("courts"), data.get("Updated Reason"), data.get("Updated Request"));
		
    	assertTrue(appealPage.successMessageAvaiable(), "Could not find Success Message element in Appeal Add/Update Page.");
		//
	}
	
	@DataProvider
	public Object[][] getAppealData() {
		return TestUtil.getTestData("Appeal Test", xls);
	}

}