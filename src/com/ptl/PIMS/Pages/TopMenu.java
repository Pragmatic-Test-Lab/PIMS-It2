package com.ptl.PIMS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;


public class TopMenu {
	
	WebDriver driver;
	
	@FindBy(xpath=Constants.TopMenu_PIMSTopLink)
	WebElement homePageTopLink;
	@FindBy(xpath = Constants.TopMenu_LogOut)
	WebElement logOut;
	
	
	
	public TopMenu(WebDriver dr){
		driver = dr;
	}
	
	public HomePage gotoHomePage(){
		homePageTopLink.click();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		return homePage;
	}

	
	public LoginPage doLogout(){
		logOut.click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		TestBase.isLoggedIn = false;
		return loginPage;		
	}


	

}
