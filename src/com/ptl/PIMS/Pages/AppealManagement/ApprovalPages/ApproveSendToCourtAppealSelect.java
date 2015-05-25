package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.AppealManagement.AppealSearch;

public class ApproveSendToCourtAppealSelect extends AppealSearch {

	public ApproveSendToCourtAppealSelect(WebDriver dr) {
		driver = dr;
	}

	public ApproveSendToCourt SelectFirstAppeal(){
		
		AppealFirstRecord.click();
		ApproveSendToCourt approveAppealPage = PageFactory.initElements(driver, ApproveSendToCourt.class);		
		return approveAppealPage;
		
	}
	
}
