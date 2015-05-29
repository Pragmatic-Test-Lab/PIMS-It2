package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeVoc_ProgSelect extends VocationalSearch {

	
	public AuthorizeVoc_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVoc SelectFirstVOC(){
		
		VOCFirstRecord.click();
		AuthorizeVoc VOCAuthPage = PageFactory.initElements(driver, AuthorizeVoc.class);		
		return VOCAuthPage;		
	}

}
