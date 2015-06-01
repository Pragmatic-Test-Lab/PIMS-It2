package com.ptl.PIMS.Pages.RehabilitationManagement.Shedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class RehabSheduleAddPage extends SheduleCommonElements {

	@FindBy(xpath = Constants.RehabilitationManagement_CreateButton)
	WebElement CreateButton;
	
	public RehabSheduleAddPage(WebDriver dr) {

		driver = dr;
	}

	public AddUpdateRehabShedule createRehabShedule(String program, String start, String end,String organization) {

		Program.sendKeys(program);

		CalendarPopup CLNDR = new CalendarPopup(driver);

		CLNDR.selectDate(StartDate, start);
		CLNDR.selectDate(EndDate, end);

		Organization.sendKeys(organization);

		CreateButton.click();
		
		return PageFactory.initElements(driver, AddUpdateRehabShedule.class);
	}

}
