package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateDemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.CreateKitchenAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.DemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.KitchenAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateKitchenAuthorizeTest extends TestBase {
	KitchenAuthorizePage kitchenauthorizePage;
	CreateKitchenAuthorizePage createkitchenauthorizePage;

	@Test   
	public void goToNewKitchenAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		kitchenauthorizePage = topMenu.gotoNewKitchenAuthorizePage();
		
		createkitchenauthorizePage=kitchenauthorizePage.SearchKitchenOrder(id);
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToNewKitchenAuthorizePage")
	public void submitKitchenAuthorizeTest(){

		kitchenauthorizePage = createkitchenauthorizePage.ClickAuthorizeButton();


		Assert.assertTrue(createkitchenauthorizePage.getSuccessMessage().matches(Constants.AuthorizeKitchen_SuccessMessageText),
				"Kitchen slip not authorised");				
	}

}
