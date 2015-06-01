package com.ptl.PIMS.Pages.RehabilitationManagement.Participants;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AddParticipantsPage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_ParticipantTable)
	public WebElement ParticipantTable;
	@FindBy(xpath = Constants.RehabilitationManagement_AddNew)
	public WebElement AddNewButton;
	@FindBy(xpath = Constants.RehabilitationManagement_UpdateButton)
	public WebElement UpdateButton;
	
	public AddParticipantsPage(WebDriver dr){
		
		driver = dr;
	}
	
	
	public AddParticipantsSelectProg addParticipants(String RegNos, String Remarks){
		
		String[] regNos = RegNos.split(",");
		String[] remarks = Remarks.split(",");
		
		int dataRows = initialRowCount(ParticipantTable);

		for (int i = 0; i < regNos.length; i++) {
			AddNewButton.click();
			driver.findElement(By.xpath(Constants.RehabilitationManagement_ParticipantInmate + "[" + (dataRows + i) + "]")).sendKeys(regNos[i]);
			driver.findElement(By.xpath(Constants.RehabilitationManagement_ParticipantRemark + "[" + (dataRows + i) + "]")).sendKeys(remarks[i]);
		}
		
		UpdateButton.click();		
		return PageFactory.initElements(driver, AddParticipantsSelectProg.class);
	}
	
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}
}
