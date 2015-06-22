package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialEveningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialMorningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialEveningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialMorningPage;
import com.ptl.PIMS.TestCases.TestBase;

public class IndustrialAttendanceTest extends TestBase {
	
	CreateIndustrialMorningPage createmorning;
	IndustrialMorningPage industrialmorning;
	CreateIndustrialEveningPage createevening;
	IndustrialEveningPage industrialevening;


	@Test
	public void markIndustrialMorningTest() {
		
		loginToApplication();	
		
		industrialmorning = getTopMenu().gotoNewIndustrialMorning();
		createmorning = industrialmorning.ClickIndustryButton();
		
		createmorning.EnterAttendanceData("1 hour late","2 hour late");
		industrialmorning = createmorning.ClickCreateButton();

		assertTrue(industrialmorning.successMessageAvaiable(), "Success Message Not Found for Industrial Morning Attendance");	

	}
	
	@Test(dependsOnMethods="markIndustrialMorningTest")
	public void markIndustrialEveningTest() {
		
		industrialevening = topMenu.gotoNewIndustrialEvening();
		createevening = industrialevening.ClickEveningRecordButton();
		
		createevening.EnterAttendanceData("Sick and didn't attend","Sick and left after 30 minutes");
		industrialevening = createevening.ClickCreateButton();

		assertTrue(industrialevening.successMessageAvaiable(), "Success Message Not Found for Industrial Evening Attendance");	

	}


}
