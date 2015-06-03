package com.ptl.PIMS.Pages.IncidenceManagement.Recapture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class RecaptureAddPage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.IncidenceManagement_IncidenceTable)
	WebElement IncidenceTable;
	@FindBy(xpath = Constants.IncidenceManagement_UpdateButton)
	WebElement updateButton;
	
	public RecaptureAddPage(WebDriver dr){
		
		driver = dr;
	}
	
	public RecaptureAddInmatePage addRecapture(String EventD, String Action, String RecapDate){
		
		int dataRows = initialRowCount(IncidenceTable);
		CalendarPopup CLNDR = new CalendarPopup(driver);
		
		for (int i = 1; i < dataRows; i++) {
			String eventDescription = driver.findElement(By.xpath(Constants.IncidenceManagement_EventD + "[" + i + "]")).getAttribute("value");
			String action = driver.findElement(By.xpath(Constants.IncidenceManagement_Action + "[" + i + "]")).getAttribute("value");
			
			if(eventDescription.equals(EventD) && action.equals(Action))
				CLNDR.selectDate(driver.findElement(By.xpath((Constants.IncidenceManagement_RecaptureDate + "[" + i + "]"))), RecapDate);
		}
		
		updateButton.click();
		return PageFactory.initElements(driver, RecaptureAddInmatePage.class);
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();	
		
		if(size == 1) return size;
		else return size - 1;
	}

}
