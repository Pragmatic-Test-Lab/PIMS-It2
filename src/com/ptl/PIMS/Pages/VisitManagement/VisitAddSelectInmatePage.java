package com.ptl.PIMS.Pages.VisitManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;
import com.ptl.PIMS.Pages.VisitManagement.AdditionalVisitAndFreq.AdditionalVisitCreatePage;

public class VisitAddSelectInmatePage extends SelectInmatePage{

	
	public VisitAddSelectInmatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public VisitCreatePage selecFirstInmateforVist(){
		
		firstInmateLink.click();
		return PageFactory.initElements(driver, VisitCreatePage.class);
	}
	
	public AdditionalVisitCreatePage selecFirstInmateforAdditionalVist(){
		
		firstInmateLink.click();
		return PageFactory.initElements(driver, AdditionalVisitCreatePage.class);
	}
}
