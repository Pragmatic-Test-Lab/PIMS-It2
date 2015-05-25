package com.ptl.PIMS.Pages.AppealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditAppealPage extends NewEditAppealCommonElements {

	public EditAppealPage(WebDriver dr){
		driver = dr;
	}
	
	public AppealAddUpdatePage EditAppealDetails(String appealCase, String court, String reason, String request){
		
		//addAppealDate(date);
		AppealCase.sendKeys(appealCase);
		AppealCourt.sendKeys(court);
		ReasonTab.click();
		editField(Reason, reason);
		RequestTab.click();
		editField(Request, request);
		
		SubmitButton.click();
		
		AppealAddUpdatePage selectAppealPage = PageFactory.initElements(driver, AppealAddUpdatePage.class);		
		return selectAppealPage;
	}
		
	
}
