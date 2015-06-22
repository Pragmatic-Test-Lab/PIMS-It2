package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class TransferInAuthorizePage extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.TransferinAuthorize)
	WebElement transferinAuthorize;
	@FindBy(xpath = Constants.AdmisssionIdAuthoriseSearch)
	WebElement admisssionidinsearch;
	@FindBy(xpath = Constants.AuthoriseMovementOut)
	WebElement authorisemovementout;
		
	public TransferInAuthorizePage(WebDriver dr){
		driver = dr;
	}
	
	public CreateTransferInAuthorizePage getCreateTransferInAuthorizePage(String inmateId){
		
		admisssionidinsearch.sendKeys(inmateId + Keys.ENTER);
		transferinAuthorize.click();
		CreateTransferInAuthorizePage createtransferinauthorize = PageFactory.initElements(driver, CreateTransferInAuthorizePage.class);
		return createtransferinauthorize;	
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
