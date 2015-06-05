package com.ptl.PIMS.TestCases.MealManagement;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateKitchenAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.CreateKitchenSlipPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.KitchenSlipPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class KitchenSlipTest extends TestBase {
	
	WebDriver driver;
	
	KitchenSlipPage kitchenslipPage;
	CreateKitchenSlipPage createkitchenslippage;
	
	KitchenAuthorizePage kitchenauthorizePage;
	CreateKitchenAuthorizePage createkitchenauthorizePage;
	
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
	public void createKitchenSlipTest() {
		
		mealId=createkitchenslippage.getKitchenSlipID();		
		createkitchenslippage.EnterKitchenSlipData("Dhal","200");
		kitchenslipPage = createkitchenslippage.ClickCreateButton();

		assertTrue(kitchenslipPage.successMessageAvaiable(), "Success Message Not Found in Create Kitchen Slip");	

	}


	@Test (dependsOnMethods="createKitchenSlipTest")  
	public void goToNewKitchenAuthorizePage(){

		kitchenauthorizePage = topMenu.gotoNewKitchenAuthorizePage();
		/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
		"Could not go to new demand order page.");*/
		
		createkitchenauthorizePage=kitchenauthorizePage.SearchKitchenOrder(mealId);		
		kitchenauthorizePage = createkitchenauthorizePage.ClickAuthorizeButton();

		assertTrue(kitchenauthorizePage.successMessageAvaiable(),	"Success Message Not Found in Authorize Kitchen Slip");	
	}

}
