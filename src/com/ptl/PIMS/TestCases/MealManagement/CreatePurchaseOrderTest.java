package com.ptl.PIMS.TestCases.MealManagement;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreatePurchaseOrderPage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreatePurchaseOrderTest extends TestBase {
	WebDriver driver;
	PurchaseOrderPage purchaseorderPage;
	CreatePurchaseOrderPage createpurchaseorderpage;
	
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
	public void submitPurchaseOrderTest() {
		System.out.println("Kitchen Slip:"+createpurchaseorderpage.getPurchaseOrderID());
		id=createpurchaseorderpage.getPurchaseOrderID();
		createpurchaseorderpage.EnterPurchaseOrderData("Lak Sathosa","Rice","200");
		purchaseorderPage = createpurchaseorderpage.ClickCreateButton();


		Assert.assertTrue(createpurchaseorderpage.getSuccessMessage().matches(Constants.CreatePurchaseOrder_SuccessMessageText),
				"Purchase Order not created");	

	}

	
}
