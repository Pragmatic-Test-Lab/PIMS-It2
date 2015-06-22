package com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.VisitManagement.SearchVisit;
import com.ptl.PIMS.Pages.VisitManagement.VisitAddSelectInmatePage;
import com.ptl.PIMS.Pages.VisitManagement.VisitUpdatePage;
import com.ptl.PIMS.util.Constants;

public class AdditionalVisitAddUpdatePage extends SearchVisit{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.VisitManagement_CreateVisitButton)
	public WebElement CreateVisitButton;
	
	public AdditionalVisitAddUpdatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public VisitAddSelectInmatePage CreateNewVisit(){
		
		CreateVisitButton.click();
		return PageFactory.initElements(driver, VisitAddSelectInmatePage.class);
	}
	
	public VisitUpdatePage EditFirstVisit(){
		
		firstRecord.click();
		return PageFactory.initElements(driver, VisitUpdatePage.class);
	}

}
