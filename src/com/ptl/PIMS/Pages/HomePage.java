package com.ptl.PIMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ptl.PIMS.util.Constants;


public class HomePage extends CommonMethods{

	WebDriver driver;

	public HomePage(WebDriver dr) {
		driver = dr;

	}

	public boolean IsMainPageImageShown() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		return checkElementIsPresent(driver, By.xpath(Constants.Home_MainImage));
	}





}
