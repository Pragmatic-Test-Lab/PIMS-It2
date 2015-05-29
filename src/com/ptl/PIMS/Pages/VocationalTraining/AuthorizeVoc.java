package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeVoc {
	
	WebDriver driver;

	@FindBy(xpath = Constants.AuthVOC_AuthorizeButton)
	public WebElement AuthorizeButton;
	
	
	public AuthorizeVoc(WebDriver dr){
		driver = dr;		
	}
	
	
	public AuthorizeVoc_ProgSelect doAuthorization(){
		
		AuthorizeButton.click();
		
		AuthorizeVoc_ProgSelect vocAuthMainPage = PageFactory.initElements(driver, AuthorizeVoc_ProgSelect.class);		
		return vocAuthMainPage;
		
	}
}
