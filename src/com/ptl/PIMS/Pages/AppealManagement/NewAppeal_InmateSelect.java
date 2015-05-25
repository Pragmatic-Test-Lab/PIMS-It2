package com.ptl.PIMS.Pages.AppealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;


public class NewAppeal_InmateSelect extends SelectInmatePage {
	
	public NewAppeal_InmateSelect(WebDriver dr){
		driver = dr;
	}

	public NewAppeal clickFirstInmate() {
		
		firstInmateLink.click();
		
		NewAppeal newAppealPage = PageFactory.initElements(driver, NewAppeal.class);
		return newAppealPage;
	}
	
}
