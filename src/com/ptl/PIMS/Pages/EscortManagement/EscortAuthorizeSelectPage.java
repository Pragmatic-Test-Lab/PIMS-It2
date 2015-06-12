package com.ptl.PIMS.Pages.EscortManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EscortAuthorizeSelectPage extends SearchEscort{

	
	public EscortAuthorizeSelectPage(WebDriver dr){
		
		driver = dr;
	}
	
	public EscortAuthorizePage selectLastEscort(){		
		
		getLastEscortInList().click();		
		return PageFactory.initElements(driver, EscortAuthorizePage.class);
	}
	
}