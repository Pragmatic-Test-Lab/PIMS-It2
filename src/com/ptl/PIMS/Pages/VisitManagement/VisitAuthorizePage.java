package com.ptl.PIMS.Pages.VisitManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class VisitAuthorizePage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.VisitManagement_AuthorizeButton)
	public WebElement authorizeButton;
	
	public VisitAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	public VisitAuthorizeSelectionPage authorizeVisit(){
		
		authorizeButton.click();
		return PageFactory.initElements(driver, VisitAuthorizeSelectionPage.class);
	}

}
