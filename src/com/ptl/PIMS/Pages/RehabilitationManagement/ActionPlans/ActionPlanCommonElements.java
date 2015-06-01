package com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class ActionPlanCommonElements {

	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_APYear)
	public WebElement APYear;	

	@FindBy(xpath = Constants.RehabilitationManagement_RehabTable)
	public WebElement RehabTable;	
	@FindBy(xpath = Constants.RehabilitationManagement_APRehabProgram)
	public WebElement APRehabProg;	
	@FindBy(xpath = Constants.RehabilitationManagement_APRehabStart)
	public WebElement APRehabStart;	
	@FindBy(xpath = Constants.RehabilitationManagement_APRehabEnd)
	public WebElement APRehabEnd;	
	@FindBy(xpath = Constants.RehabilitationManagement_APRehabCost)
	public WebElement APRehabCost;	
	
	@FindBy(xpath = Constants.RehabilitationManagement_AddNew)
	public WebElement AddNew;
	
	public void AddRehabilitationPrograms(String year, String RehabProgram, String RehabStart, String RehabEnd, String RehabCost){
		
		APYear.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		APYear.sendKeys(year);
		
		String[] programs = RehabProgram.split(",");
		String[] starts = RehabStart.split(",");
		String[] ends = RehabEnd.split(",");
		String[] costs = RehabCost.split(",");
		
		int dataRows = initialRowCount(RehabTable);
		CalendarPopup CLNDR = new CalendarPopup(driver);

		for (int i = 0; i < programs.length; i++) {			
			AddNew.click();
			
			driver.findElement(By.xpath(Constants.RehabilitationManagement_APRehabProgram + "[" + (dataRows + i) +"]")).sendKeys(programs[i]);
			
			CLNDR.selectDate(driver.findElement(By.xpath(Constants.RehabilitationManagement_APRehabStart + "[" + (dataRows + i) +"]")), starts[i]);
			CLNDR.selectDate(driver.findElement(By.xpath(Constants.RehabilitationManagement_APRehabEnd + "[" + (dataRows + i) +"]")), ends[i]);

			driver.findElement(By.xpath(Constants.RehabilitationManagement_APRehabCost + "[" + (dataRows + i) +"]")).sendKeys(costs[i]);
		}		
		
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}
	
}
