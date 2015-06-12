package com.ptl.PIMS.Pages.EscortManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class EscortUpdatePage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.EscortManagement_EscortTable)
	WebElement escortTable;
	@FindBy(xpath = Constants.EscortManagement_UpdateButton)
	WebElement updateButton;
	
	public EscortUpdatePage(WebDriver dr){
		
		driver = dr;
	}
	
	
	public void editEscortDetails(String RegNo, String Case, String Court, String EscortDetail){
		
		String[] regNos = RegNo.split(",");
		String[] cases = Case.split(",");
		String[] courts = Court.split(",");
		String[] escortDetails = EscortDetail.split(",");
		
		int dataRows = initialRowCount(escortTable);
		
		for (int j = 0; j < regNos.length; j++) {
			for (int i = 1; i < dataRows; i++) {
				
				String EscRegNo = driver.findElement(By.xpath(Constants.EscortManagement_EscortRegistrationNo + "[" + i + "]")).getText();
				String EscCase = driver.findElement(By.xpath(Constants.EscortManagement_EscortCase + "[" + i + "]")).getText();
				String EscCourt = driver.findElement(By.xpath(Constants.EscortManagement_EscortCourt + "[" + i + "]")).getAttribute("value");
				
				if(regNos[j].equals(EscRegNo) && cases[j].equals(EscCase) && courts[j].equals(EscCourt) && !escortDetails.equals(""))
					editElement(driver.findElement(By.xpath(Constants.EscortManagement_EscortDetails + "[" + i + "]")), escortDetails[j]);
			}
		}		
	}
	
	public EscortAddUpdatePage clickUpdate(){
		
		updateButton.click();
		return PageFactory.initElements(driver, EscortAddUpdatePage.class);
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();	
		return size;
	}
	
	
	public void editElement(WebElement element, String newValue){
		
		element.click();
		element.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		element.sendKeys(newValue);
		
	}
}
