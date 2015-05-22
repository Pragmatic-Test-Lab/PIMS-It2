package com.ptl.PIMS.Pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	public boolean checkElementIsPresent(WebDriver driver , By byCondition){
		boolean present;
		try {
		   driver.findElement(byCondition);
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		
		return present;
	}
	
	public int NoOfElements(WebDriver driver, String xpath){
		
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		
		return elements.size();
	}
}
