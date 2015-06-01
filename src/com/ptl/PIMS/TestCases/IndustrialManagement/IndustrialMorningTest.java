package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialMorningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialMorningPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class IndustrialMorningTest extends TestBase {
	CreateIndustrialMorningPage createmorning;
	IndustrialMorningPage industrialmorning;

	@Test   
	public void goToIndustrialMorningPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		industrialmorning = topMenu.gotoNewIndustrialMorning();
		createmorning = industrialmorning.ClickIndustryButton();
		
	}	

	@Test(dependsOnMethods="goToIndustrialMorningPage")
	public void submitIndustrialMorningTest() {
		createmorning.EnterAttendanceData("1 hour late","2 hour late");
		industrialmorning = createmorning.ClickCreateButton();


		Assert.assertTrue(createmorning.getSuccessMessage().matches(Constants.CreateIndustrialMorningSuccessMessageText),
				"Industrial morning not created");	

	}


}
