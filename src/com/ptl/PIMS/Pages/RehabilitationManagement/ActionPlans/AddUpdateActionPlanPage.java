package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AddUpdateActionPlanPage extends SearchActionPlan{

	@FindBy(xpath = Constants.RehabilitationManagement_NewAPButton)
	public WebElement ActionPNewButton;
	
	public AddUpdateActionPlanPage(WebDriver dr){
		
		driver = dr;
	}
	
	public ActionPlanAddPage gotoCreateActionPlan(){
		
		ActionPNewButton.click();		
		return PageFactory.initElements(driver, ActionPlanAddPage.class);
	}
	
	public ActionPlanUpdatePage clickFirstActionPlan(){
		
		ActionPFirstRecord.click();
		return PageFactory.initElements(driver, ActionPlanUpdatePage.class);
	}
	
}
