package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeVocParticipants_ProgSelect extends VocationalSearch{

	@FindBy(xpath = Constants.VOCManagement_FirstAuthRecord)
	public WebElement VOCAuthFirstRecord;
	
	public AuthorizeVocParticipants_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVocParticipants SelectFirstVOC(){
		
		VOCAuthFirstRecord.click();
		AuthorizeVocParticipants VOCParticipantAuthPage = PageFactory.initElements(driver, AuthorizeVocParticipants.class);		
		return VOCParticipantAuthPage;		
	}
}
