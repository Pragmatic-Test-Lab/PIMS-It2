package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.AppealManagement.AppealSearch;

public class ApproveByCourtAppealSelect extends AppealSearch {
	
	
	public ApproveByCourtAppealSelect(WebDriver dr) {
		driver = dr;
	}

	public ApproveByCourt SelectFirstAppeal(){
		
		AppealFirstRecord.click();
		ApproveByCourt approveAppealPage = PageFactory.initElements(driver, ApproveByCourt.class);		
		return approveAppealPage;
		
	}
}
