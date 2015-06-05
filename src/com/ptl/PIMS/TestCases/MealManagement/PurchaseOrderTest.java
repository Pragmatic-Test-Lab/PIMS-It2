package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreatePurchaseAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.CreatePurchaseOrderPage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderPage;
import com.ptl.PIMS.TestCases.TestBase;

public class PurchaseOrderTest extends TestBase {
	
	PurchaseOrderPage purchaseorderPage;
	CreatePurchaseOrderPage createpurchaseorderpage;

	PurchaseOrderAuthorizePage purchaseauthorizePage;
	CreatePurchaseAuthorizePage createpurchaseauthorizePage;	
	
	@Test   
	public void goToNewPurchaseOrderPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		purchaseorderPage = topMenu.gotoNewPurchaseOrderPage();
		createpurchaseorderpage = purchaseorderPage.getCreatePurchaseOrderPage();

		/*Assert.assertTrue(createkitchenslippage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		*/
	}		

	@Test(dependsOnMethods="goToNewPurchaseOrderPage")
	public void createPurchaseOrderTest() {
		
		mealId = createpurchaseorderpage.getPurchaseOrderID();
		createpurchaseorderpage.EnterPurchaseOrderData("Lak Sathosa","Rice","200");
		purchaseorderPage = createpurchaseorderpage.ClickCreateButton();		

		assertTrue(purchaseorderPage.successMessageAvaiable(), "Success Message Not Found in Create Purchase Order");	

	}

	@Test(dependsOnMethods="createPurchaseOrderTest")
	public void authorizePurchaseOrder(){

		purchaseauthorizePage = topMenu.gotoNewPurchaseAuthorizePage();
		/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
		"Could not go to new demand order page.");*/
		
		createpurchaseauthorizePage=purchaseauthorizePage.SearchPurchaseOrder(mealId);
		purchaseauthorizePage = createpurchaseauthorizePage.ClickAuthorizeButton();

		assertTrue(purchaseauthorizePage.successMessageAvaiable(),"Success Message Not Found in Authorize Purchase Order");		

	}

}
