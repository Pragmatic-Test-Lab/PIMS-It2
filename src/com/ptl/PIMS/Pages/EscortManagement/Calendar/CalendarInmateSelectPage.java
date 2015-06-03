package com.ptl.PIMS.Pages.EscortManagement.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;

public class CalendarInmateSelectPage extends SelectInmatePage {

	public CalendarInmateSelectPage(WebDriver dr) {

		driver = dr;
	}

	public CalendarPage selectFirstInmate() {

		firstInmateLink.click();
		return PageFactory.initElements(driver, CalendarPage.class);
	}
}
