package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.Pages.MealManagement.CreateDemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;


public class CreateDemandOrderTest extends TestBase {

	DemandOrderPage demandOrderPage;
	CreateDemandOrderPage createNewDemandPage;

	@Test   
	public void goToNewDemandOrderPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		demandOrderPage = topMenu.gotoNewDemandOrderPage();
		createNewDemandPage = demandOrderPage.getCreateDemandOrderPage();

		Assert.assertTrue(createNewDemandPage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
	}	

	@Test(dependsOnMethods="goToNewDemandOrderPage")
	public void submitDemandOrderTest() {
		System.out.println("demand number:"+createNewDemandPage.getDemandOrderID());
		id=createNewDemandPage.getDemandOrderID();
		demandOrderPage = createNewDemandPage.ClickCreateButton();


		Assert.assertTrue(createNewDemandPage.getSuccessMessage().matches(Constants.CreateDemandOrder_SuccessMessageText),
				"Demand Order not created");	

	}


}
