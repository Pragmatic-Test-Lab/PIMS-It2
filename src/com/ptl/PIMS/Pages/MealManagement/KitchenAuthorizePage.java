package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class KitchenAuthorizePage {
	public KitchenAuthorizePage(WebDriver dr){
		driver = dr;
	}
	WebDriver driver;
	@FindBy(xpath = Constants.KitchenOrderNo)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectKitchenOrder)
	WebElement selectkitchenorder;
	
	public CreateKitchenAuthorizePage SearchKitchenOrder(String id){
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		selectkitchenorder.click();
		CreateKitchenAuthorizePage createNewKitchenauthorizePage = PageFactory.initElements(driver, CreateKitchenAuthorizePage.class);
		return createNewKitchenauthorizePage;	
	}
}
