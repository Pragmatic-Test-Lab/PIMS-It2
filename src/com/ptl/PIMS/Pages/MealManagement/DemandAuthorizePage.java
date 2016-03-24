package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class DemandAuthorizePage extends CommonMethods{
	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateDemand)
	WebElement createdemand;
	@FindBy(xpath = Constants.OrdernoSearch)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectDemandOrder2)
	WebElement selectdemandorder;

	
	public DemandAuthorizePage(WebDriver dr){
		driver = dr;
	}
	public CreateDemandAuthorizePage SearchDemandOrder(String id){
		
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		try {	Thread.sleep(5000); 	} catch (InterruptedException e) {}
		selectdemandorder.click();
		CreateDemandAuthorizePage createNewDemandauthorizePage = PageFactory.initElements(driver, CreateDemandAuthorizePage.class);
		return createNewDemandauthorizePage;	
	}	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
