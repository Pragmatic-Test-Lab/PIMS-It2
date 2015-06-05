package com.ptl.PIMS.Pages.EscortManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class EscortAuthorizePage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.EscortManagement_AuthorizeButton)
	WebElement authorizeButton;
	
	public EscortAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	
	public EscortAuthorizeSelectPage authorizeRecord(){
		
		authorizeButton.click();
		return PageFactory.initElements(driver, EscortAuthorizeSelectPage.class);
	}
	

}
