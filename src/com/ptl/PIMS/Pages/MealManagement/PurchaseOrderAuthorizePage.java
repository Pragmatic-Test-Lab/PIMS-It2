package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class PurchaseOrderAuthorizePage extends CommonMethods{

	WebDriver driver;
	@FindBy(xpath = Constants.PurchaseOrderNo)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectPurchaseOrder)
	WebElement selectpurchaseorder;
	
	public PurchaseOrderAuthorizePage(WebDriver dr){
		driver = dr;
	}
	public CreatePurchaseAuthorizePage SearchPurchaseOrder(String id){
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		try {	Thread.sleep(6000); 	} catch (InterruptedException e) {}
		selectpurchaseorder.click();
		CreatePurchaseAuthorizePage createNewPurchaseauthorizePage = PageFactory.initElements(driver, CreatePurchaseAuthorizePage.class);
		return createNewPurchaseauthorizePage;	
	}

	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
