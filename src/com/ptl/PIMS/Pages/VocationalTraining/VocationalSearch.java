package com.ptl.PIMS.Pages.VocationalTraining;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VocationalSearch extends CommonMethods{

	public WebDriver driver;
	
	
	@FindBy(xpath = Constants.VOCManagement_SearchProgCode)
	public WebElement VOCSearch_ProgCode;	
	@FindBy(xpath = Constants.VOCManagement_SearchProgName)
	public WebElement VOCSearch_ProgName;	
	@FindBy(xpath = Constants.VOCManagement_SearchProgDuration)
	public WebElement VOCSearch_ProgDuration;	


	@SuppressWarnings("unchecked")
	public <T extends VocationalSearch>T VOCForSearch (String ProgCode,String ProgName,
			String ProgDuration){
		
		VOCSearch_ProgCode.sendKeys(ProgCode);
		VOCSearch_ProgName.sendKeys(ProgName);
		VOCSearch_ProgDuration.sendKeys(ProgDuration + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());
	}

	public boolean successMessageAvaiable(){

		waitUntilVisible(driver, Constants.SearchPage_SuccessMessage);
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}

	public void clickFirstRecord() {

		waitForJSandJQueryToLoad(driver);
		waitAndClick(driver, Constants.VOCManagement_FirstRecord);
	}

}
