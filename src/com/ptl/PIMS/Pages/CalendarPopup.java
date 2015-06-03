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


	public void selectDate(WebElement calendarField, String Year, String Month, String Date){

		calendarField.click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToMonthSelection)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToYearSelection)).click(); 

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectYearFP + Year + Constants.CalendarPopup_SelectYearLP)).click();		
		driver.findElement(By.xpath(Constants.CalendarPopup_SelectMonthFP + Month + Constants.CalendarPopup_SelectMonthLP)).click();

		DateToBeSelected_XPath = Constants.CalendarPopup_SelectDayFP + Date + Constants.CalendarPopup_SelectDayLP + "[" + 
				NoOfElements(driver, Constants.CalendarPopup_SelectDayFP + Date + Constants.CalendarPopup_SelectDayLP) + "]";;
				driver.findElement(By.xpath(DateToBeSelected_XPath)).click();
	}


	public void selectDate(WebElement calendarField, String wholeDate){

		String[] splitDate = wholeDate.split("-");

		String year = splitDate[0];
		String month = splitDate[1];
		String day = splitDate[2];

		calendarField.click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToMonthSelection)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToYearSelection)).click(); 

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectYearFP + year + Constants.CalendarPopup_SelectYearLP)).click();		
		driver.findElement(By.xpath(Constants.CalendarPopup_SelectMonthFP + month + Constants.CalendarPopup_SelectMonthLP)).click();

		DateToBeSelected_XPath = Constants.CalendarPopup_SelectDayFP + day + Constants.CalendarPopup_SelectDayLP + "[" + 
				NoOfElements(driver, Constants.CalendarPopup_SelectDayFP + day + Constants.CalendarPopup_SelectDayLP) + "]";;
				driver.findElement(By.xpath(DateToBeSelected_XPath)).click();

	}

	public void selectDateTimeDefault(WebElement calendarField, String wholeDate){

		String[] splitDate = wholeDate.split("-");

		String year = splitDate[0];
		String month = splitDate[1];
		String day = splitDate[2];

		calendarField.click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToMonthSelection)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToYearSelection)).click(); 

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectYearFP + year + Constants.CalendarPopup_SelectYearLP)).click();		
		driver.findElement(By.xpath(Constants.CalendarPopup_SelectMonthFP + month + Constants.CalendarPopup_SelectMonthLP)).click();

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectDayFP + day + Constants.CalendarPopup_SelectDayLP)).click();

		String hour = "0";
		String min = "00";

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectHourFP + hour + Constants.CalendarPopup_SelectHourLP)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_SelectMinuteFP + hour + ":" + min + Constants.CalendarPopup_SelectMinuteLP)).click();
	}

	public void selectDateTime(WebElement calendarField, String wholeDate){

		String[] splitDate = wholeDate.split("-");

		String year = splitDate[0];
		String month = splitDate[1];
		String day = splitDate[2];

		calendarField.click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToMonthSelection)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_GoToYearSelection)).click(); 

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectYearFP + year + Constants.CalendarPopup_SelectYearLP)).click();		
		driver.findElement(By.xpath(Constants.CalendarPopup_SelectMonthFP + month + Constants.CalendarPopup_SelectMonthLP)).click();

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectDayFP + day + Constants.CalendarPopup_SelectDayLP)).click();

		String hour = splitDate[3];
		String min = splitDate[4];

		driver.findElement(By.xpath(Constants.CalendarPopup_SelectHourFP + hour + Constants.CalendarPopup_SelectHourLP)).click();
		driver.findElement(By.xpath(Constants.CalendarPopup_SelectMinuteFP + hour + ":" + min + Constants.CalendarPopup_SelectMinuteLP)).click();
	}


}
