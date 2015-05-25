package com.ptl.PIMS.Pages.Iteration1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;


public class AuthorizeRegInmatePage extends SelectInmatePage {

	public AuthorizeRegInmatePage(WebDriver dr) {
		driver = dr;
	}

	// clicks the first inmate in Table
	public AuthorizeRegPage clickFirstInmate() {
		
		firstInmateLink.click();
		
		AuthorizeRegPage allocateLocation = PageFactory.initElements(driver, AuthorizeRegPage.class);
		return allocateLocation;
	}


	
}
