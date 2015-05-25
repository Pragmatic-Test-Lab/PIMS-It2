package com.ptl.PIMS.Pages.AppealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewAppeal extends NewEditAppealCommonElements {

	public NewAppeal(WebDriver dr){
		driver = dr;
	}
	
	public AppealAddUpdatePage AddNewAppeal(String appealCase, String court, String reason, String request){
		
		//addAppealDate(date);
		AppealCase.sendKeys(appealCase);
		AppealCourt.sendKeys(court);
		ReasonTab.click();
		Reason.sendKeys(reason);
		RequestTab.click();
		Request.sendKeys(request);
		
		SubmitButton.click();
		
		AppealAddUpdatePage selectAppealPage = PageFactory.initElements(driver, AppealAddUpdatePage.class);		
		return selectAppealPage;
	}
	
}
