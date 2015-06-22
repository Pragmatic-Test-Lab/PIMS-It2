package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class TransferInAuthorizePage {
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
	public CreateTransferInAuthorizePage getCreateTransferInAuthorizePage(){
		admisssionidinsearch.sendKeys(Constants.transferadmissionid+ Keys.ENTER);
		transferinAuthorize.click();
		CreateTransferInAuthorizePage createtransferinauthorize = PageFactory.initElements(driver, CreateTransferInAuthorizePage.class);
		return createtransferinauthorize;	
	}
}
