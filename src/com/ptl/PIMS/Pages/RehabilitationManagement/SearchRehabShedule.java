package com.ptl.PIMS.Pages.RehabilitationManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class SearchRehabShedule extends CommonMethods{
	
	protected WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagementSearch_SheProg)
	public WebElement SheduleSearch_Prog;
	@FindBy(xpath = Constants.RehabilitationManagementSearch_SheStart)
	public WebElement SheduleSearch_StartDate;
	@FindBy(xpath = Constants.RehabilitationManagementSearch_SheEnd)
	public WebElement SheduleSearch_EndDate;
	@FindBy(xpath = Constants.RehabilitationManagementSearch_SheOrg)
	public WebElement SheduleSearch_Oraganzation;
	
	@FindBy(xpath = Constants.RehabilitationManagement_FirstRecord)
	public WebElement SheduleFirstRecord;	

	@SuppressWarnings("unchecked")
	public <T extends SearchRehabShedule>T SheduleForSearch (String prog, String org,String start, String end){
		
		SheduleSearch_Prog.sendKeys(prog);
		SheduleSearch_Oraganzation.sendKeys(org);
		SheduleSearch_StartDate.sendKeys(start);
		SheduleSearch_EndDate.sendKeys(end + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());
	}
	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
