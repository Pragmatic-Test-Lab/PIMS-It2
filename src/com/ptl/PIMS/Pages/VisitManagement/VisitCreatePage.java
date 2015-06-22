package com.ptl.PIMS.Pages.VisitManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class VisitCreatePage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.VisitManagement_CreateVisitInTime)
	public WebElement visitInTime;
	@FindBy(xpath = Constants.VisitManagement_CreateVisitOutTime)
	public WebElement visitOutTime;
	
	@FindBy(xpath = Constants.VisitManagement_VisitorTab)
	public WebElement visitorTab;	
	@FindBy(xpath = Constants.VisitManagement_VisitorTable)
	public WebElement visitorTable;
	@FindBy(xpath = Constants.VisitManagement_VisitorAddNew)
	public WebElement addNewVisitor;
	@FindBy(xpath = Constants.VisitManagement_ItemsTab)
	public WebElement itemTab;
	@FindBy(xpath = Constants.VisitManagement_ItemsTable)
	public WebElement itemTable;
	@FindBy(xpath = Constants.VisitManagement_ItemsAddNew)
	public WebElement addNewItem;	
	
	@FindBy(xpath = Constants.VisitManagement_CreateButton)
	public WebElement createButton;	
	

	public VisitCreatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public void fillVisitorDetails(String Name, String NIC, String Relationship, String Pass){
		
		//visitorTab.click();
		
		String[] names = Name.split(",");
		String[] NICs = NIC.split(",");
		String[] relationships = Relationship.split(",");
		String[] passes = Pass.split(",");
		
		
		int dataRows = initialRowCount(visitorTable);
		for (int i = 0; i < names.length; i++) {			
			addNewVisitor.click();
			
			driver.findElement(By.xpath(Constants.VisitManagement_VisitorName + "[" + (dataRows + i) +"]")).sendKeys(names[i]);
			driver.findElement(By.xpath(Constants.VisitManagement_VisitorNIC + "[" + (dataRows + i) +"]")).sendKeys(NICs[i]);
			driver.findElement(By.xpath(Constants.VisitManagement_VisitorRelationship + "[" + (dataRows + i) +"]")).sendKeys(relationships[i]);
			driver.findElement(By.xpath(Constants.VisitManagement_VisitorPass + "[" + (dataRows + i) +"]")).sendKeys(passes[i]);
		}		
	}
	
	public void fillItemDetails(String Description, String Quantity, String Value){
		
		itemTab.click();
		
		String[] descs = Description.split(",");
		String[] quantities = Quantity.split(",");
		String[] values = Value.split(",");
		
		
		int dataRows = initialRowCount(itemTable);
		for (int i = 0; i < descs.length; i++) {			
			addNewItem.click();
			
			driver.findElement(By.xpath(Constants.VisitManagement_ItemDescription + "[" + (dataRows + i) +"]")).sendKeys(descs[i]);
			driver.findElement(By.xpath(Constants.VisitManagement_ItemQuantity + "[" + (dataRows + i) +"]")).sendKeys(quantities[i]);
			driver.findElement(By.xpath(Constants.VisitManagement_ItemValue + "[" + (dataRows + i) +"]")).sendKeys(values[i]);
		}		
	}
	
	public VisitAddUpdatePage createVisit(String InTime){
		
		CalendarPopup CLNDR = new CalendarPopup(driver);		
		CLNDR.selectDateTime(visitInTime, InTime);
		
		createButton.click();
		return PageFactory.initElements(driver, VisitAddUpdatePage.class);
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}
}
