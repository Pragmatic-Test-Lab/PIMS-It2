package com.ptl.PIMS.Pages.EscortManagement.TimeRecord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class EscortOutInAuthorizePage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.EscortManagement_AuthorizeButton)
	WebElement authorizeButton;
	
	public EscortOutInAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	
	public EscortOutInAuthorizeSelectPage authorizeRecord(){
		
		authorizeButton.click();
		return PageFactory.initElements(driver, EscortOutInAuthorizeSelectPage.class);
	}
	
}