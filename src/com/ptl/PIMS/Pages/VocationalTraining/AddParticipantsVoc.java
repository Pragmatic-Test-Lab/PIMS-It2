package com.ptl.PIMS.Pages.VocationalTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AddParticipantsVoc {
	WebDriver driver;

	@FindBy(xpath = Constants.VOCParticipants_Table)
	public WebElement ParticipantsTable;
	@FindBy(xpath = Constants.VOCParticipants_AddNew)
	public WebElement AddNewButton;

	@FindBy(xpath = Constants.VOCParticipants_UpdateButton)
	public WebElement UpdateButton;

	public AddParticipantsVoc(WebDriver dr) {
		driver = dr;
	}
	
	public AddParticipantsVoc_ProgSelect addParticipants(String RegNos, String Grades,
			String Remarks){
		
		String regNo[] = RegNos.split(",");
		//String participation[] = isParticipated.split(",");
		String grade[] = Grades.split(",");
		String remark[] = Remarks.split(",");
		
		int dataRows = initialRowCount(ParticipantsTable);
		
		for (int i = 0; i < regNo.length; i++) {
			
			AddNewButton.click();
			
			driver.findElement(By.xpath(Constants.VOCParticipants_RegNo + "[" + (dataRows + i) + "]")).sendKeys(regNo[i]);
			driver.findElement(By.xpath(Constants.VOCParticipants_Grade + "[" + (dataRows + i) + "]")).sendKeys(grade[i]);
			driver.findElement(By.xpath(Constants.VOCParticipants_Remarks + "[" + (dataRows + i) + "]")).sendKeys(remark[i]);
		}
		
		UpdateButton.click();
		
		AddParticipantsVoc_ProgSelect vocPartMainPage = PageFactory.initElements(
				driver, AddParticipantsVoc_ProgSelect.class);
		return vocPartMainPage;
	}
	
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}
}
