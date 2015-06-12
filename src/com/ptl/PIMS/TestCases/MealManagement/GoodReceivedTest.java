package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateGoodAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.CreateGoodReceivedPage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedPage;
import com.ptl.PIMS.TestCases.TestBase;

public class GoodReceivedTest extends TestBase {
	
	GoodReceivedPage goodreceivedpage;
	CreateGoodReceivedPage creategoodreceivedPage;
	
	GoodReceivedAuthorizePage goodreceivedauthorizePage;
	CreateGoodAuthorizePage creategoodauthorizePage;

	@Test   
	public void goToNewGoodReceivedPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		goodreceivedpage = topMenu.gotogoodreceivedPage();		
		creategoodreceivedPage=goodreceivedpage.SearchGoodReceived(mealId);
	}
	
	@Test(dependsOnMethods="goToNewGoodReceivedPage")
	public void createGoodReceivedTest(){
		creategoodreceivedPage.EnterGoodReceivedData("190");	
		goodreceivedpage = creategoodreceivedPage.ClickCreateButton();

		assertTrue(goodreceivedpage.successMessageAvaiable(), "Success Message not Found in Good Received Create.");	
	}
	
	@Test(dependsOnMethods="createGoodReceivedTest")
	public void authorizeGoodReceivedTest(){

		goodreceivedauthorizePage = topMenu.gotoGoodReceivedAuthorizePage();
		creategoodauthorizePage = goodreceivedauthorizePage.SearchGoodReceived(mealId);
		goodreceivedauthorizePage = creategoodauthorizePage.ClickAuthorizeButton();

		assertTrue(goodreceivedauthorizePage.successMessageAvaiable(), "Success Message not Found in Good Received Authorize.");

	}



}
