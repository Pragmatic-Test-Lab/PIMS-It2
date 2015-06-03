package com.ptl.PIMS.TestCases.MovementManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateKitchenAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.KitchenAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateMovementAuthorizeTest extends TestBase {
	MovementOutAuthorizePage movementoutauthorizePage;
	CreateMovementOutAuthorizePage createmovementoutauthorizePage;

	@Test   
	public void goToNewKitchenAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		movementoutauthorizePage = topMenu.gotomovementAuthorizePage();
		
		createmovementoutauthorizePage=movementoutauthorizePage.getCreateMovementOutAuthorizePage();
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToNewKitchenAuthorizePage")
	public void submitKitchenAuthorizeTest(){

		movementoutauthorizePage = createmovementoutauthorizePage.ClickAuthorizeButton();


		Assert.assertTrue(createmovementoutauthorizePage.getSuccessMessage().matches(Constants.AuthorizeMovement_SuccessMessageText),
				"Kitchen slip not authorised");				
	}

}
