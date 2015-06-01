package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class WagesPage {
	WebDriver driver;
	@FindBy(xpath = Constants.CreateWage)
	WebElement createwage;
	public WagesPage(WebDriver dr){
		driver = dr;
	}

	public CreateWagesPage ClickIndustrialWages(){
		createwage.click();
		CreateWagesPage wagespage = PageFactory.initElements(driver, CreateWagesPage.class);
		return wagespage;
	}

}
