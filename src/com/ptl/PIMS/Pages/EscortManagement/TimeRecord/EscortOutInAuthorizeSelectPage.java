package com.ptl.PIMS.Pages.EscortManagement.TimeRecord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.EscortManagement.SearchEscort;

public class EscortOutInAuthorizeSelectPage extends SearchEscort{

	public EscortOutInAuthorizeSelectPage(WebDriver dr){

		driver = dr;
	}
	
	public EscortOutInAuthorizePage selectLastEscort(){		
		
		getLastEscortInList().click();		
		return PageFactory.initElements(driver, EscortOutInAuthorizePage.class);
	}
}