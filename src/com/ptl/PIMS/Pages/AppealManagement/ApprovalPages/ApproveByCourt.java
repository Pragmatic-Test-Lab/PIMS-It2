package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ptl.PIMS.util.Constants;

public class ApproveByCourt {

	WebDriver driver;
	
	@FindBy(xpath = Constants.AppealManagement_ApproveAppealButton)
	public WebElement ApproveButton ;	
	
	public ApproveByCourt(WebDriver dr){
		driver = dr;
	}
	
	public ApproveByCourtAppealSelect approveAppeal(){
		
		ApproveButton.click();
		
		ApproveByCourtAppealSelect selectAppealPage = PageFactory.initElements(driver, ApproveByCourtAppealSelect.class);		
		return selectAppealPage;
	}
	
}
