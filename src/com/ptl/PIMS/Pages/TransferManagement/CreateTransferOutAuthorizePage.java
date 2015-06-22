package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ptl.PIMS.util.Constants;

public class CreateTransferOutAuthorizePage {
WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementOutAuthorizeButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementOutAuthorizeSuccessMessage)
	WebElement successMessageMovementOutAuthorize;


	public CreateTransferOutAuthorizePage(WebDriver dr){
		driver = dr;
	}
	

	public TransferOutAuthorizePage ClickAuthorizeButton(){
		create.click();
		TransferOutAuthorizePage transferoutauthorizepage = PageFactory.initElements(driver, TransferOutAuthorizePage.class);
		return transferoutauthorizepage;
	}

	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessageMovementOutAuthorize.getText();
	}
}
