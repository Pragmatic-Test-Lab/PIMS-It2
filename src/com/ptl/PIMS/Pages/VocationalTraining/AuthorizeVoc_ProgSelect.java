package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AuthorizeVoc_ProgSelect extends VocationalSearch {

	@FindBy(xpath = Constants.VOCManagement_FirstAuthRecord)
	public WebElement VOCAuthFirstRecord;
	
	public AuthorizeVoc_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVoc SelectFirstVOC(){
		
		VOCAuthFirstRecord.click();
		AuthorizeVoc VOCAuthPage = PageFactory.initElements(driver, AuthorizeVoc.class);		
		return VOCAuthPage;		
	}

}
