package com.ptl.PIMS.Pages.IncidenceManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class IncidenceAddPage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.IncidenceManagement_IncidenceTable)
	WebElement IncidenceTable;
	@FindBy(xpath = Constants.IncidenceManagement_AddNew)
	WebElement addNewButton;
	@FindBy(xpath = Constants.IncidenceManagement_UpdateButton)
	WebElement updateButton;
	
	public IncidenceAddPage(WebDriver dr){
		
		driver = dr;
	}
	
	public IncidenceAddInmateSelectionPage addIncidences(String Date, String EventType, String EventD, String Action, String Place){
		
		String[] dates = Date.split(",");
		String[] eventTypes = EventType.split(",");
		String[] eventDs = EventD.split(",");
		String[] actions = Action.split(",");
		String[] places = Place.split(",");
		
		int dataRows = initialRowCount(IncidenceTable);
		CalendarPopup CLNDR = new CalendarPopup(driver);
		
		for (int i = 0; i < dates.length; i++) {
			addNewButton.click();
			
			CLNDR.selectDateTimeDefault(driver.findElement(By.xpath(Constants.IncidenceManagement_Date + "[" + (dataRows + i) + "]")), dates[i]);

			driver.findElement(By.xpath(Constants.IncidenceManagement_EventType + "[" + (dataRows + i) + "]")).sendKeys(eventTypes[i]);
			driver.findElement(By.xpath(Constants.IncidenceManagement_EventD + "[" + (dataRows + i) + "]")).sendKeys(eventDs[i]);
			driver.findElement(By.xpath(Constants.IncidenceManagement_Action + "[" + (dataRows + i) + "]")).sendKeys(actions[i]);
			driver.findElement(By.xpath(Constants.IncidenceManagement_Place + "[" + (dataRows + i) + "]")).sendKeys(places[i]);
		}
		
		updateButton.click();
		return PageFactory.initElements(driver, IncidenceAddInmateSelectionPage.class);
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();	
		return size;
	}

}
