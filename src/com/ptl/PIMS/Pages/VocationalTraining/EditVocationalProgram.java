package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class EditVocationalProgram extends VocationalTrainingAddUpdatePageCommonElements{

	@FindBy(xpath = Constants.UpdateVOC_UpdateButton)
	public WebElement UpdateButton;
	
	
	public EditVocationalProgram(WebDriver dr){
		driver = dr;		
	}
	
	public VocationalTrainingAddUpdatePage editVOC(String progName,String progDuration,
			String vocType, String vocTInstitute, String vocStartDate,String vocEndDate){
		
		editField(ProgName, progName);
		editField(ProgDuration, progDuration);
		VOCType.sendKeys(vocType);
		TrainingInstitute.sendKeys(vocTInstitute);
		//PrisonInstitute.sendKeys(vocPInstitute);
		
		CalendarPopup CLNDR = new CalendarPopup(driver); 
		
		CLNDR.editDate(StartDate, vocStartDate);
		CLNDR.editDate(EndDate, vocEndDate);
		
		UpdateButton.click();
		
		VocationalTrainingAddUpdatePage vocAddUpdatePage = PageFactory.initElements(driver, VocationalTrainingAddUpdatePage.class);		
		return vocAddUpdatePage;
	}
}
