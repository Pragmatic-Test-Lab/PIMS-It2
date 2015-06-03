package com.ptl.PIMS.TestCases.MovementManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementInAuthorize;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.MovementInAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateMovementInAuthorizeTest extends TestBase {
	MovementInAuthorizePage movementinauthorizePage;
	CreateMovementInAuthorize createmovementinauthorizePage;

	@Test   
	public void goToMovementOutAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		movementinauthorizePage = topMenu.gotomovementinAuthorizePage();
		
		createmovementinauthorizePage=movementinauthorizePage.getCreateMovementInAuthorizePage();
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToMovementOutAuthorizePage")
	public void submitmovementoutAuthorizeTest(){

		movementinauthorizePage = createmovementinauthorizePage.ClickAuthorizeButton();


		Assert.assertTrue(createmovementinauthorizePage.getSuccessMessage().matches(Constants.AuthorizeMovementIn_SuccessMessageText),
				"Movement In not authorised");				
	}

}
