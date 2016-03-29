package com.ptl.PIMS.Pages.AppealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class AppealAddUpdatePage extends AppealSearch{
	
	@FindBy(xpath = Constants.AppealManagement_NewAppealButton)
	public WebElement NewAppealButton;
	@FindBy(xpath = Constants.InmateSearch_TableFirstInmate)
	public WebElement firstInmateLink;
	
	public AppealAddUpdatePage(WebDriver dr) {
		driver = dr;
	}

	public EditAppealPage SelectFirstAppeal(){
		
		//AppealFirstRecord.click();
//		firstInmateLink.click();
		clickFirstRecord();
		EditAppealPage editAppealPage = PageFactory.initElements(driver, EditAppealPage.class);		
		return editAppealPage;

		
	}	
	
	public NewAppeal_InmateSelect CreateNewAppeal(){
		
		NewAppealButton.click();		
		NewAppeal_InmateSelect inmateSelectPage = PageFactory.initElements(driver, NewAppeal_InmateSelect.class);		
		return inmateSelectPage;		
	}


}
