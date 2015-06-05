package com.ptl.PIMS.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	public boolean checkElementIsPresent(WebDriver driver , By byCondition){
		try {
			Thread.sleep(1500);
		   driver.findElement(byCondition);
		} catch (Exception e) {
		   return false;
		}		
		return true;
	}
	
	public int NoOfElements(WebDriver driver, String xpath){
		
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		
		return elements.size();
	}
}
