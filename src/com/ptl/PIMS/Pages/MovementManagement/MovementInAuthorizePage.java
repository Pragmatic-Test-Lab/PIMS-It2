package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class MovementInAuthorizePage extends CommonMethods{
	
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
	
	public CreateMovementInAuthorize getCreateMovementInAuthorizePage(String inmateId){
		
		admisssionidauthorisesearch.sendKeys(inmateId + Keys.ENTER);
		authorisemovementin.click();
		CreateMovementInAuthorize createmovementinauthorize = PageFactory.initElements(driver, CreateMovementInAuthorize.class);
		return createmovementinauthorize;	
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
