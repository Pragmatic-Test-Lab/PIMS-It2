package com.ptl.PIMS.Pages.VisitManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class VisitAddUpdatePage extends SearchVisit{

	@FindBy(xpath = Constants.VisitManagement_CreateVisitButton)
	public WebElement CreateVisitButton;
	
	public VisitAddUpdatePage(WebDriver dr){
		
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
