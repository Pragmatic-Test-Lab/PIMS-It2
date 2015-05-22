package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ptl.PIMS.util.Constants;

public class CreateSupplierPage {
	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateDemand)
	WebElement createdemand;
	
	
	public CreateSupplierPage(WebDriver dr){
		driver = dr;
	}
}
