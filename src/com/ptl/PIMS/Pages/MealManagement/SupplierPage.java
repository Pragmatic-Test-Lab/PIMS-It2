package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class SupplierPage {

	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateSupplier)
	WebElement createsupplier;

	
	public SupplierPage(WebDriver dr){
		driver = dr;
	}
	public CreateSupplierPage getCreateSupplierPage(){
		createsupplier.click();
		CreateSupplierPage createsupplierPage = PageFactory.initElements(driver, CreateSupplierPage.class);
		return createsupplierPage;	
	}
	
}
