package com.ptl.PIMS.Pages.IncidenceManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class IncidenceAuthorizeInmateSelectionPage extends CommonMethods{

	WebDriver driver;
	@FindBy(xpath = Constants.InmateSearch_TableFirstInmate)
	public WebElement firstInmateLink;
	
	@FindBy(xpath = Constants.IncidenceManagement_RegNoSearch)
	public WebElement searchRegNo;
	@FindBy(xpath = Constants.IncidenceManagement_EventTypeSearch)
	public WebElement searchEventType;
	@FindBy(xpath = Constants.IncidenceManagement_EventDescSearch)
	public WebElement searchEventDesc;
	
	public IncidenceAuthorizeInmateSelectionPage(WebDriver dr){
		
		driver = dr;
	}	
	
	public IncidenceAuthorizeInmateSelectionPage searchIncidence(String regNo, String eventType, String eventDesc){
		
		searchRegNo.sendKeys(regNo);
		searchEventType.sendKeys(eventType);
		searchEventDesc.sendKeys(eventDesc + Keys.ENTER);
		
		return PageFactory.initElements(driver, IncidenceAuthorizeInmateSelectionPage.class);
	}
	
	public IncidenceAuthorizePage authorizeIncidence(){
		
		firstInmateLink.click();
		return PageFactory.initElements(driver, IncidenceAuthorizePage.class);
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
