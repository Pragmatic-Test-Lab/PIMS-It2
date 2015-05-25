package com.ptl.PIMS.TestCases.MealManagement;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateRecipePage;
import com.ptl.PIMS.Pages.MealManagement.RecipePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateRecipeTest extends TestBase {
	
	RecipePage recipepage;
	CreateRecipePage createrecipepage;

	@Test   
	public void gotoNewRecipePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		recipepage = topMenu.gotoNewRecipePage();
		createrecipepage = recipepage.getCreateRecipePage();

		/*Assert.assertTrue(createNewDemandPage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
					"Could not go to new demand order page.");		*/
	}	

	@Test(dependsOnMethods="gotoNewRecipePage")
	public void fillRecipe(){
		createrecipepage.EnterRecipeData("PTL Kitchen Item"+ (new Random()).nextInt(5000),"PTL Kitchen Item sinhala"+ (new Random()).nextInt(5000), "PTL Kitchen Item tamil"+ (new Random()).nextInt(5000),"g","5");		
	}

	@Test(dependsOnMethods="fillRecipe")
	public void submitRecipeTest(){

		recipepage = createrecipepage.ClickCreateButton();


		Assert.assertTrue(createrecipepage.getSuccessMessage().matches(Constants.CreateRecipe_SuccessMessageText),
				"Recipe not created");				
	}

	

}
