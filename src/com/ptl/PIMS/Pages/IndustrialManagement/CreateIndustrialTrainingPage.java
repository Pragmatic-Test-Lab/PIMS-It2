package com.ptl.PIMS.Pages.IndustrialManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CalendarPopup;
import com.ptl.PIMS.util.Constants;

public class CreateIndustrialTrainingPage {
	WebDriver driver;
	@FindBy(xpath = Constants.CreateEveningButton)
	WebElement create;
	@FindBy(xpath = Constants.SuccessMessageTraining)
	WebElement successMessageindustrialtraining;
	@FindBy(xpath = Constants.IndustrialTrainingTable1)
	WebElement industrialtablebody1;
	@FindBy(xpath = Constants.IndustrialTrainingTable2)
	WebElement industrialtablebody2;
	@FindBy(xpath = Constants.IndustrialTrainingTable3)
	WebElement industrialtablebody3;
	public CreateIndustrialTrainingPage(WebDriver dr){
		driver = dr;
	}

	public void EnterTrainingData(String industrialproduct1, String noofpieces1, String industrialgrade1, String industrytype1, String industrydivision1){
		int dataRows1 = initialRowCount(industrialtablebody1);
		int dataRows2 = initialRowCount(industrialtablebody2);
		int dataRows3 = initialRowCount(industrialtablebody3);
		CalendarPopup CLNDR = new CalendarPopup(driver);
		driver.findElement(By.xpath(Constants.industrialtrainingperformances)).click();
		driver.findElement(By.xpath(Constants.Addtrainingitem1)).click();
		CLNDR.selectDate(driver.findElement(By.xpath(Constants.IndustrialPerformanceDate + "[" + (dataRows1) + "]")), "2015-May-1");	
		driver.findElement(By.xpath(Constants.industrialproduct + "[" + (dataRows1) + "]")).sendKeys(industrialproduct1);
		driver.findElement(By.xpath(Constants.noofpieces + "[" + (dataRows1) + "]")).sendKeys(noofpieces1);
		driver.findElement(By.xpath(Constants.industrialworkpromotions)).click();
		driver.findElement(By.xpath(Constants.Addtrainingitem2)).click();
		driver.findElement(By.xpath(Constants.industrialgrade + "[" + (dataRows2) + "]")).sendKeys(industrialgrade1);
		CLNDR.selectDate(driver.findElement(By.xpath(Constants.IndustrialPromotionDate + "[" + (dataRows2) + "]")), "2015-May-1");	
		driver.findElement(By.xpath(Constants.industrialtradedivisions)).click();
		driver.findElement(By.xpath(Constants.Addtrainingitem3)).click();
		driver.findElement(By.xpath(Constants.industrytype + "[" + (dataRows3) + "]")).sendKeys(industrytype1);
		driver.findElement(By.xpath(Constants.tradedivision + "[" + (dataRows3) + "]")).sendKeys(industrydivision1);
		CLNDR.selectDate(driver.findElement(By.xpath(Constants.IndustrialTradeDate + "[" + (dataRows3) + "]")), "2015-May-1");	

	}

	public IndustrialTrainingPage ClickCreateButton(){
		create.click();
		IndustrialTrainingPage trainingpage = PageFactory.initElements(driver, IndustrialTrainingPage.class);
		return trainingpage;
	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}

}
