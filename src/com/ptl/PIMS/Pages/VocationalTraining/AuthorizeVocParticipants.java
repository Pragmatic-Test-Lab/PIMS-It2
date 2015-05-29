package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeVocParticipants {

	WebDriver driver;

	@FindBy(xpath = Constants.VOCParticipantsAuth_AuthorizeButton)
	public WebElement AuthorizeButton;

	public AuthorizeVocParticipants(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVocParticipants_ProgSelect doAuthorization() {

		AuthorizeButton.click();

		AuthorizeVocParticipants_ProgSelect vocPartAuthMainPage = PageFactory.initElements(
				driver, AuthorizeVocParticipants_ProgSelect.class);
		return vocPartAuthMainPage;

	}

}
