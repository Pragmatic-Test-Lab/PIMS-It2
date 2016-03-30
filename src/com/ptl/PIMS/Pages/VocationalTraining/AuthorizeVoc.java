package com.ptl.PIMS.Pages.VocationalTraining;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeVoc extends CommonMethods {
	
	WebDriver driver;
	
	public AuthorizeVoc(WebDriver dr){
		driver = dr;		
	}
	
	
	public AuthorizeVoc_ProgSelect doAuthorization(){

		waitAndClick(driver, Constants.AuthVOC_AuthorizeButton);
		
		AuthorizeVoc_ProgSelect vocAuthMainPage = PageFactory.initElements(driver, AuthorizeVoc_ProgSelect.class);		
		return vocAuthMainPage;
		
	}
}
