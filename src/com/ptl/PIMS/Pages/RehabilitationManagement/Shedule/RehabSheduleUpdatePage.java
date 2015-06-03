package com.ptl.PIMS.Pages.RehabilitationManagement.Shedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class RehabSheduleUpdatePage extends SheduleCommonElements{

	@FindBy(xpath = Constants.RehabilitationManagement_UpdateButton)
	WebElement UpdateButton;
	
	public RehabSheduleUpdatePage(WebDriver dr) {

		driver = dr;
	}
	
	public AddUpdateRehabShedule editRehabShedule(String program, String start, String end,String organization) {

		editField(Program,program);

		CalendarPopup CLNDR = new CalendarPopup(driver);

		CLNDR.selectDate(StartDate, start);
		CLNDR.selectDate(EndDate, end);

		editField(Organization,organization);

		UpdateButton.click();
		
		return PageFactory.initElements(driver, AddUpdateRehabShedule.class);
	}
}
