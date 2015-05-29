package com.ptl.PIMS.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	public boolean checkElementIsPresent(WebDriver driver , By byCondition){
		try {
		   driver.findElement(byCondition);
		} catch (Exception e) {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("c:\\Selenium-TestRun\\Failure Screenshots\\Iteration 2\\" 
								+ (new SimpleDateFormat("yyyy-MM-dd\\HH-mm-ss").format(Calendar.getInstance().getTime())) + ".png"));
			} catch (IOException e1) {}
			
		   return false;
		}		
		return true;
	}
	
	public int NoOfElements(WebDriver driver, String xpath){
		
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		
		return elements.size();
	}
}
