package com.ptl.PIMS.Pages.EscortManagement.TimeRecord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.EscortManagement.SearchEscort;

public class RecordEscortInSelectPage extends SearchEscort{

	public RecordEscortInSelectPage(WebDriver dr){

		driver = dr;
	}
	
	public RecordEscortInPage selectLastEscort(){		
		
		getLastEscortInList().click();		
		return PageFactory.initElements(driver, RecordEscortInPage.class);
	}
}
