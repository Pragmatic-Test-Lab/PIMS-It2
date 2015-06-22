package com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class VisitFreqUpdatePage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.VisitManagement_VisitFreqField)
	public WebElement freqField;
	@FindBy(xpath = Constants.VisitManagement_VisitFreqNoOfVisitorsField)
	public WebElement noOfVisitorsField;
	
	@FindBy(xpath = Constants.VisitManagement_UpdateButton)
	public WebElement updateButton;
	
	public VisitFreqUpdatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public VisitFreqAddUpdatePage editFreq(String freq, String noOfVisitors){
		
		EditField(freqField, freq);
		EditField(noOfVisitorsField, noOfVisitors);
		updateButton.click();
		
		return PageFactory.initElements(driver, VisitFreqAddUpdatePage.class);
	}
	
	public void EditField(WebElement element, String text){
		
		element.click();
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(text);	
	}
	
	
}
