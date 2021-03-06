package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateMovementOutAuthorizePage {
WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementOutAuthorizeButton)
	WebElement create;

	public CreateMovementOutAuthorizePage(WebDriver dr){
		driver = dr;
	}
	

	public MovementOutAuthorizePage ClickAuthorizeButton(){
		create.click();
		MovementOutAuthorizePage movementoutauthorizepage = PageFactory.initElements(driver, MovementOutAuthorizePage.class);
		return movementoutauthorizepage;
	}

	
}
