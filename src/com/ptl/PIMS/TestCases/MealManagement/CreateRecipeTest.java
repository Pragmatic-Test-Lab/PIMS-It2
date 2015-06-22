	package com.ptl.PIMS.TestCases.MealManagement;

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
	public void createRecipe(){
		
		createrecipepage.EnterRecipeData("Dhal","200");	
		recipepage = createrecipepage.ClickCreateButton();

		assertTrue(recipepage.successMessageAvaiable(),	"Success Message not found in Recipe Create");
	}


	

}
