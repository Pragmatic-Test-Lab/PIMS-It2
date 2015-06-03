package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class MovementInAuthorizePage {
	WebDriver driver;
	@FindBy(xpath = Constants.MovementOutCreate)
	WebElement createmovementoutaddmission;
	@FindBy(xpath = Constants.AdmisssionIdAuthoriseSearch)
	WebElement admisssionidauthorisesearch;
	@FindBy(xpath = Constants.AuthoriseMovementOut)
	WebElement authorisemovementin;
		
	public MovementInAuthorizePage(WebDriver dr){
		driver = dr;
	}
	public CreateMovementInAuthorize getCreateMovementInAuthorizePage(){
		admisssionidauthorisesearch.sendKeys(Constants.admissionid+ Keys.ENTER);
		authorisemovementin.click();
		CreateMovementInAuthorize createmovementinauthorize = PageFactory.initElements(driver, CreateMovementInAuthorize.class);
		return createmovementinauthorize;	
	}
}
