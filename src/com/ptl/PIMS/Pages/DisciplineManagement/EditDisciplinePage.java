package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class EditDisciplinePage extends CommonDisciplineElements{
	
	@FindBy(xpath = Constants.DisciplineManagement_UpdateButton)
	WebElement updateButton;
	
	public EditDisciplinePage(WebDriver dr){
		
		driver = dr;
	}
	
//	public EditAddDisciplinePage addJudgementDetails(String doJudgement, String judgement, String remissionDeduction){
//		
//		JudgementTab.click();
//		
//		CalendarPopup CLNDR = new CalendarPopup(driver);		
//		CLNDR.selectDate(JudgementDate, doJudgement);
//		
//		JudgementGuilty.click();
//		Judgement.sendKeys(judgement);
//		JudgementDeductedRemision.sendKeys(remissionDeduction);
//		
//		updateButton.click();
//		return PageFactory.initElements(driver, EditAddDisciplinePage.class);
//	}
	
	
	public EditAddDisciplinePage addJudgementDetails( String judgement){
		
		JudgementTab.click();
		
		CalendarPopup CLNDR = new CalendarPopup(driver);		
//		CLNDR.selectDate(JudgementDate, doJudgement);
		
		JudgementGuilty.click();
		Judgement.sendKeys(judgement);
		//JudgementDeductedRemision.sendKeys(remissionDeduction);
		
		updateButton.click();
		return PageFactory.initElements(driver, EditAddDisciplinePage.class);
	}
}
