package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateWagesPage {
	WebDriver driver;
	@FindBy(xpath = Constants.UpdateWages)
	WebElement update;
	@FindBy(xpath = Constants.SuccessMessageWages)
	WebElement successMessagewages;

	public CreateWagesPage(WebDriver dr){
		driver = dr;
	}

	public void EnterWagesData(String wagesduration1, String wagesdailyrate1, String wagesSavings1){

		
		driver.findElement(By.xpath(Constants.wagesduration)).clear();
		driver.findElement(By.xpath(Constants.wagesduration)).sendKeys(wagesduration1);
		driver.findElement(By.xpath(Constants.wagesdailyrate)).clear();
		driver.findElement(By.xpath(Constants.wagesdailyrate)).sendKeys(wagesdailyrate1);
		driver.findElement(By.xpath(Constants.wagesSavings)).clear();
		driver.findElement(By.xpath(Constants.wagesSavings)).sendKeys(wagesSavings1);

	}

	public WagesPage ClickUpdateButton(){
		update.click();
		WagesPage wagespage = PageFactory.initElements(driver, WagesPage.class);
		return wagespage;
	}

}
