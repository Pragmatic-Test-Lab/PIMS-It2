package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateGoodReceivedPage{
	
	WebDriver driver;


	@FindBy(xpath = Constants.CreateGoodReceivedButton)
	WebElement create;
	@FindBy(xpath = Constants.GoodReceivedQuantity)
	WebElement quantity;
	@FindBy(xpath = Constants.SuccessMessageGoodReceived)
	WebElement successMessagegoodreceived;

	public CreateGoodReceivedPage(WebDriver dr){
		driver = dr;
	}

	public void EnterGoodReceivedData(String receivedquantity){
		quantity.sendKeys(receivedquantity);
	}

	public GoodReceivedPage ClickCreateButton(){
		create.click();
		GoodReceivedPage goodreceivedpage = PageFactory.initElements(driver, GoodReceivedPage.class);
		return goodreceivedpage;
	}


}
