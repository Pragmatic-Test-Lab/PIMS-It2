package com.ptl.PIMS.Pages.Iteration1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizePostRegPage {
	
	WebDriver driver;

	@FindBy(xpath=Constants.AuthorizeButton)
	WebElement authorize;
	
	
	public AuthorizePostRegPage(WebDriver dr){
		driver=dr;
	}	
	
	public AuthorizePostRegInmatePage ClickAuthorizeButton(){
		authorize.click();
		AuthorizePostRegInmatePage postRegAuthorizePage = PageFactory.initElements(driver, AuthorizePostRegInmatePage.class);
		return postRegAuthorizePage;
	}
}
