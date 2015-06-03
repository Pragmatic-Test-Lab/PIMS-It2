package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialEveningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialTrainingPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialEveningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialTrainingPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class IndustrialTrainingTest extends TestBase{
	CreateIndustrialTrainingPage createtraining;
	IndustrialTrainingPage industrialtraining;

	@Test   
	public void goToIndustrialTrainingPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		industrialtraining = topMenu.gotoNewIndustrialTraining();
		createtraining = industrialtraining.ClickTrainingRecordButton();

	}	

	@Test(dependsOnMethods="goToIndustrialTrainingPage")
	public void submitIndustrialEveningTest() {
		createtraining.EnterTrainingData("chair","3","Grade 2","agriculture","wood");
		industrialtraining = createtraining.ClickCreateButton();


		Assert.assertTrue(createtraining.getSuccessMessage().matches(Constants.CreateIndustrialTrainingSuccessMessageText),
				"Industrial training not created");	

	}


}
