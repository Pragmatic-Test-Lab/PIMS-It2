package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateKitchenAuthorizePage{

	WebDriver driver;
	
	@FindBy(xpath = Constants.AuthorizeKitchen)
	WebElement authorize;
	@FindBy(xpath = Constants.SuccessMessageKitchenAuthorize)
	WebElement successMessageKitchenauthorize;

	public CreateKitchenAuthorizePage(WebDriver dr){
		driver = dr;
	}
	
	public KitchenAuthorizePage ClickAuthorizeButton(){
		authorize.click();
		KitchenAuthorizePage kitchenauthorizepage = PageFactory.initElements(driver, KitchenAuthorizePage.class);
		return kitchenauthorizepage;
	}

 
}
