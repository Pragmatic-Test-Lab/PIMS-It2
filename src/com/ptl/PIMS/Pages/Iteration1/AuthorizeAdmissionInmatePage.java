package com.ptl.PIMS.Pages.Iteration1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;


public class AuthorizeAdmissionInmatePage extends SelectInmatePage{

	
	//first Inmate Select Button
	public AuthorizeAdmissionInmatePage(WebDriver dr) {
		driver = dr;
	}

	// clicks the first inmate in Table
	public AuthorizeAdmissionPage clickFirstInmate() {
		
		firstInmateLink.click();
		
		AuthorizeAdmissionPage authorizeAdmissionPage = PageFactory.initElements(driver, AuthorizeAdmissionPage.class);
		return authorizeAdmissionPage;
	}

	
}
