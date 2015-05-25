package com.ptl.PIMS.Pages.AppealManagement.ApprovalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class ApproveBySP {

	WebDriver driver;

	@FindBy(xpath = Constants.AppealManagement_ApproveAppealButton)
	public WebElement ApproveButton;

	public ApproveBySP(WebDriver dr) {
		driver = dr;
	}

	public ApproveBySPAppealSelect approveAppeal() {

		ApproveButton.click();

		ApproveBySPAppealSelect selectAppealPage = PageFactory.initElements(driver, ApproveBySPAppealSelect.class);
		return selectAppealPage;
	}
}
