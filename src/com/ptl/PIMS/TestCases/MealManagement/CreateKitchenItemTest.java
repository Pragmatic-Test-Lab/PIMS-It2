package com.ptl.PIMS.TestCases.MealManagement;

import java.util.Random;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateKitchenItemPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenItemPage;
import com.ptl.PIMS.TestCases.TestBase;

public class CreateKitchenItemTest extends TestBase {

	KitchenItemPage kitchenitempage;
	CreateKitchenItemPage createkitchenitempage;

	@Test   
	public void goToNewKitchenItemPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		kitchenitempage = topMenu.gotoNewKitchenItemPage();
		createkitchenitempage = kitchenitempage.getCreateKitchenItemPage();

		/*Assert.assertTrue(createNewDemandPage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
					"Could not go to new demand order page.");		*/
	}	

	@Test(dependsOnMethods="goToNewKitchenItemPage")
	public void createKitchenItem(){
		
		int rando = (new Random()).nextInt(5000);
		createkitchenitempage.EnterKitchenItemData("PTL Kitchen Item"+ rando,"PTL Kitchen Item sinhala"+ rando, "PTL Kitchen Item tamil"+ rando,"g","5");
		kitchenitempage = createkitchenitempage.ClickCreateButton();


		assertTrue(kitchenitempage.successMessageAvaiable(), "Success Message Not Found in Create Kitchen Item");
	}


}
