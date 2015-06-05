package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class KitchenSlipPage  extends CommonMethods{

	public KitchenSlipPage(WebDriver dr){
		driver = dr;
	}
	WebDriver driver;
	@FindBy(xpath = Constants.CreateKitchenSlip)
	WebElement createkitchenslip;

	public CreateKitchenSlipPage getCreateKitchenSlipPage(){
		createkitchenslip.click();
		CreateKitchenSlipPage createNewKitchenSlipPage = PageFactory.initElements(driver, CreateKitchenSlipPage.class);
		return createNewKitchenSlipPage;	
	}
	

	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
