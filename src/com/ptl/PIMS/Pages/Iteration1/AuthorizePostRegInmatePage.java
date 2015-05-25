package com.ptl.PIMS.Pages.Iteration1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ptl.PIMS.Pages.SelectInmatePage;

public class AuthorizePostRegInmatePage extends SelectInmatePage{
	
	
	public AuthorizePostRegInmatePage(WebDriver dr){
		driver = dr;
	}
	
	// clicks the first inmate in Table
	public AuthorizePostRegPage clickFirstInmate() {
		
		firstInmateLink.click();
		
		AuthorizePostRegPage authorizePostRegUserPage = PageFactory
				.initElements(driver, AuthorizePostRegPage.class);
		return authorizePostRegUserPage;
	}


}
