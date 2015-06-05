package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class GoodReceivedAuthorizePage extends CommonMethods {
	public GoodReceivedAuthorizePage(WebDriver dr) {
		driver = dr;
	}

	WebDriver driver;
	@FindBy(xpath = Constants.GoodReceivedNo)
	WebElement ordernosearch;
	@FindBy(xpath = Constants.SelectGoodReceived)
	WebElement selectgoodreceived;

	public CreateGoodAuthorizePage SearchGoodReceived(String id) {
		ordernosearch.sendKeys(id);
		ordernosearch.sendKeys(Keys.ENTER);
		selectgoodreceived.click();
		CreateGoodAuthorizePage createNewGoodauthorizePage = PageFactory
				.initElements(driver, CreateGoodAuthorizePage.class);
		return createNewGoodauthorizePage;
	}

	public boolean successMessageAvaiable() {

		return checkElementIsPresent(driver,
				By.xpath(Constants.SearchPage_SuccessMessage));
	}

	public String getSuccessMessage() {

		return driver
				.findElement(By.xpath(Constants.SearchPage_SuccessMessage))
				.getText();
	}
}
