package com.ptl.PIMS.Pages.IncidenceManagement.Recapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;

public class RecaptureAddInmatePage extends SelectInmatePage{

	public RecaptureAddInmatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public RecaptureAddPage addNewRecapture(){
		
		firstInmateLink.click();
		return PageFactory.initElements(driver, RecaptureAddPage.class);
	}
}
