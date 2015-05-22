package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class KitchenItemPage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.CreateKitchenItem)
	WebElement createkitchenitem;
	

	
	public KitchenItemPage(WebDriver dr){
		driver = dr;
	}
	public CreateKitchenItemPage getCreateKitchenItemPage(){
		createkitchenitem.click();
		CreateKitchenItemPage createsupplierPage = PageFactory.initElements(driver, CreateKitchenItemPage.class);
		return createsupplierPage;	
	}
	
	
	
	
}
