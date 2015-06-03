package com.ptl.PIMS.Pages.DisciplineManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ptl.PIMS.util.Constants;

public class CommonDisciplineElements {

	WebDriver driver;
	
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintTab)
	public WebElement ComplaintTab;
	@FindBy(xpath = Constants.DisciplineManagement_JudgementTab)
	public WebElement JudgementTab;
	
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintDOInquiry)
	public WebElement ComplaintDOInquiry;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintDOIncident)
	public WebElement ComplaintDOIncident;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintReoprtedByInmate)
	public WebElement ComplaintReoprtedByInmate;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintReoprtedByInmateRegNo)
	public WebElement ComplaintReoprtedByInmateRegNo;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintReoprtedByOfficer)
	public WebElement ComplaintReoprtedByOfficer;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintReoprtedByOfficerName)
	public WebElement ComplaintReoprtedByOfficerName;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintPlace)
	public WebElement ComplaintPlace;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintComplaint)
	public WebElement Complaint;
	@FindBy(xpath = Constants.DisciplineManagement_ComplaintInquiryBy)
	public WebElement ComplaintInquiryBy;
	
	
	@FindBy(xpath = Constants.DisciplineManagement_JudgementDate)
	public WebElement JudgementDate;
	@FindBy(xpath = Constants.DisciplineManagement_JudgementGuilty)
	public WebElement JudgementGuilty;
	@FindBy(xpath = Constants.DisciplineManagement_JudgementText)
	public WebElement Judgement;
	@FindBy(xpath = Constants.DisciplineManagement_JudgementDeductedRemision)
	public WebElement JudgementDeductedRemision;
	@FindBy(xpath = Constants.DisciplineManagement_JudgementGoodConduct)
	public WebElement JudgementGoodConduct;
	@FindBy(xpath = Constants.DisciplineManagement_JudgementDOGoodConduct)
	public WebElement JudgementDOGoodConduct;

	
}
