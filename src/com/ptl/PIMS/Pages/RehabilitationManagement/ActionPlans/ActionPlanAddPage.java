package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;


public class ActionPlanAddPage extends ActionPlanCommonElements{

    @FindBy(xpath = Constants.RehabilitationManagement_CreateButton)
	WebElement CreateButton;
	
	public ActionPlanAddPage(WebDriver dr){		
		driver = dr;
	}
	
	public AddUpdateActionPlanPage createActionPlan(){
		
		CreateButton.click();
		return PageFactory.initElements(driver, AddUpdateActionPlanPage.class);
	}
}
