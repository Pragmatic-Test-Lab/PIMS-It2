package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateGoodAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateGoodAuthorizedTest extends TestBase {
	GoodReceivedAuthorizePage goodreceivedauthorizePage;
	CreateGoodAuthorizePage creategoodauthorizePage;

	@Test   
	public void goToNewGoodAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		goodreceivedauthorizePage = topMenu.gotoGoodReceivedAuthorizePage();
		
		creategoodauthorizePage=goodreceivedauthorizePage.SearchGoodReceived(id);
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToNewGoodAuthorizePage")
	public void submitGoodAuthorizeTest(){

		goodreceivedauthorizePage = creategoodauthorizePage.ClickAuthorizeButton();


		Assert.assertTrue(creategoodauthorizePage.getSuccessMessage().matches(Constants.AuthorizeGoodReceived_SuccessMessageText),
				"Good Received Note not authorised");				
	}
}
