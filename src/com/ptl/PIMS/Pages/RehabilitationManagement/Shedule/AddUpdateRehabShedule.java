package com.ptl.PIMS.Pages.RehabilitationManagement.Shedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.RehabilitationManagement.SearchRehabShedule;
import com.ptl.PIMS.util.Constants;

public class AddUpdateRehabShedule extends SearchRehabShedule{

	
	@FindBy(xpath = Constants.RehabilitationManagement_NewSheduleButton)
	public WebElement NewSheduleButton;
	
	public AddUpdateRehabShedule(WebDriver dr){
		
		driver = dr;
	}
	
	public RehabSheduleAddPage gotoCreateNewShedule(){
		
		NewSheduleButton.click();
		return PageFactory.initElements(driver, RehabSheduleAddPage.class);
	}
	
	public RehabSheduleUpdatePage clickFirstShedule(){
		
		SheduleFirstRecord.click();
		return PageFactory.initElements(driver, RehabSheduleUpdatePage.class);		
	}
}
