package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class PurchaseOrderPage {
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
}
