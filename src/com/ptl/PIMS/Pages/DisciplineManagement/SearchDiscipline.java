package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class SearchDiscipline extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath = Constants.DisciplineManagement_SearchComId)
	public WebElement ComID;	
	@FindBy(xpath = Constants.DisciplineManagement_SearchRegNo)
	public WebElement RegNo;	
	@FindBy(xpath = Constants.DisciplineManagement_SearchDOIncident)
	public WebElement DOIncident;	
	@FindBy(xpath = Constants.DisciplineManagement_SearchDOInquiry)
	public WebElement DOInquiry;
	
	@FindBy(xpath = Constants.DisciplineManagement_FirstPencil)
	public WebElement FirstRecord;

	@SuppressWarnings("unchecked")
	public <T extends SearchDiscipline>T DisciplineForSearch (String comId, String regNo,String doIncident, String doInquiry){
		
		ComID.sendKeys(comId);
		RegNo.sendKeys(regNo);
		DOIncident.sendKeys(doIncident);
		DOInquiry.sendKeys(doInquiry + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());
	}
	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
