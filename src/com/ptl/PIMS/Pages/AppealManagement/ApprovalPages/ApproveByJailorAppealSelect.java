package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.AppealManagement.AppealSearch;

public class ApproveByJailorAppealSelect extends AppealSearch {
	
	
	public ApproveByJailorAppealSelect(WebDriver dr) {
		driver = dr;
	}

	public ApproveByJailor SelectFirstAppeal(){
		
		AppealFirstRecord.click();
		ApproveByJailor approveAppealPage = PageFactory.initElements(driver, ApproveByJailor.class);		
		return approveAppealPage;
		
	}
}
