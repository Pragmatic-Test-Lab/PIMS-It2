package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddParticipantsVoc_ProgSelect extends VocationalSearch{

	public AddParticipantsVoc_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AddParticipantsVoc SelectFirstVOC(){
		
		VOCFirstRecord.click();
		AddParticipantsVoc VOCparticipantPage = PageFactory.initElements(driver, AddParticipantsVoc.class);		
		return VOCparticipantPage;		
	}	

}
