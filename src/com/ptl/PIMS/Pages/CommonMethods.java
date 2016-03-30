package com.ptl.PIMS.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CommonMethods {

	protected WebDriverWait wait;

	public boolean checkElementIsPresent(WebDriver driver , By byCondition){
		try {
			driver.findElement(byCondition);
		} catch (Exception e) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("c:\\Selenium-TestRun\\Failure Screenshots\\Iteration 1\\"
						+ (new SimpleDateFormat("yyyy-MM-dd\\HH-mm-ss").format(Calendar.getInstance().getTime())) + ".png"));
			} catch (IOException e1) {
			}

			return false;
		}
		return true;
	}

	public int NoOfElements(WebDriver driver, String xpath){

		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		return elements.size();
	}

	public void waitAndSendKeys(WebDriver driver, String xpath, String value) {
		getWait(driver).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(new CharSequence[]{value, Keys.TAB});
	}

	public void waitAndReplaceKeys(WebDriver driver, String xpath, String value) {
		getWait(driver).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(new CharSequence[]{value, Keys.TAB});
	}

	public void waitAndClear(WebDriver driver, String xpath) {
		getWait(driver).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).clear();
	}

	public void waitAndClick(WebDriver driver, String xpath) {
		getWait(driver).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();
	}

	public void waitForPageReload(WebDriver driver){
		getWait(driver).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[not (.='')]"))));
	}

	public void waitUntilVisible(WebDriver driver, String xpath) {
		getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public boolean waitForJSandJQueryToLoad(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
				}
				catch (Exception e) {
					return true;
				}
			}
		};

		// wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor)driver).executeScript("return document.readyState")
						.toString().equals("complete");
			}
		};

		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

	public void matchValueWithText(WebDriver driver, String xpath, String matchText, boolean caseSensitive){

		WebElement field = driver.findElement(By.xpath(xpath));

		if(caseSensitive)
			org.testng.Assert.assertEquals(field.getAttribute("value"), matchText, "Field value did not match expected.");
		else
			org.testng.Assert.assertEquals(field.getAttribute("value").toLowerCase(), matchText.toLowerCase(), "Field value did not match expected.");
	}

	public void matchSelectedDropdownWithText(WebDriver driver, String dropdownXpath, String matchText, boolean caseSensitive){

		WebElement selectedOption = driver.findElement(By.xpath(dropdownXpath + "/option[@selected='']"));

		if(caseSensitive)
			org.testng.Assert.assertEquals(selectedOption.getText(), matchText, "Dropdown value did not match expected.");
		else
			org.testng.Assert.assertEquals(selectedOption.getText().toLowerCase(), matchText.toLowerCase(), "Dropdown value did not match expected.");

	}

	public void moveAlongMenuAndClick(WebDriver driver, ArrayList<String> xpaths){

		Actions action;

		for(int i=0; i < xpaths.size(); i++){

			if((i+1) == xpaths.size()){
				driver.findElement(By.xpath(xpaths.get(i))).click();
			}else{
				action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath(xpaths.get(i)))).build().perform();
				getWait(driver).until(ExpectedConditions.elementToBeClickable(By.xpath(xpaths.get(i+1))));
			}
		}

	}

	public WebDriverWait getWait(WebDriver driver){
		if(wait == null) {
			wait = new WebDriverWait(driver, 60);
		}
		return wait;
	}
}
