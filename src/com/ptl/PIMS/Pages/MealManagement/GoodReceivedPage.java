package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class GoodReceivedPage {
	WebDriver driver;
	@FindBy(xpath = Constants.GoodReceivedNo)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectGoodReceived)
	WebElement selectgoodreceived;

	public GoodReceivedPage(WebDriver dr){
		driver = dr;
	}
	public CreateGoodReceivedPage SearchGoodReceived(String id){
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		selectgoodreceived.click();
		CreateGoodReceivedPage creategoodreceivedPage = PageFactory.initElements(driver, CreateGoodReceivedPage.class);
		return creategoodreceivedPage;	
	}
}
