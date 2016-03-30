package com.ptl.PIMS.Pages.VocationalTraining;

import com.ptl.PIMS.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeVoc_ProgSelect extends VocationalSearch {

	public AuthorizeVoc_ProgSelect(WebDriver dr) {
		driver = dr;
	}

	public AuthorizeVoc SelectFirstVOC(){

		waitForJSandJQueryToLoad(driver);
		waitAndClick(driver, Constants.VOCManagement_FirstAuthRecord);
		AuthorizeVoc VOCAuthPage = PageFactory.initElements(driver, AuthorizeVoc.class);		
		return VOCAuthPage;		
	}

}
