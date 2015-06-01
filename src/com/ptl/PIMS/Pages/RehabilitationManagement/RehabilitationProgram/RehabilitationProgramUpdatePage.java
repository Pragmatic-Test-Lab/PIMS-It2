package com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class RehabilitationProgramUpdatePage{

	WebDriver driver;
	
	@FindBy(xpath = Constants.RehabilitationManagement_RehabCode)
	public WebElement RehabCode;
	@FindBy(xpath = Constants.RehabilitationManagement_RehabName)
	public WebElement RehabName;
	@FindBy(xpath = Constants.RehabilitationManagement_RehabCategory)
	public WebElement RehabCategory;
	
	@FindBy(xpath = Constants.RehabilitationManagement_UpdateButton)
	public WebElement RehabUpdateButton;
	
	public RehabilitationProgramUpdatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public AddUpdateRehabilitationProgram editRehab(String code, String name, String category){
		
		RehabCode.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		RehabCode.sendKeys(code);
		RehabName.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		RehabName.sendKeys(name);
		RehabCategory.sendKeys(category);
		
		RehabUpdateButton.click();
		return PageFactory.initElements(driver, AddUpdateRehabilitationProgram.class);			
	}
}
