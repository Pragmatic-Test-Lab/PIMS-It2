package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeVocParticipants_ProgSelect extends VocationalSearch{

	public AuthorizeVocParticipants_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVocParticipants SelectFirstVOC(){
		
		VOCFirstRecord.click();
		AuthorizeVocParticipants VOCParticipantAuthPage = PageFactory.initElements(driver, AuthorizeVocParticipants.class);		
		return VOCParticipantAuthPage;		
	}
}
