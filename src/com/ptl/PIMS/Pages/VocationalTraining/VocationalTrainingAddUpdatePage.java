package com.ptl.PIMS.Pages.VocationalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class VocationalTrainingAddUpdatePage extends VocationalSearch{
	
	@FindBy(xpath = Constants.VOCManagement_NewVOCProgButton)
	public WebElement NewVOCProgButton;
	
	public VocationalTrainingAddUpdatePage(WebDriver dr) {
		driver = dr;
	}

	public EditVocationalProgram SelectFirstVOC(){
		
		VOCFirstRecord.click();
		EditVocationalProgram editVOCPage = PageFactory.initElements(driver, EditVocationalProgram.class);		
		return editVOCPage;		
	}	
	
	public NewVocationalProgram CreateNewVocProg(){
		
		NewVOCProgButton.click();
		NewVocationalProgram newVOCPage = PageFactory.initElements(driver, NewVocationalProgram.class);		
		return newVOCPage;
		
	}	
}
