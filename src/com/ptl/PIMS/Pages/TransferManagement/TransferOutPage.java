package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class TransferOutPage extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.TransferOutCreate)
	WebElement createtransferoutaddmission;
		
	public TransferOutPage(WebDriver dr){
		driver = dr;
	}
	
	public SelectTransferOutAdmissionPage getCreateTransferOutPageAdmissionPage(){
		
		createtransferoutaddmission.click();
		SelectTransferOutAdmissionPage createtransferoutaddmissionPage = PageFactory.initElements(driver, SelectTransferOutAdmissionPage.class);
		return createtransferoutaddmissionPage;	
	}
	
	public boolean successMessageAvaiable(){
		
		return checkElementIsPresent(driver, By.xpath(Constants.SearchPage_SuccessMessage));
	}
	
	public String getSuccessMessage(){
		
		return driver.findElement(By.xpath(Constants.SearchPage_SuccessMessage)).getText();
	} 
	
}
