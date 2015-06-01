package com.ptl.PIMS.Pages.RehabilitationManagement.Shedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.RehabilitationManagement.SearchRehabShedule;
import com.ptl.PIMS.util.Constants;

public class AuthorizeRehabSheduleSelectProg extends SearchRehabShedule {

	@FindBy(xpath = Constants.RehabilitationManagement_OkFirstRecord)
	public WebElement AuthSheduleFirstRecord;
	
	public AuthorizeRehabSheduleSelectProg(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeRehabShedule clickFirstShedule() {

		AuthSheduleFirstRecord.click();
		return PageFactory.initElements(driver, AuthorizeRehabShedule.class);
	}
}
