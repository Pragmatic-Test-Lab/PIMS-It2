package com.ptl.PIMS.Pages.IndustrialManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class IndustrialTrainingPage extends CommonMethods{
	
	WebDriver driver;
	@FindBy(xpath = Constants.TrainingRecord)
	WebElement trainingrecord;
	
	public IndustrialTrainingPage(WebDriver dr){
		driver = dr;
	}

	public CreateIndustrialTrainingPage ClickTrainingRecordButton(){
		trainingrecord.click();
		CreateIndustrialTrainingPage trainingpage = PageFactory.initElements(driver, CreateIndustrialTrainingPage.class);
		return trainingpage;
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
}
