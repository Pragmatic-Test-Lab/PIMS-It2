package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeActionPlanSelectPage extends SearchActionPlan{

	
	public AuthorizeActionPlanSelectPage(WebDriver dr){		
		driver = dr;
	}
	
	public AuthorizeActionPlanPage clickFirstActionPlan(){
		
		ActionPFirstRecord.click();
		return PageFactory.initElements(driver, AuthorizeActionPlanPage.class);
	}
}
