package com.ptl.PIMS.Pages.IncidenceManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;

public class IncidenceAddInmateSelectionPage extends SelectInmatePage{

	public IncidenceAddInmateSelectionPage(WebDriver dr){
		
		driver = dr;
	}
	
	public IncidenceAddPage addNewIncidence(){
		
		firstInmateLink.click();
		return PageFactory.initElements(driver, IncidenceAddPage.class);
	}
}
