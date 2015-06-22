package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateMovementInAuthorize {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.CreateMovementOutAuthorizeButton)
	WebElement create;
	@FindBy(xpath = Constants.MovementOutAuthorizeSuccessMessage)
	WebElement successMessageMovementInAuthorize;


	public CreateMovementInAuthorize(WebDriver dr){
		driver = dr;
	}
	

	public MovementInAuthorizePage ClickAuthorizeButton(){
		create.click();
		MovementInAuthorizePage movementinauthorizepage = PageFactory.initElements(driver, MovementInAuthorizePage.class);
		return movementinauthorizepage;
	}

}
