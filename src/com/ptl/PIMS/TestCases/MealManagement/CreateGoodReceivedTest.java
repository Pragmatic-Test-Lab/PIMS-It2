package com.ptl.PIMS.TestCases.MealManagement;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateGoodReceivedPage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateGoodReceivedTest extends TestBase {
	GoodReceivedPage goodreceivedpage;
	CreateGoodReceivedPage creategoodreceivedPage;

	@Test   
	public void goToNewGoodReceivedAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		goodreceivedpage = topMenu.gotogoodreceivedPage();
		
		creategoodreceivedPage=goodreceivedpage.SearchGoodReceived(id);
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	
	@Test(dependsOnMethods="goToNewGoodReceivedAuthorizePage")
	public void fillGoodReceivedQuantity(){
		creategoodreceivedPage.EnterGoodReceivedData("190");		
	}
	
	
	@Test(dependsOnMethods="fillGoodReceivedQuantity")
	public void submitGoodReceivedTest(){

		goodreceivedpage = creategoodreceivedPage.ClickCreateButton();


		Assert.assertTrue(creategoodreceivedPage.getSuccessMessage().matches(Constants.AuthorizeGoodReceived_SuccessMessageText),
				"Kitchen slip not authorised");				
	}

}
