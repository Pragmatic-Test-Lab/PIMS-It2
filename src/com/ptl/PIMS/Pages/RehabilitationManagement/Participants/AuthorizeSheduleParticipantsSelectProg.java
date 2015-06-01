package com.ptl.PIMS.Pages.RehabilitationManagement.Participants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.RehabilitationManagement.SearchRehabShedule;
import com.ptl.PIMS.util.Constants;

public class AuthorizeSheduleParticipantsSelectProg extends SearchRehabShedule{

	@FindBy(xpath = Constants.RehabilitationManagement_OkFirstRecord)
	public WebElement SheduleFirstRecord;
	
	public AuthorizeSheduleParticipantsSelectProg(WebDriver dr){
		
		driver = dr;
	}
	
	public AuthorizeSheduleParticipants authParticipants(){
		
		SheduleFirstRecord.click();
		return PageFactory.initElements(driver, AuthorizeSheduleParticipants.class);
	}
}
