package com.ptl.PIMS.Pages.VisitManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VisitAuthorizeSelectionPage extends SearchVisit{

	
	public VisitAuthorizeSelectionPage(WebDriver dr){
		
		driver = dr;
	}
	
	public VisitAuthorizePage AuthorizeFirstVisit(){
		
		firstRecord.click();
		return PageFactory.initElements(driver, VisitAuthorizePage.class);
	}
	
}
