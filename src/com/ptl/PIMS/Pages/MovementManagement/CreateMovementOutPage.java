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
		System.out.print(currentLoc);
		if (currentLoc.equals("61")){
			locationto.sendKeys("Ward 1 / Cell 001");
		}
		else{
			locationto.sendKeys("Ward 2 / Cell 004");
		}

    //    locationto.sendKeys("Ward 2 / Cell 003");

		CalendarPopup CLNDR = new CalendarPopup(driver);		
		CLNDR.selectDateTime(driver.findElement(By.xpath(Constants.MovementOutDate)), TestUtil.getTodaysDateandtimeOut());	
	
	}
	
	public MovementOutPage ClickCreateButton(){
		create.click();
		MovementOutPage movementoutpage = PageFactory.initElements(driver, MovementOutPage.class);
		return movementoutpage;
	}



}
