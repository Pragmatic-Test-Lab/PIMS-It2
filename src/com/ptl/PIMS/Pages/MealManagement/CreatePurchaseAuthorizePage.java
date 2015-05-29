package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreatePurchaseAuthorizePage {
	public CreatePurchaseAuthorizePage(WebDriver dr){
		driver = dr;
	}
	WebDriver driver;
	@FindBy(xpath = Constants.AuthorizePurchase)
	WebElement authorize;
	@FindBy(xpath = Constants.SuccessMessagePurchaseAuthorize)
	WebElement successMessagepurchaseauthorize;

	public PurchaseOrderAuthorizePage ClickAuthorizeButton(){
		authorize.click();
		PurchaseOrderAuthorizePage purchaseauthorizepage = PageFactory.initElements(driver, PurchaseOrderAuthorizePage.class);
		return purchaseauthorizepage;
	}
	public String getSuccessMessage(){

		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}*/

		return successMessagepurchaseauthorize.getText();
	}	
}
