package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class EditAddDisciplinePage extends SearchDiscipline{
	
	@FindBy(xpath = Constants.DisciplineManagement_NewDiscButton)
	public WebElement NewDiscButton;
	
	public EditAddDisciplinePage(WebDriver dr) {
		driver = dr;
	}

	public EditDisciplinePage SelectFirstDiscipline(){
		
		FirstRecord.click();
		return PageFactory.initElements(driver, EditDisciplinePage.class);		
	}	
	
	public SelectInmateForDisciplinePage CreateNewDiscipline(){
		
		NewDiscButton.click();		
		return PageFactory.initElements(driver, SelectInmateForDisciplinePage.class);		
	}


}
