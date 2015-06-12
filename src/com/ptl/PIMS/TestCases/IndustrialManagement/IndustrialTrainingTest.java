package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.IndustrialManagement.CreateIndustrialTrainingPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialTrainingPage;
import com.ptl.PIMS.TestCases.TestBase;

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

		assertTrue(industrialtraining.successMessageAvaiable(),	"Success message not found in Industrial Training Add/Update");	
	}


}
