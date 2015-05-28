package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class DemandAuthorizePage {
	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateDemand)
	WebElement createdemand;
	@FindBy(xpath = Constants.OrdernoSearch)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectDemandOrder)
	WebElement selectdemandorder;

	
	public DemandAuthorizePage(WebDriver dr){
		driver = dr;
	}
	public CreateDemandAuthorizePage SearchDemandOrder(String id){
				ordernosearch.sendKeys(id);
				ordernosearch.sendKeys(Keys.ENTER);
		selectdemandorder.click();
		CreateDemandAuthorizePage createNewDemandauthorizePage = PageFactory.initElements(driver, CreateDemandAuthorizePage.class);
		return createNewDemandauthorizePage;	
	}
	
}
