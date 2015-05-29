package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreatePurchaseAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreatePurchaseAuthorizeTest extends TestBase {
	PurchaseOrderAuthorizePage purchaseauthorizePage;
	CreatePurchaseAuthorizePage createpurchaseauthorizePage;

	@Test   
	public void goToNewPurchaseAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		purchaseauthorizePage = topMenu.gotoNewPurchaseAuthorizePage();
		
		createpurchaseauthorizePage=purchaseauthorizePage.SearchPurchaseOrder(id);
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToNewPurchaseAuthorizePage")
	public void submitPurchaseAuthorizeTest(){

		purchaseauthorizePage = createpurchaseauthorizePage.ClickAuthorizeButton();


		Assert.assertTrue(createpurchaseauthorizePage.getSuccessMessage().matches(Constants.AuthorizePurchase_SuccessMessageText),
				"Purchase Order not authorised");				
	}
}
