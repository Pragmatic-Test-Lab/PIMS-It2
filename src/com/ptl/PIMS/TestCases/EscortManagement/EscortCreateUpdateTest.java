package com.ptl.PIMS.TestCases.EscortManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.EscortManagement.EscortAddPage;
import com.ptl.PIMS.Pages.EscortManagement.EscortAddUpdatePage;
import com.ptl.PIMS.Pages.EscortManagement.Calendar.CalendarInmateSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.Calendar.CalendarPage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionPage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeRegInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeRegPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class EscortCreateUpdateTest extends TestBase{
	
	EscortAddUpdatePage escortAddUpdate;

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
		
	    assertTrue(authorizeInmateSelect.successMessageAvaiable(), "Could not find Success Message in Admission Page.");
	    //	    
	    
		
		//Authorize Registration
		AuthorizeRegInmatePage authorizeRegInmateSelect = getTopMenu().gotoAuthorizeRegistrationPage();
		authorizeRegInmateSelect.doSearch(registrationNo, "", "");
		AuthorizeRegPage authorizeRegPage = authorizeRegInmateSelect.clickFirstInmate();
		authorizeRegInmateSelect = authorizeRegPage.authorizeInmate();
		
    	assertTrue(authorizeRegInmateSelect.successMessageAvaiable(), "Could not find Success Message in Registration Page.");
	}
	
	@Test(dataProvider = "getEscData", dependsOnMethods = "prepareEscortData")
	public void createCalendarRecord(Hashtable<String,String> data) {
		
		CalendarInmateSelectPage calendarPage = getTopMenu().gotoEscortCalendar();
		calendarPage = calendarPage.doSearch(registrationNo, "", "");		
		CalendarPage calendar = calendarPage.selectFirstInmate();
		
		calendarPage = calendar.addCourtDates(data.get("caseNos"), data.get("NCDate"));
		
		assertTrue(calendarPage.successMessageAvaiable(), "Success message was not found in Add Court Date To Calendar.");		
	}
	
	@Test(dataProvider = "getEscData", dependsOnMethods = "createCalendarRecord")
	public void createEscortHeader(Hashtable<String,String> data) {
		
		escortAddUpdate = getTopMenu().gotoEscortAddUpdate();
		EscortAddPage escortAdd = escortAddUpdate.goToCreateNewEscort();
		
		escortAdd = escortAdd.pickDate(data.get("NCDate"));
		escortAdd.extraEscortDetails(registrationNo, data.get("caseNos"), data.get("courts"), data.get("EscortDetail"));
		
		assertTrue(escortAddUpdate.successMessageAvaiable(), "Success message was not found in Escort Create.");		
	}
	@DataProvider
	public Object[][] getEscData() {
		return TestUtil.getTestData("Escort Test", xls);
	}
}
