package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateIndustrialEveningPage {
	
	WebDriver driver;
	@FindBy(xpath = Constants.CreateEveningButton)
	WebElement create;
	@FindBy(xpath = Constants.SuccessMessageEvening)
	WebElement successMessageindustrialevening;

	public CreateIndustrialEveningPage(WebDriver dr){
		driver = dr;
	}

	public void EnterAttendanceData(String eveningattendance1, String eveningattendance5){

		driver.findElement(By.xpath(Constants.eveningattendancebox1)).click();
		driver.findElement(By.xpath(Constants.salarybox1)).click();
		driver.findElement(By.xpath(Constants.eveningattendanceline1)).sendKeys(eveningattendance1);
		driver.findElement(By.xpath(Constants.eveningattendancebox5)).click();
		driver.findElement(By.xpath(Constants.salarybox5)).click();
		driver.findElement(By.xpath(Constants.eveningattendanceline5)).sendKeys(eveningattendance5);

	}
	
	
	public IndustrialEveningPage ClickCreateButton(){
		create.click();
		IndustrialEveningPage eveningpage = PageFactory.initElements(driver, IndustrialEveningPage.class);
		return eveningpage;
	}
	

}
