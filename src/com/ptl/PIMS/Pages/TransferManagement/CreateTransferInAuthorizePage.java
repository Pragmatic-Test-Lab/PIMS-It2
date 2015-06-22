package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.TestUtil;

public class CreateTransferInAuthorizePage {
WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementInButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementInSuccessMessage)
	WebElement successMessageMovementIn;


	public CreateTransferInAuthorizePage(WebDriver dr){
		driver = dr;
	}
	

	public TransferInAuthorizePage ClickAuthorizeButton(){
		create.click();
		TransferInAuthorizePage transferinauthorizepage = PageFactory.initElements(driver, TransferInAuthorizePage.class);
		return transferinauthorizepage;
	}

	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessageMovementIn.getText();
	}
	
}
