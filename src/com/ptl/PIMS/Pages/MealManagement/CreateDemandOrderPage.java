package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.TestCases.MealManagement.CreateDemandOrderTest;
import com.ptl.PIMS.util.Constants;

public class CreateDemandOrderPage {

	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateDemand)
	WebElement createdemand;
	@FindBy(xpath = Constants.CreateDemandHeader)
	WebElement createdemandheader;
	@FindBy(xpath = Constants.CreateDemandButton)
	WebElement create;
	@FindBy(xpath = Constants.DemandSuccessMessage)
	WebElement successMessageDemand;
	@FindBy(xpath = Constants.DemandOrderId)
	WebElement demandorderid;



	public CreateDemandOrderPage(WebDriver dr){
		driver = dr;
	}

	public String getActualPageTitle(){
		return createdemandheader.getText();
	}
	
	public String getDemandOrderID(){

		
		return demandorderid.getAttribute("value");

	}
	
	public DemandOrderPage ClickCreateButton(){
		create.click();
		DemandOrderPage demandpage = PageFactory.initElements(driver, DemandOrderPage.class);
		return demandpage;
	}

	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessageDemand.getText();
	}



}
