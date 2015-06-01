package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialEveningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialEveningPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class IndustrialEveningTest extends TestBase{
	CreateIndustrialEveningPage createevening;
	IndustrialEveningPage industrialevening;

	@Test   
	public void goToIndustrialEveningPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		industrialevening = topMenu.gotoNewIndustrialEvening();
		createevening = industrialevening.ClickEveningRecordButton();

	}	

	@Test(dependsOnMethods="goToIndustrialEveningPage")
	public void submitIndustrialEveningTest() {
		createevening.EnterAttendanceData("Sick and didn't attend","Sick and left after 30 minutes");
		industrialevening = createevening.ClickCreateButton();


		Assert.assertTrue(createevening.getSuccessMessage().matches(Constants.CreateIndustrialEveningSuccessMessageText),
				"Industrial morning not created");	

	}

}
