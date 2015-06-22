package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutAuthorizePage;
import com.ptl.PIMS.util.Constants;

public class TransferOutAuthorizePage {
	WebDriver driver;
	@FindBy(xpath = Constants.MovementOutCreate)
	WebElement createmovementoutaddmission;
	@FindBy(xpath = Constants.AdmisssionIdAuthoriseSearch)
	WebElement admisssionidauthorisesearch;
	@FindBy(xpath = Constants.AuthoriseMovementOut)
	WebElement authorisemovementout;
		
	public TransferOutAuthorizePage(WebDriver dr){
		driver = dr;
	}
	public CreateTransferOutAuthorizePage getCreateTransferOutAuthorizePage(){
		admisssionidauthorisesearch.sendKeys(Constants.transferadmissionid+ Keys.ENTER);
		authorisemovementout.click();
		CreateTransferOutAuthorizePage createtransferoutauthorize = PageFactory.initElements(driver, CreateTransferOutAuthorizePage.class);
		return createtransferoutauthorize;	
	}

}
