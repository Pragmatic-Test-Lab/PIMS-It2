package com.ptl.PIMS.Pages.IncidenceManagement.Recapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class RecaptureAuthorizePage{

	WebDriver driver;
	
	@FindBy(xpath = Constants.IncidenceManagement_AuthorizeButton)
	public WebElement authorizeButton;
	
	public RecaptureAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	public RecaptureAuthorizeSelectionPage authorizeRecapture(){
		
		authorizeButton.click();
		
		return PageFactory.initElements(driver, RecaptureAuthorizeSelectionPage.class);
	}
	
}
