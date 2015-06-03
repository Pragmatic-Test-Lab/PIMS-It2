package com.ptl.PIMS.Pages.EscortManagement.Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CalendarPage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.EscortManagement_CalendarCaseTable)
	public WebElement caseTable;
	@FindBy(xpath = Constants.EscortManagement_CalendarAddNew)
	public WebElement addNewButton;
	@FindBy(xpath = Constants.EscortManagement_UpdateButton)
	public WebElement updateButton;
	
	public CalendarPage(WebDriver dr){
		
		driver = dr;
	}
	
	public CalendarInmateSelectPage addCourtDates(String Case, String NCDate){
		
		String[] cases = Case.split(",");
		String[] ncDates = NCDate.split(",");
		
		int dataRows = initialRowCount(caseTable);

		for (int i = 0; i < cases.length; i++) {
			addNewButton.click();
			driver.findElement(By.xpath(Constants.RehabilitationManagement_ParticipantInmate + "[" + (dataRows + i) + "]")).sendKeys(cases[i]);
			driver.findElement(By.xpath(Constants.RehabilitationManagement_ParticipantRemark + "[" + (dataRows + i) + "]")).sendKeys(ncDates[i]);
		}
		
		updateButton.click();		
		return PageFactory.initElements(driver, CalendarInmateSelectPage.class);
	}
	
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();
		
		if (size == 1) return size;
		else return size - 1;
				
	}
}
