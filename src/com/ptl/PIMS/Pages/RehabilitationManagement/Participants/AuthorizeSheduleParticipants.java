package com.ptl.PIMS.Pages.RehabilitationManagement.Participants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.AuthorizeRehabSheduleSelectProg;
import com.ptl.PIMS.util.Constants;

public class AuthorizeSheduleParticipants {

	WebDriver driver;
	@FindBy(xpath = Constants.RehabilitationManagement_AuthorizeButton)
	public WebElement AuthorizeButton;

	public AuthorizeSheduleParticipants(WebDriver dr) {

		driver = dr;
	}
	
	public AuthorizeSheduleParticipantsSelectProg authorizeShedule(){
		
		AuthorizeButton.click();
		return PageFactory.initElements(driver, AuthorizeSheduleParticipantsSelectProg.class);
	}
}
