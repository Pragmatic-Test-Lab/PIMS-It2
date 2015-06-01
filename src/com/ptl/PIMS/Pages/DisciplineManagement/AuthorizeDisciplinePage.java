package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeDisciplinePage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.DisciplineManagement_AuthorizeButton)
	public WebElement authorizeButton;

	public AuthorizeDisciplinePage(WebDriver dr){
		
		driver = dr;
	}
	
	public AuthorizeDiscipline_SelectRecordPage authorizeRecord(){
		
		authorizeButton.click();
		return PageFactory.initElements(driver, AuthorizeDiscipline_SelectRecordPage.class);
	}
}
