package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class ApproveSendToCourt {

	WebDriver driver;

	@FindBy(xpath = Constants.AppealManagement_ApproveAppealButton)
	public WebElement ApproveButton;

	public ApproveSendToCourt(WebDriver dr) {
		driver = dr;
	}

	public ApproveSendToCourtAppealSelect approveAppeal() {

		ApproveButton.click();

		ApproveSendToCourtAppealSelect selectAppealPage = PageFactory.initElements(driver, ApproveSendToCourtAppealSelect.class);
		return selectAppealPage;
	}
}
