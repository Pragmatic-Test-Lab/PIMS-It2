package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class MovementOutPage extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.MovementOutCreate)
	WebElement createmovementoutaddmission;
		
	public MovementOutPage(WebDriver dr){
		driver = dr;
	}
	
	public SelectMovementOutAdmissionPage getCreateMovementOutAdmissionPage(){
		
		createmovementoutaddmission.click();
		SelectMovementOutAdmissionPage createmovementoutadmissionPage = PageFactory.initElements(driver, SelectMovementOutAdmissionPage.class);
		return createmovementoutadmissionPage;	
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 

	
}
