package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class ApproveByJailor {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.AppealManagement_ApproveAppealButton)
	public WebElement ApproveButton ;	
	
	public ApproveByJailor(WebDriver dr){
		driver = dr;
	}
	
	public ApproveByJailorAppealSelect approveAppeal(){
		
		ApproveButton.click();
		
		ApproveByJailorAppealSelect selectAppealPage = PageFactory.initElements(driver, ApproveByJailorAppealSelect.class);		
		return selectAppealPage;
	}
}
