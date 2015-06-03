package com.ptl.PIMS.Pages.Iteration1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class AuthorizeAdmissionPage {

    WebDriver driver;
  
    @FindBy(xpath = Constants.Admission_InmateCategory)
    WebElement InmateCategory;
    @FindBy(xpath = Constants.Admission_DOAdmission)
    WebElement DOAdmission;
    @FindBy(xpath = Constants.Admission_RegNum)
    WebElement RegNum;
    @FindBy(xpath = Constants.AuthorizeButton)
	WebElement AuthorizeInamteAdmissionButton;
    
    @FindBy(xpath = Constants.Admission_InmateCourtTableBody)
	WebElement CaseTabTable;
    @FindBy(xpath = Constants.Admission_InmateCourtDetail_AddNew)
	WebElement AddNewCase;
	
    
	public AuthorizeAdmissionPage(WebDriver dr){
		driver = dr;
	}
	
	public void fillCase(String caseCourts, String caseNos,
			String caseDates, String senDates) {
		
		String[] court = caseCourts.split(",");
		String[] caseNo = caseNos.split(",");
		String[] conviction = caseDates.split(",");
		String[] sentence = senDates.split(",");
		
		int dataRows = initialRowCount(CaseTabTable);
		CalendarPopup CLNDR = new CalendarPopup(driver);
		
		for(int i=0; i< court.length; i++){		
			
		AddNewCase.click();
		
		driver.findElement(By.xpath(Constants.Admission_InmateCourtDetail_Court + "[" + (dataRows + i) + "]")).sendKeys(court[i]);
		driver.findElement(By.xpath(Constants.Admission_InmateCourtDetail_CaseNumber + "[" + (dataRows + i) + "]")).sendKeys(caseNo[i]);
		
		CLNDR.selectDate(driver.findElement(By.xpath(Constants.Admission_InmateCourtDetail_DateConviction + "[" + (dataRows + i) + "]")), conviction[i]);		
		CLNDR.selectDate(driver.findElement(By.xpath(Constants.Admission_InmateCourtDetail_DateSentence + "[" + (dataRows + i) + "]")), sentence[i]);
		}		
	}
	

	public void changeInmateCategory(String category) {
		
		InmateCategory.sendKeys(category);		
	}
	
	public void changeAdmissionDate(String date){
		
		CalendarPopup CLNDR = new CalendarPopup(driver);
		
		CLNDR.selectDateTimeDefault(DOAdmission, date);
	}
	
	public String getRegistrationNumber(){
		
		return RegNum.getAttribute("value");
	}
	
	public AuthorizeAdmissionInmatePage doAuthorizeAdmission(){
		
		AuthorizeInamteAdmissionButton.submit();
		
		AuthorizeAdmissionInmatePage authorizeAdmissionSelectPage = PageFactory.initElements(driver, AuthorizeAdmissionInmatePage.class);
		return authorizeAdmissionSelectPage;
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}



	
}
