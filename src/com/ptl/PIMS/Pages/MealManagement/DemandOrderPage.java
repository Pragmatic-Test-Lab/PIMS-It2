package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.TestCases.MealManagement.DemandOrderTest;

public class DemandOrderPage extends CommonMethods {

	WebDriver driver;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.CreateDemand)
	WebElement createdemand;

	public DemandOrderPage(WebDriver dr) {
		driver = dr;
	}

	public CreateDemandOrderPage getCreateDemandOrderPage() {
		createdemand.click();
		CreateDemandOrderPage createNewDemandPage = PageFactory.initElements(
				driver, CreateDemandOrderPage.class);
		return createNewDemandPage;
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