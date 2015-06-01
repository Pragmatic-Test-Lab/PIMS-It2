package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class ActionPlanUpdatePage extends ActionPlanCommonElements{

	
    @FindBy(xpath = Constants.RehabilitationManagement_UpdateButton)
	WebElement UpdateButton;
    
    public ActionPlanUpdatePage(WebDriver dr){		
		driver = dr;
	}
	
	public AddUpdateActionPlanPage updateActionPlan(){
		
		UpdateButton.click();
		return PageFactory.initElements(driver, AddUpdateActionPlanPage.class);
	}
}
