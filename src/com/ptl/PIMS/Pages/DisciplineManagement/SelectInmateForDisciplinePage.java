package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;

public class SelectInmateForDisciplinePage extends SelectInmatePage{

	
	public SelectInmateForDisciplinePage(WebDriver dr) {
		driver = dr;
	}

	public NewDisciplinePage clickFirstInmate() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firstInmateLink.click();		
		return PageFactory.initElements(driver, NewDisciplinePage.class);
	}
}
