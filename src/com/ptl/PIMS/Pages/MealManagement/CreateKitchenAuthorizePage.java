package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateKitchenAuthorizePage {
	public CreateKitchenAuthorizePage(WebDriver dr){
		driver = dr;
	}
	WebDriver driver;
	@FindBy(xpath = Constants.AuthorizeKitchen)
	WebElement authorize;
	@FindBy(xpath = Constants.SuccessMessageKitchenAuthorize)
	WebElement successMessageKitchenauthorize;

	public KitchenAuthorizePage ClickAuthorizeButton(){
		authorize.click();
		KitchenAuthorizePage kitchenauthorizepage = PageFactory.initElements(driver, KitchenAuthorizePage.class);
		return kitchenauthorizepage;
	}
	public String getSuccessMessage(){

		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}*/

		return successMessageKitchenauthorize.getText();
	}	
}
