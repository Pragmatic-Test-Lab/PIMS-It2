package com.ptl.PIMS.Pages.Iteration1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;
import com.ptl.PIMS.util.Constants;


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
	
	public AuthorizeAdmissionPage selectSencondInmate(){
		
		driver.findElement(By.xpath(Constants.InmateSearch_TableFirstInmate.replace("1", "2"))).click();
		AuthorizeAdmissionPage authorizeAdmissionPage = PageFactory.initElements(driver, AuthorizeAdmissionPage.class);
		return authorizeAdmissionPage;
	}

	
}
