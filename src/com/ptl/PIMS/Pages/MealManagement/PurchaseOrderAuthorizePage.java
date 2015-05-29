package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class PurchaseOrderAuthorizePage {
	public PurchaseOrderAuthorizePage(WebDriver dr){
		driver = dr;
	}
	WebDriver driver;
	@FindBy(xpath = Constants.PurchaseOrderNo)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectPurchaseOrder)
	WebElement selectpurchaseorder;
	
	public CreatePurchaseAuthorizePage SearchPurchaseOrder(String id){
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		selectpurchaseorder.click();
		CreatePurchaseAuthorizePage createNewPurchaseauthorizePage = PageFactory.initElements(driver, CreatePurchaseAuthorizePage.class);
		return createNewPurchaseauthorizePage;	
	}

}
