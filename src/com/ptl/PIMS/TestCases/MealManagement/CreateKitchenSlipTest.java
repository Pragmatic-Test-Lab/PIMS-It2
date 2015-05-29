package com.ptl.PIMS.TestCases.MealManagement;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateKitchenSlipPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenSlipPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateKitchenSlipTest extends TestBase {
	WebDriver driver;
	KitchenSlipPage kitchenslipPage;
	CreateKitchenSlipPage createkitchenslippage;

	@Test   
	public void goToNewKitchenSlipPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		kitchenslipPage = topMenu.gotoNewKitchenSlipPage();
		createkitchenslippage = kitchenslipPage.getCreateKitchenSlipPage();

		/*Assert.assertTrue(createkitchenslippage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		*/
	}	

	@Test(dependsOnMethods="goToNewKitchenSlipPage")
	public void fillKitchenSlip(){

	}

	@Test(dependsOnMethods="fillKitchenSlip")
	public void submitKitchenSlipTest() {
		System.out.println("Kitchen Slip:"+createkitchenslippage.getKitchenSlipID());
		id=createkitchenslippage.getKitchenSlipID();
		createkitchenslippage.EnterKitchenSlipData("Dhal","200");
		kitchenslipPage = createkitchenslippage.ClickCreateButton();


		Assert.assertTrue(createkitchenslippage.getSuccessMessage().matches(Constants.CreateKitchenSlip_SuccessMessageText),
				"Kitchen Slip not created");	

	}
}
