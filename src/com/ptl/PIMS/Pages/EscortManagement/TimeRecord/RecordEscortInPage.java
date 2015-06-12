package com.ptl.PIMS.Pages.EscortManagement.TimeRecord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class RecordEscortInPage {

	WebDriver driver;
	@FindBy(xpath = Constants.EscortManagement_EscortTable)
	WebElement escortTable;
	
	@FindBy(xpath = Constants.EscortManagement_UpdateButton)
	WebElement updateButton;
	
	public RecordEscortInPage(WebDriver dr){
		
		driver = dr;
	}
	
	public void addEscortInTime(String RegNo, String Case, String Court, String InTime){
		
		String[] regNos = RegNo.split(",");
		String[] cases = Case.split(",");
		String[] courts = Court.split(",");
		String[] inTimes = InTime.split(",");
		
		int dataRows = initialRowCount(escortTable);
		CalendarPopup CLNDR = new  CalendarPopup(driver);
		
		for (int j = 0; j < regNos.length; j++) {
			for (int i = 1; i < dataRows; i++) {
				
				String EscRegNo = driver.findElement(By.xpath(Constants.EscortManagement_EscortRegistrationNo + "[" + i + "]")).getText();
				String EscCase = driver.findElement(By.xpath(Constants.EscortManagement_EscortCase + "[" + i + "]")).getText();
				String EscCourt = driver.findElement(By.xpath(Constants.EscortManagement_EscortCourt + "[" + i + "]")).getAttribute("value");
				
				if(regNos[j].equals(EscRegNo) && cases[j].equals(EscCase) && courts[j].equals(EscCourt) && !inTimes.equals(""))
					CLNDR.selectDateTimeDefault(driver.findElement(By.xpath(Constants.EscortManagement_EscortInTime + "[" + i + "]")), inTimes[j]);
			}
		}		
	}
	
	
	public RecordEscortInSelectPage updateEscort(){
		
		updateButton.click();
		return PageFactory.initElements(driver, RecordEscortInSelectPage.class);
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();	
		return size;
	}
	
}
