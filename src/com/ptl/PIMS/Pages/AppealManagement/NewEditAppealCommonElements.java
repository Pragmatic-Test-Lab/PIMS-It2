package com.ptl.PIMS.Pages.AppealManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class NewEditAppealCommonElements {

	WebDriver driver;

	@FindBy(xpath = Constants.AppealManagement_AppealDate)
	public WebElement AppealDate ;
	@FindBy(xpath = Constants.AppealManagement_AppealCase)
	public WebElement AppealCase;
	@FindBy(xpath = Constants.AppealManagement_AppealCourt)
	public WebElement AppealCourt;
	@FindBy(xpath = Constants.AppealManagement_IsExternalAppeal)
	public WebElement IsAppleaExternal;
	@FindBy(xpath = Constants.AppealManagement_WarrantUpload)
	public WebElement WarrantUploadButton;
	@FindBy(xpath = Constants.AppealManagement_AppealFormUpload)
	public WebElement AppealFormUploadButton;
	@FindBy(xpath = Constants.AppealManagement_AppealOffenseCode)
	public WebElement appealoffensecode;
	
	@FindBy(xpath = Constants.AppealManagement_ReasonTab)
	public WebElement ReasonTab;
	@FindBy(xpath = Constants.AppealManagement_AppealReason)
	public WebElement Reason;
	
	@FindBy(xpath = Constants.AppealManagement_RequestTab)
	public WebElement RequestTab;
	@FindBy(xpath = Constants.AppealManagement_AppealRequest)
	public WebElement Request;
	
	@FindBy(xpath = Constants.AppealManagement_AddUpdateButton)
	public WebElement SubmitButton;
	
	
	// date format yyyy-MMM-dd (e.g:2015-Feb-12)
	public void addAppealDate(String appealDate){
		
		CalendarPopup calenderSelect = new CalendarPopup(driver);
		calenderSelect.selectDate(AppealDate, appealDate);
	}
	
	public void editField(WebElement element, String newText){
		
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(newText);
		
	}

}
