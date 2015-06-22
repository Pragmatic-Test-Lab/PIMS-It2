package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ptl.PIMS.util.Constants;

public class TransferInPage {
	WebDriver driver;
	@FindBy(xpath = Constants.MovementinCreate)
	WebElement movementin;
	@FindBy(xpath = Constants.AdmisssionIdAuthoriseSearch)
	WebElement admisssionidinsearch;
	@FindBy(xpath = Constants.AuthoriseMovementOut)
	WebElement authorisemovementout;
		
	public TransferInPage(WebDriver dr){
		driver = dr;
	}
	public CreateTransferInPage getCreateTransferInPage(){
		admisssionidinsearch.sendKeys(Constants.transferadmissionid+ Keys.ENTER);
		movementin.click();
		CreateTransferInPage createtransferin = PageFactory.initElements(driver, CreateTransferInPage.class);
		return createtransferin;	
	}
}
