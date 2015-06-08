package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeActionPlanSelectPage extends SearchActionPlan{

	@FindBy(xpath = Constants.RehabilitationManagement_APAuthFirstRecord)
	public WebElement AuthActionPFirstRecord;	
	
	public AuthorizeActionPlanSelectPage(WebDriver dr){		
		driver = dr;
	}
	
	public AuthorizeActionPlanPage clickFirstActionPlan(){
		
		AuthActionPFirstRecord.click();
		return PageFactory.initElements(driver, AuthorizeActionPlanPage.class);
	}
}
