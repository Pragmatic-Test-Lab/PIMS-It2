package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.TestUtil;

public class CreateTransferInPage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementInButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementInSuccessMessage)
	WebElement successMessageMovementIn;


	public CreateTransferInPage(WebDriver dr){
		driver = dr;
	}
	public void EnterTransferData(){
		
		CalendarPopup CLNDR = new CalendarPopup(driver);
	
		CLNDR.selectDateTime(driver.findElement(By.xpath(Constants.TransferInDate)), TestUtil.getTodaysDateandtime());	
		
	}


	public TransferInPage ClickCreateButton(){
		create.click();
		TransferInPage transferinpage = PageFactory.initElements(driver, TransferInPage.class);
		return transferinpage;
	}

}
