package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateDemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.CreateDemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.DemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class DemandAuthorizeTest extends TestBase {
	DemandAuthorizePage demandauthorizePage;
	CreateDemandAuthorizePage createdemandauthorizePage;

	@Test   
	public void goToNewDemandAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		demandauthorizePage = topMenu.gotoNewDemandAuthorizePage();
		//createdemandauthorizePage = demandauthorizePage.getCreateDemandOrderPage();
		createdemandauthorizePage=demandauthorizePage.SearchDemandOrder(id);
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToNewDemandAuthorizePage")
	public void submitDemandAuthorizeTest(){

		demandauthorizePage = createdemandauthorizePage.ClickAuthorizeButton();


		Assert.assertTrue(createdemandauthorizePage.getSuccessMessage().matches(Constants.AuthorizeDemandOrder_SuccessMessageText),
				"Demand Order not created");				
	}

}