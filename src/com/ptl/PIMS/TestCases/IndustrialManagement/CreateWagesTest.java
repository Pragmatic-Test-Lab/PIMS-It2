package com.ptl.PIMS.TestCases.IndustrialManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.IndustrialManagement.CreateWagesPage;
import com.ptl.PIMS.Pages.IndustrialManagement.WagesPage;
import com.ptl.PIMS.TestCases.TestBase;

public class CreateWagesTest extends TestBase{
	
	CreateWagesPage createwages;
	WagesPage wages;

	@Test   
	public void industrialWagesTest() {
		
		loginToApplication();
		wages = getTopMenu().gotowages();
		
		createwages = wages.ClickIndustrialWages();
		createwages.EnterWagesData("8","1","0.5");
		wages = createwages.ClickUpdateButton();

		assertTrue(wages.successMessageAvaiable(),"Success Message Not Found in Wage Create");	

	}


}
