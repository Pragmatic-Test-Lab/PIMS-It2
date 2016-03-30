package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;
import com.ptl.PIMS.util.Constants;

public class SelectMovementOutAdmissionPage extends SelectInmatePage{

	@FindBy(xpath = Constants.CreateMovementOut)
	WebElement createmovementout;
	@FindBy(xpath = Constants.MovementAdmissionId)
	WebElement movementadmissionid;
	@FindBy(xpath = Constants.MovementAdmissionIdSearch)
	WebElement admisssionidsearch;
	
	@FindBy(xpath = Constants.CreateMovementOut)
	WebElement firstInmate;
	
	public SelectMovementOutAdmissionPage(WebDriver dr){
		driver = dr;
	}
	
	public CreateMovementOutPage GoToMovementOutPage(){

		clickFirstRecord();
		CreateMovementOutPage createmovementout = PageFactory.initElements(driver, CreateMovementOutPage.class);
		return createmovementout;	
	}
	
	

}
