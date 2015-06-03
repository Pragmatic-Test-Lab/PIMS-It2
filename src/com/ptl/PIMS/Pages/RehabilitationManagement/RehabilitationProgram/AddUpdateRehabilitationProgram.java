package com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.RehabSheduleUpdatePage;
import com.ptl.PIMS.util.Constants;

public class AddUpdateRehabilitationProgram extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_searchCode)
	public WebElement RehabSearch_searchCode;	
	@FindBy(xpath = Constants.RehabilitationManagement_searchName)
	public WebElement RehabSearch_searchName;	
	@FindBy(xpath = Constants.RehabilitationManagement_newProgramButton)
	public WebElement RehabSearch_CreateRehabProgramButton;	
	@FindBy(xpath = Constants.RehabilitationManagement_FirstRecord)
	public WebElement RehabFirstRecord;	

	public AddUpdateRehabilitationProgram(WebDriver dr){
		
		driver = dr;
	}

	public AddUpdateRehabilitationProgram RehabForSearch (String code, String name){
		
		RehabSearch_searchCode.sendKeys(code);
		RehabSearch_searchName.sendKeys(name + Keys.ENTER);
		
		return PageFactory.initElements(driver, AddUpdateRehabilitationProgram.class);
	}
	
	public RehabilitationProgramUpdatePage clickFirstRehabRecord(){
		
		RehabFirstRecord.click();
		return PageFactory.initElements(driver, RehabilitationProgramUpdatePage.class);		
	}
	
	public RehabilitationProgramAddPage createNewRehabRecord(){
		
		RehabSearch_CreateRehabProgramButton.click();
		return PageFactory.initElements(driver, RehabilitationProgramAddPage.class);		
	}
	
	
	
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	}
}
