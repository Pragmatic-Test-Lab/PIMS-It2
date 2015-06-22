package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.TestUtil;

public class CreateMovementInPage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementInButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementInSuccessMessage)
	WebElement successMessageMovementIn;


	public CreateMovementInPage(WebDriver dr){
		driver = dr;
	}
	public void EnterMovementData(){
		
		CalendarPopup CLNDR = new CalendarPopup(driver);	
		CLNDR.selectDateTime(driver.findElement(By.xpath(Constants.MovementInDate)), TestUtil.getTodaysDateandtime());		
	}


	public MovementInPage ClickCreateButton(){
		create.click();
		MovementInPage movementinpage = PageFactory.initElements(driver, MovementInPage.class);
		return movementinpage;
	}

}
