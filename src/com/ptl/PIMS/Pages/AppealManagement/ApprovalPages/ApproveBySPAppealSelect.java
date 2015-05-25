package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.AppealManagement.AppealSearch;

public class ApproveBySPAppealSelect extends AppealSearch {

	public ApproveBySPAppealSelect(WebDriver dr) {
		driver = dr;
	}

	public ApproveBySP SelectFirstAppeal(){
		
		AppealFirstRecord.click();
		ApproveBySP approveAppealPage = PageFactory.initElements(driver, ApproveBySP.class);		
		return approveAppealPage;
		
	}
	
}
