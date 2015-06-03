package com.ptl.PIMS.Pages.IncidenceManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class IncidenceAuthorizePage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.IncidenceManagement_AuthorizeButton)
	public WebElement authorizeButton;
	
	public IncidenceAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	public IncidenceAuthorizeInmateSelectionPage authorizeRecord(){
		
		authorizeButton.click();
		
		return PageFactory.initElements(driver, IncidenceAuthorizeInmateSelectionPage.class);
	}
	
	
}
