package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class IndustrialMorningPage {
	WebDriver driver;
	@FindBy(xpath = Constants.GoToIndustry)
	WebElement gotoindustry;
	public IndustrialMorningPage(WebDriver dr){
		driver = dr;
	}

	public CreateIndustrialMorningPage ClickIndustryButton(){
		gotoindustry.click();
		CreateIndustrialMorningPage morningpage = PageFactory.initElements(driver, CreateIndustrialMorningPage.class);
		return morningpage;
	}
}
