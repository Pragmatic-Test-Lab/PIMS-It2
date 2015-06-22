package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.TestUtil;

public class CreateMovementOutPage {
	WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementOutButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementOutSuccessMessage)
	WebElement successMessageMovementOut;
	@FindBy(xpath = Constants.DemandOrderId)
	WebElement demandorderid;
	@FindBy(xpath = Constants.LocationFrom)
	WebElement locationfrom;
	@FindBy(xpath = Constants.LocationTo)
	WebElement locationto;



	public CreateMovementOutPage(WebDriver dr){
		driver = dr;
	}

	
	
	public String getDemandOrderID(){

		
		return demandorderid.getAttribute("value");

	}
	
	public void EnterMovementData(){
		
		String currentLoc = locationfrom.getAttribute("value");
		
		if (currentLoc.equals("1")){
			locationto.sendKeys("ward3");
		}
		else{
			locationto.sendKeys("ward1");
		}
		
		CalendarPopup CLNDR = new CalendarPopup(driver);		
		CLNDR.selectDateTime(driver.findElement(By.xpath(Constants.MovementOutDate)), TestUtil.getTodaysDateandtimeOut());	
	
	}
	
	public MovementOutPage ClickCreateButton(){
		create.click();
		MovementOutPage movementoutpage = PageFactory.initElements(driver, MovementOutPage.class);
		return movementoutpage;
	}



}
