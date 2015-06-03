package com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class RehabilitationProgramAddPage{

	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_RehabCode)
	public WebElement RehabCode;
	@FindBy(xpath = Constants.RehabilitationManagement_RehabName)
	public WebElement RehabName;
	@FindBy(xpath = Constants.RehabilitationManagement_RehabCategory)
	public WebElement RehabCategory;
	
	@FindBy(xpath = Constants.RehabilitationManagement_CreateButton)
	public WebElement RehabCreateButton;
	
	public RehabilitationProgramAddPage(WebDriver dr){
		
		driver = dr;
	}
	
	public AddUpdateRehabilitationProgram createRehab(String code, String name, String category){
		
		RehabCode.sendKeys(code);
		RehabName.sendKeys(name);
		RehabCategory.sendKeys(category);
		
		RehabCreateButton.click();
		return PageFactory.initElements(driver, AddUpdateRehabilitationProgram.class);			
	}
	
	
}
