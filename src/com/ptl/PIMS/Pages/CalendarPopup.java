package com.ptl.PIMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ptl.PIMS.util.Constants;


public class CalendarPopup extends CommonMethods{
	
	WebDriver driver;

	String YearText_FirstPart = Constants.CalendarPopup_YearText_FirstPart;
	String YearText_LastPart = Constants.CalendarPopup_YearText_LastPart;
	String MonthText_FirstPart = Constants.CalendarPopup_MonthText_FirstPart;
	String MonthText_LastPart = Constants.CalendarPopup_MonthText_LastPart;
	String dateText_FirstPart = Constants.CalendarPopup_DateText_FirstPart;
	String dateText_LastPart = Constants.CalendarPopup_DateText_LastPart;	
	String YearToBeSelected_XPath = "";
	String MonthToBeSelected_XPath = "";
	String DateToBeSelected_XPath = "";
	
			
	public CalendarPopup(WebDriver dr){
		driver = dr;
	}
	
	
	public void selectDate(WebElement calendarInputField, String Year, String Month, String Date){
		
		calendarInputField.click(); 
		
		WebElement monthYearText = driver.findElement(By.xpath(Constants.CalendarPopup_MonthYearText));
		monthYearText.click(); // click on the month & year text

		WebElement yearText = driver.findElement(By.xpath(Constants.CalendarPopup_YearText));
		yearText.click(); //click on the top year text
		
		YearToBeSelected_XPath = YearText_FirstPart + Year + MonthText_LastPart;
		driver.findElement(By.xpath(YearToBeSelected_XPath)).click(); //click on the selected year text
		MonthToBeSelected_XPath = YearText_FirstPart + Month + MonthText_LastPart;
		driver.findElement(By.xpath(MonthToBeSelected_XPath)).click(); //click on the selected month text
		DateToBeSelected_XPath = dateText_FirstPart + Date + dateText_LastPart;
		driver.findElement(By.xpath(DateToBeSelected_XPath)).click(); //click on the selected date text
		
	}
	
	
	public void selectDate(WebElement calendarInputField, String wholeDate){
		
		String[] splitDate = wholeDate.split("-");
		
		String year = splitDate[0];
		String month = splitDate[1];
		String day = splitDate[2];
		
		calendarInputField.click(); // open the calendar popup
		
		WebElement monthYearText = driver.findElement(By.xpath(Constants.CalendarPopup_MonthYearText));
		monthYearText.click(); // click on the month & year text

		WebElement yearText = driver.findElement(By.xpath(Constants.CalendarPopup_YearText));
		yearText.click(); //click on the top year text
		
		YearToBeSelected_XPath = YearText_FirstPart + year + YearText_LastPart;
		driver.findElement(By.xpath(YearToBeSelected_XPath)).click(); //click on the selected year text
		MonthToBeSelected_XPath = MonthText_FirstPart + month + MonthText_LastPart + "[" + NoOfElements(driver, MonthText_FirstPart + month + MonthText_LastPart) + "]";
		driver.findElement(By.xpath(MonthToBeSelected_XPath)).click(); //click on the selected month text
		DateToBeSelected_XPath = dateText_FirstPart + day + dateText_LastPart + "[" + NoOfElements(driver, dateText_FirstPart + day + dateText_LastPart) + "]";;
		driver.findElement(By.xpath(DateToBeSelected_XPath)).click(); //click on the selected date text
		
	}

	
	//created for admission Date
	public void selectDateOfAdmission(WebElement calendarInputField, String wholeDate){
		
		String[] splitDate = wholeDate.split("-");
		
		String year = splitDate[0];
		String month = splitDate[1];
		String day = splitDate[2];
		
		calendarInputField.click();
		driver.findElement(By.xpath(Constants.CalendarPopup_AdmissionMonthYearText)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_AdmissionYearText)).click(); 
		
		YearToBeSelected_XPath = Constants.CalendarPopup_AdmissionYearText_FirstPart + year + Constants.CalendarPopup_AdmissionYearText_LastPart;
		driver.findElement(By.xpath(YearToBeSelected_XPath)).click();
		
		MonthToBeSelected_XPath = MonthText_FirstPart + month + MonthText_LastPart + "[" + NoOfElements(driver, MonthText_FirstPart + month + MonthText_LastPart) + "]";
		driver.findElement(By.xpath(MonthToBeSelected_XPath)).click();
		
		DateToBeSelected_XPath = dateText_FirstPart + day + dateText_LastPart + "[" + NoOfElements(driver, dateText_FirstPart + day + dateText_LastPart) + "]";;
		driver.findElement(By.xpath(DateToBeSelected_XPath)).click();
		
		driver.findElement(By.xpath("//*[@class='hour' and text()='0:00']")).click();
		driver.findElement(By.xpath("//*[@class='minute' and text()='0:00']")).click();

		
	}

}
