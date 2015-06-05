package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;
public class CreateDemandAuthorizePage{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.AuthorizeDemand)
	WebElement authorize;
	@FindBy(xpath = Constants.AuthorizeDemandSuccess)
	WebElement successMessageDemandauthorize;
	
	public CreateDemandAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	public DemandAuthorizePage ClickAuthorizeButton(){
		authorize.click();
		DemandAuthorizePage demandauthorizepage = PageFactory.initElements(driver, DemandAuthorizePage.class);
		return demandauthorizepage;
	}


}
