package com.ptl.PIMS.Pages.VisitManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class SearchVisit extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath = Constants.VisitManagement_RegNoSearch)
	public WebElement regNoField;
	@FindBy(xpath = Constants.VisitManagement_BiometricSearch)
	public WebElement biometricField;
	@FindBy(xpath = Constants.VisitManagement_NAWSearch)
	public WebElement NameAsWarrentField;
	@FindBy(xpath = Constants.VisitManagement_InTimeSearch)
	public WebElement inTimeField;
	
	@FindBy(xpath = Constants.VisitManagement_FirstRecord)
	public WebElement firstRecord;

	//Searching with basic details Registration No, Biometric, Name
	@SuppressWarnings("unchecked")
	public <T extends SearchVisit>T doVisitSearch(String RegNo, String Biometric, String Name, String InTime) {

		regNoField.sendKeys(RegNo);
		inTimeField.sendKeys(InTime);
		biometricField.sendKeys(Biometric);
		NameAsWarrentField.sendKeys(Name + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());		
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
	
	
}