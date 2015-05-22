package com.ptl.PIMS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = Constants.Login_username)
	public WebElement username;
	@FindBy(xpath = Constants.Login_password)
	public WebElement password;
	@FindBy(xpath = Constants.Login_login)
	public WebElement login;
	@FindBy(xpath = Constants.Login_PasswordError)
	WebElement loginErrorMessage;
	

	public LoginPage(WebDriver dr) {
		driver = dr;
	}

	public HomePage doLogin(String uName, String pWord) {
		
		username.sendKeys(uName);
		password.sendKeys(pWord);
		login.click();
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		return homePage;
	}

	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public String getUsernameFieldValue(){
		
		return username.getAttribute("value");
	}
	
	public String getPasswordFieldValue(){
		
		return password.getAttribute("value");
	}	

	public String getErrorMessage() {
		return loginErrorMessage.getText();
	}

}
