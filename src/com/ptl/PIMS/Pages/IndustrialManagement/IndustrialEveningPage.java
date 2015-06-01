package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class IndustrialEveningPage {
	WebDriver driver;
	@FindBy(xpath = Constants.EveningRecord)
	WebElement eveningrecord;
	public IndustrialEveningPage(WebDriver dr){
		driver = dr;
	}

	public CreateIndustrialEveningPage ClickEveningRecordButton(){
		eveningrecord.click();
		CreateIndustrialEveningPage eveningpage = PageFactory.initElements(driver, CreateIndustrialEveningPage.class);
		return eveningpage;
	}
}
