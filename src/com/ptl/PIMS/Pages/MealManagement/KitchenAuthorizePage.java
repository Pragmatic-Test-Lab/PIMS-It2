package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class KitchenAuthorizePage extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath = Constants.KitchenOrderNo)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectKitchenOrder)
	WebElement selectkitchenorder;
	
	public KitchenAuthorizePage(WebDriver dr){
		
		driver = dr;
	}
	
	
	public CreateKitchenAuthorizePage SearchKitchenOrder(String id){
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		try {	Thread.sleep(4000); 	} catch (InterruptedException e) {}
		selectkitchenorder.click();
		CreateKitchenAuthorizePage createNewKitchenauthorizePage = PageFactory.initElements(driver, CreateKitchenAuthorizePage.class);
		return createNewKitchenauthorizePage;	
	}


	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
