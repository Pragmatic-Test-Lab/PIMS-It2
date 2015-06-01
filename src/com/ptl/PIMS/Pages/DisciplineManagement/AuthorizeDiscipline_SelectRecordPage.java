package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeDiscipline_SelectRecordPage extends SearchDiscipline{

	@FindBy(xpath = Constants.DisciplineManagement_FirstOk)
	public WebElement FirstRecord;
	
	public AuthorizeDiscipline_SelectRecordPage(WebDriver dr){
		
		driver = dr;
	}
	
	public AuthorizeDisciplinePage SelectFirstDiscipline(){
		
		FirstRecord.click();
		return PageFactory.initElements(driver, AuthorizeDisciplinePage.class);		
	}
}
