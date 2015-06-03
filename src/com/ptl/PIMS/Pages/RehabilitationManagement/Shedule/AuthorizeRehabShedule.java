package com.ptl.PIMS.Pages.RehabilitationManagement.Shedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeRehabShedule {

	WebDriver driver;
	@FindBy(xpath = Constants.RehabilitationManagement_AuthorizeButton)
	public WebElement AuthorizeButton;

	public AuthorizeRehabShedule(WebDriver dr) {

		driver = dr;
	}
	
	public AuthorizeRehabSheduleSelectProg authorizeShedule(){
		
		AuthorizeButton.click();
		return PageFactory.initElements(driver, AuthorizeRehabSheduleSelectProg.class);
	}
	
	
}
