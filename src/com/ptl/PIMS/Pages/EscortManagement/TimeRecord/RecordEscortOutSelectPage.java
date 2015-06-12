package com.ptl.PIMS.Pages.EscortManagement.TimeRecord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.EscortManagement.SearchEscort;

public class RecordEscortOutSelectPage extends SearchEscort{

	public RecordEscortOutSelectPage(WebDriver dr){

		driver = dr;
	}
	
	public RecordEscortOutPage selectLastEscort(){		
		
		getLastEscortInList().click();		
		return PageFactory.initElements(driver, RecordEscortOutPage.class);
	}
}
