package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateGoodAuthorizePage {
	public CreateGoodAuthorizePage(WebDriver dr){
		driver = dr;
	}
	WebDriver driver;
	@FindBy(xpath = Constants.AuthorizeGoodReceived)
	WebElement authorize;
	@FindBy(xpath = Constants.SuccessMessageGoodReceivedAuthorize)
	WebElement successMessagegoodreceived;

	public GoodReceivedAuthorizePage ClickAuthorizeButton(){
		authorize.click();
		GoodReceivedAuthorizePage goodreceivedauthorizepage = PageFactory.initElements(driver, GoodReceivedAuthorizePage.class);
		return goodreceivedauthorizepage;
	}
	public String getSuccessMessage(){

		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}*/

		return successMessagegoodreceived.getText();
	}	
}
