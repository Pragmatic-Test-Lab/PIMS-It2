package com.ptl.PIMS.Pages.EscortManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class EscortAddUpdatePage extends SearchEscort{

	@FindBy(xpath = Constants.EscortManagement_NewEscortButton)
	public WebElement newEscortButton;
	
	public EscortAddUpdatePage(WebDriver dr){
		
		driver = dr;
	}
	
	public EscortUpdatePage selectLastEscort(){		
		
		getLastEscortInList().click();
		return PageFactory.initElements(driver, EscortUpdatePage.class);
	}

	
	public EscortAddPage goToCreateNewEscort(){
		
		newEscortButton.click();
		
		return PageFactory.initElements(driver, EscortAddPage.class);
	}
}
