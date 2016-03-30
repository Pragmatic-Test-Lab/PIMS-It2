package com.ptl.PIMS.Pages.VocationalTraining;

import com.ptl.PIMS.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeVocParticipants_ProgSelect extends VocationalSearch{

	
	public AuthorizeVocParticipants_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVocParticipants SelectFirstVOC(){

		waitForJSandJQueryToLoad(driver);
		waitAndClick(driver, Constants.VOCManagement_FirstAuthRecord);
		AuthorizeVocParticipants VOCParticipantAuthPage = PageFactory.initElements(driver, AuthorizeVocParticipants.class);		
		return VOCParticipantAuthPage;		
	}
}
