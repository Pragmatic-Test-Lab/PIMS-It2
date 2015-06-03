package com.ptl.PIMS.Pages.RehabilitationManagement.Participants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.RehabilitationManagement.SearchRehabShedule;

public class AddParticipantsSelectProg extends SearchRehabShedule{

	
	public AddParticipantsSelectProg(WebDriver dr){
		
		driver = dr;
	}
	
	public AddParticipantsPage addParticipantsToSchedule(){
		
		SheduleFirstRecord.click();
		return PageFactory.initElements(driver, AddParticipantsPage.class);
	}
	
	
}
