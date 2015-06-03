package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateWagesPage;
import com.ptl.PIMS.Pages.IndustrialManagement.WagesPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateWagesTest extends TestBase{
	CreateWagesPage createwages;
	WagesPage wages;

	@Test   
	public void goToWagesPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		wages = topMenu.gotowages();
		createwages = wages.ClickIndustrialWages();

	}	

	@Test(dependsOnMethods="goToWagesPage")
	public void submitIndustrialWagesTest() {
		createwages.EnterWagesData("8","1","0.5");
		wages = createwages.ClickUpdateButton();


		Assert.assertTrue(createwages.getSuccessMessage().matches(Constants.CreateWagesSuccessMessageText),
				"Industrial wages not created");	

	}


}
