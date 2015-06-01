package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeActionPlanPage{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_AuthorizeButton)
	public WebElement authButton;
	
	public AuthorizeActionPlanPage(WebDriver dr){
		driver = dr;
	}
	
	public AuthorizeActionPlanSelectPage AuthorizeAP(){
		
		authButton.click();
		return PageFactory.initElements(driver, AuthorizeActionPlanSelectPage.class);
	}
	
}
