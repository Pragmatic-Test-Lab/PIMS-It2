package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class SupplierPage extends CommonMethods{

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
	

	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
	
}
