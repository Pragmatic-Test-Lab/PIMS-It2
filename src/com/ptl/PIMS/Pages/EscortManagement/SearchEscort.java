package com.ptl.PIMS.Pages.EscortManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.TestUtil;

public class SearchEscort extends CommonMethods{

	protected WebDriver driver;
	
	@FindBy(xpath = Constants.EscortManagement_SearchID)
	public WebElement EscortID;
	@FindBy(xpath = Constants.EscortManagement_SearchDate)
	public WebElement EscortDate;
	
	@FindBy(xpath = Constants.EscortManagement_FirstRecord)
	public WebElement EscortFirstRecord;	

	@SuppressWarnings("unchecked")
	public <T extends SearchEscort>T EscortForSearch(String date, String id){
		
		EscortDate.sendKeys(TestUtil.wordMonthToNumber(date));
		EscortID.sendKeys(id + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());
	}
	
	public WebElement getLastEscortInList(){
		
		List<WebElement> listOfEscorts = driver.findElements(By.xpath(Constants.EscortManagement_EscortRecords));
		return driver.findElement(By.xpath(Constants.EscortManagement_EscortRecords + "[" + listOfEscorts.size() +"]"));
	}
	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
