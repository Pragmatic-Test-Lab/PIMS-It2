package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class MovementOutAuthorizePage extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.MovementOutCreate)
	WebElement createmovementoutaddmission;
	@FindBy(xpath = Constants.AdmisssionIdAuthoriseSearch)
	WebElement admisssionidauthorisesearch;
	@FindBy(xpath = Constants.AuthoriseMovementOut)
	WebElement authorisemovementout;
		
	public MovementOutAuthorizePage(WebDriver dr){
		driver = dr;
	}
	
	public CreateMovementOutAuthorizePage goToAuthorizePage(String inmateId){
		
		admisssionidauthorisesearch.sendKeys(inmateId + Keys.ENTER);
		authorisemovementout.click();
		CreateMovementOutAuthorizePage createmovementoutauthorize = PageFactory.initElements(driver, CreateMovementOutAuthorizePage.class);
		return createmovementoutauthorize;	
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
	
}
