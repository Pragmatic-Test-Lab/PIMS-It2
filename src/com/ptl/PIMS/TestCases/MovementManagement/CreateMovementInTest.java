package com.ptl.PIMS.TestCases.MovementManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementInPage;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.MovementInPage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateMovementInTest extends TestBase {
	MovementInPage movementinPage;
	CreateMovementInPage createmovementinPage;

	@Test   
	public void goToMovementInPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		movementinPage = topMenu.gotomovementInPage();
		
		createmovementinPage=movementinPage.getCreateMovementInPage();
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToMovementInPage")
	public void submitMovementinTest(){
		createmovementinPage.EnterMovementData();
		movementinPage = createmovementinPage.ClickCreateButton();


		Assert.assertTrue(createmovementinPage.getSuccessMessage().matches(Constants.MovementIn_SuccessMessageText),
				"Kitchen slip not authorised");				
	}

}
