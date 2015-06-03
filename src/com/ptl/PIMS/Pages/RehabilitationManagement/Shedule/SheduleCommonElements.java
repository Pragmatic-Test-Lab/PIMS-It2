package com.ptl.PIMS.Pages.RehabilitationManagement.Shedule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ptl.PIMS.util.Constants;

public class SheduleCommonElements {

	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_SheduleProgram)
	WebElement Program;
	@FindBy(xpath = Constants.RehabilitationManagement_SheduleStart)
	WebElement StartDate;
	@FindBy(xpath = Constants.RehabilitationManagement_SheduleEnd)
	WebElement EndDate;
	@FindBy(xpath = Constants.RehabilitationManagement_SheduleOrgan)
	WebElement Organization;

	public void editField(WebElement element, String text){
		
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		element.sendKeys(text);
	}
	
}
