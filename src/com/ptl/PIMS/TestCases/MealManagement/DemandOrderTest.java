package com.ptl.PIMS.TestCases.MealManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateDemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.CreateDemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.DemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;


public class DemandOrderTest extends TestBase {

	DemandOrderPage demandOrderPage;
	CreateDemandOrderPage createNewDemandPage;
	
	DemandAuthorizePage demandauthorizePage;
	CreateDemandAuthorizePage createdemandauthorizePage;

	@Test   
	public void goToNewDemandOrderPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		demandOrderPage = topMenu.gotoNewDemandOrderPage();
		createNewDemandPage = demandOrderPage.getCreateDemandOrderPage();

		assertTrue(createNewDemandPage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
	}	

	@Test(dependsOnMethods="goToNewDemandOrderPage")
	public void createDemandOrderTest() {
		
		mealId=createNewDemandPage.getDemandOrderID();
		demandOrderPage = createNewDemandPage.ClickCreateButton();

		assertTrue(demandOrderPage.successMessageAvaiable(), "Success message was not found  when Create Demand Order");				
}
	
	@Test(dependsOnMethods="createDemandOrderTest")
	public void demandOrderAuthorizeTest(){
		
		demandauthorizePage = topMenu.gotoNewDemandAuthorizePage();
		createdemandauthorizePage = demandauthorizePage.SearchDemandOrder(mealId);
		try {	Thread.sleep(5000); 	} catch (InterruptedException e) {}
		demandauthorizePage = createdemandauthorizePage.ClickAuthorizeButton();
		
		assertTrue(demandauthorizePage.successMessageAvaiable(), "Success message was not found  when Authorize Demand Order");				
	}


}
