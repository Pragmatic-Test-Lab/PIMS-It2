package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class SearchActionPlan extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_APPrisonSearch)
	public WebElement ActionPSearch_Prison;
	@FindBy(xpath = Constants.RehabilitationManagement_APYearSearch)
	public WebElement ActionPSearch_Year;
	
	@FindBy(xpath = Constants.RehabilitationManagement_FirstRecord)
	public WebElement ActionPFirstRecord;	

	@SuppressWarnings("unchecked")
	public <T extends SearchActionPlan>T ActionPlanForSearch (String Year,String Prison){
		
		ActionPSearch_Year.sendKeys(Year);
		ActionPSearch_Prison.sendKeys(Prison + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());
	}
	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
