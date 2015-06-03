package com.ptl.PIMS.TestCases.EscortManagement;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.EscortManagement.Calendar.CalendarInmateSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.Calendar.CalendarPage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class EscortCreateUpdateTest extends TestBase{

	@Test(dataProvider = "getEscData")
	public void prepareEscortData(Hashtable<String,String> data) {
		
		loginToApplication();
 
		//Authorize Admission with court details
		AuthorizeAdmissionInmatePage authorizeInmateSelect = getTopMenu().gotoAuthorizeAdmissionPage();
		AuthorizeAdmissionPage authorizePage = authorizeInmateSelect.clickFirstInmate();
		
		authorizePage.fillCase(data.get("courts"), data.get("caseNos"), TestUtil.getTodaysDate(), TestUtil.getTodaysDate());
		authorizePage.changeInmateCategory("Convicted");
		authorizePage.changeAdmissionDate(TestUtil.getTodaysDate());
	    registrationNo = authorizePage.getRegistrationNumber();
	    
    
	    authorizeInmateSelect = authorizePage.doAuthorizeAdmission();
		
	    Assert.assertTrue(authorizeInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Admission Page.");
	    //		
	}
	
	@Test(dataProvider = "getEscData", dependsOnMethods = "prepareEscortData")
	public void createCalendarRecord(Hashtable<String,String> data) {
		
		CalendarInmateSelectPage calendarPage = getTopMenu().gotoEscortCalendar();
		calendarPage = calendarPage.doSearch(registrationNo, "", "");		
		CalendarPage calendar = calendarPage.selectFirstInmate();
		
		calendarPage = calendar.addCourtDates(data.get("caseNos"), data.get("NCDate"));
		
		Assert.assertTrue(calendarPage.successMessageAvaiable(), "Success message was not found in Add Court Date To Calendar.");		
	}
	
	@DataProvider
	public Object[][] getEscData() {
		return TestUtil.getTestData("Escort Test", xls);
	}
}
