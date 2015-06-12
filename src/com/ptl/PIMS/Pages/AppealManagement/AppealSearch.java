package com.ptl.PIMS.Pages.AppealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class AppealSearch  extends CommonMethods{

	
	public WebDriver driver;

	@FindBy(xpath = Constants.AppealManagement_RegNoSearch)
	public WebElement AppealSearch_RegNo;
	@FindBy(xpath = Constants.AppealManagement_BioIdSearch)
	public WebElement AppealSearch_BioId;
	@FindBy(xpath = Constants.AppealManagement_NameSearch)
	public WebElement AppealSearch_Name;
	@FindBy(xpath = Constants.AppealManagement_DateSearch)
	public WebElement AppealSearch_Date;
	@FindBy(xpath = Constants.AppealManagement_ReasonSearch)
	public WebElement AppealSearch_Reason;
	
	@FindBy(xpath = Constants.AppealManagement_FirstAppeal)
	public WebElement AppealFirstRecord;	

	@SuppressWarnings("unchecked")
	public <T extends AppealSearch>T AppealForSearch (String RegNo,String BioId,
			String Name,String Date, String Reason){
		
		AppealSearch_RegNo.sendKeys(RegNo);
		AppealSearch_BioId.sendKeys(BioId);
		AppealSearch_Name.sendKeys(Name);
		AppealSearch_Date.sendKeys(Date);
		AppealSearch_Reason.sendKeys(Reason + Keys.ENTER);
		
		return (T)PageFactory.initElements(driver, this.getClass());
	}
	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
