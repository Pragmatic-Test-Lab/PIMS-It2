package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;



public class CreateDemandAuthorizePage extends TestBase{
	@FindBy(xpath = Constants.AuthorizeDemand)
	WebElement authorize;
	@FindBy(xpath = Constants.AuthorizeDemandSuccess)
	WebElement successMessageDemandauthorize;
	
	
	public DemandAuthorizePage ClickAuthorizeButton(){
		authorize.click();
		DemandAuthorizePage demandauthorizepage = PageFactory.initElements(driver, DemandAuthorizePage.class);
		return demandauthorizepage;
	}
	public String getSuccessMessage(){

		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}*/

		return successMessageDemandauthorize.getText();
	}

}
