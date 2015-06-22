package com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class VisitFreqAddUpdatePage extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.VisitManagement_VisitFreqCategory)
	public WebElement categoryType;
	@FindBy(xpath = Constants.VisitManagement_VisitFreqFirstEditIcon)
	public WebElement editFirstLink;

	
	public VisitFreqAddUpdatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public VisitFreqAddUpdatePage searchForFreq(String category){
		
		categoryType.sendKeys(category + Keys.ENTER);		
		return PageFactory.initElements(driver, VisitFreqAddUpdatePage.class);
	}
	
	public VisitFreqUpdatePage selectFirstFreq(){
		
		editFirstLink.click();	
		return PageFactory.initElements(driver, VisitFreqUpdatePage.class);
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
	
	

}
