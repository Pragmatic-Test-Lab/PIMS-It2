package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.MealManagement.CreateGoodAuthorizePage;
import com.ptl.PIMS.util.Constants;

public class SelectMovementOutAdmissionPage {

	WebDriver driver;

	@FindBy(xpath = Constants.CreateMovementOut)
	WebElement createmovementout;
	@FindBy(xpath = Constants.MovementAdmissionId)
	WebElement movementadmissionid;
	@FindBy(xpath = Constants.MovementAdmissionIdSearch)
	WebElement admisssionidsearch;
	

	public SelectMovementOutAdmissionPage(WebDriver dr){
		driver = dr;
	}
		
	public CreateMovementOutPage SearchAdmissionID(){
		admisssionidsearch.sendKeys(Constants.admissionid+ Keys.ENTER);
		createmovementout.click();
		CreateMovementOutPage createmovementout = PageFactory.initElements(driver, CreateMovementOutPage.class);
		return createmovementout;	
	}
	
	

}
