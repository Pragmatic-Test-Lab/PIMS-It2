package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class NewVocationalProgram extends VocationalTrainingAddUpdatePageCommonElements {	
	
	@FindBy(xpath = Constants.NewVOC_CreateButton)
	public WebElement CreateButton;
	
	
	public NewVocationalProgram(WebDriver dr){
		driver = dr;		
	}
	
	public VocationalTrainingAddUpdatePage createNewVOC(String progCode, String progName,String progDuration,
			String vocType, String vocTInstitute, String vocStartDate,String vocEndDate,
				String vocVenue, String resourcePerson){
		
		ProgCode.sendKeys(progCode);
		ProgName.sendKeys(progName);
		ProgDuration.sendKeys(progDuration);
		VOCType.sendKeys(vocType);
		TrainingInstitute.sendKeys(vocTInstitute);
		//PrisonInstitute.sendKeys(vocPInstitute);
		
		CalendarPopup CLNDR = new CalendarPopup(driver);
		
		CLNDR.selectDate(StartDate, vocStartDate);
		CLNDR.selectDate(EndDate, vocEndDate);
		
		Venue.sendKeys(vocVenue);
		ResourcePerson.sendKeys(resourcePerson);
		
		CreateButton.click();
		
		VocationalTrainingAddUpdatePage vocAddUpdatePage = PageFactory.initElements(driver, VocationalTrainingAddUpdatePage.class);		
		return vocAddUpdatePage;
	}
}
