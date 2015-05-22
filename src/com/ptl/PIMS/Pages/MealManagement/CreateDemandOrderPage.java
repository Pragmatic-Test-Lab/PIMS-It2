package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.TestCases.MealManagement.CreateDemandOrderTest;
import com.ptl.PIMS.util.Constants;

public class CreateDemandOrderPage {
	
	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateDemand)
	WebElement createdemand;
	@FindBy(xpath = Constants.CreateDemandHeader)
	WebElement createdemandheader;
	
	
	public CreateDemandOrderPage(WebDriver dr){
		driver = dr;
	}
	
	public String getActualPageTitle(){
		return createdemandheader.getText();
	}
	
}
