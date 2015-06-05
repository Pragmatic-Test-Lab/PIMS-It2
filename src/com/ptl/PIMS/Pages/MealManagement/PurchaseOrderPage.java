package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class PurchaseOrderPage extends CommonMethods{
	
	WebDriver driver;
	@FindBy(xpath = Constants.CreatePurchaseOrder)
	WebElement createpurchaseorder;
	
	public PurchaseOrderPage(WebDriver dr){
		driver = dr;
	}
	
	public CreatePurchaseOrderPage getCreatePurchaseOrderPage(){
		createpurchaseorder.click();
		CreatePurchaseOrderPage createpurchaseorderPage = PageFactory.initElements(driver, CreatePurchaseOrderPage.class);
		return createpurchaseorderPage;	
	}	

	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
