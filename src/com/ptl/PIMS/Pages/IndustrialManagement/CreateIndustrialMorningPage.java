package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class CreateIndustrialMorningPage extends CommonMethods{
	
	WebDriver driver;
	@FindBy(xpath = Constants.CreateMorningButton)
	WebElement create;
	@FindBy(xpath = Constants.SuccessMessageMorning)
	WebElement successMessageindustrialmorning;
	
	public CreateIndustrialMorningPage(WebDriver dr){
		driver = dr;
	}
	
	public void EnterAttendanceData(String attendance1, String attendance5){
			
		driver.findElement(By.xpath(Constants.attendancebox1)).click();
		driver.findElement(By.xpath(Constants.attendanceline1)).sendKeys(attendance1);
		driver.findElement(By.xpath(Constants.attendancebox3)).click();
		driver.findElement(By.xpath(Constants.attendancebox5)).click();
		driver.findElement(By.xpath(Constants.attendanceline5)).sendKeys(attendance5);

	}

	public IndustrialMorningPage ClickCreateButton(){
		create.click();
		IndustrialMorningPage morningpage = PageFactory.initElements(driver, IndustrialMorningPage.class);
		return morningpage;
	}


}
