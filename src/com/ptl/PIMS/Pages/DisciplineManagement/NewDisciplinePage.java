package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class NewDisciplinePage extends CommonDisciplineElements{

	@FindBy(xpath = Constants.DisciplineManagement_CreateButton)
	WebElement createButton;
	
	public NewDisciplinePage(WebDriver dr){
		
		driver = dr;
	}
	
	public EditAddDisciplinePage createDisciplineWithOnlyMandatoryData(String doIncident, String officer, String place, String complaint, String inquirer){
		
		ComplaintTab.click();
		
		CalendarPopup CLNDR = new CalendarPopup(driver);		
		CLNDR.selectDate(ComplaintDOIncident, doIncident);
		CLNDR.selectDate(ComplaintDOInquiry, doIncident);
		
		ComplaintReoprtedByOfficer.click();
		ComplaintReoprtedByOfficerName.sendKeys(officer);
		ComplaintPlace.sendKeys(place);
		Complaint.sendKeys(complaint);
		ComplaintInquiryBy.sendKeys(inquirer);
		
		createButton.click();
		return PageFactory.initElements(driver, EditAddDisciplinePage.class);
	}
	
}
