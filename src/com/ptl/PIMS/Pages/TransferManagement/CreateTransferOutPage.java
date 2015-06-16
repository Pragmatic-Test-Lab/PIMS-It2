package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.TestUtil;

public class CreateTransferOutPage {
	WebDriver driver;

	@FindBy(xpath = Constants.CreateMovementOutButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementOutSuccessMessage)
	WebElement successMessageMovementOut;
	@FindBy(xpath = Constants.LocationFrom)
	WebElement locationfrom;
	@FindBy(xpath = Constants.TransferLocationTo)
	WebElement transferlocationto;



	public CreateTransferOutPage(WebDriver dr){
		driver = dr;
	}



	public void EnterTransferData(){
		
			transferlocationto.sendKeys("WATARAKA");
		
		
	}

	public TransferOutPage ClickCreateButton(){
		create.click();
		TransferOutPage transferoutpage = PageFactory.initElements(driver, TransferOutPage.class);
		return transferoutpage;
	}

	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessageMovementOut.getText();
	}




}
