package com.ptl.PIMS.Pages.VocationalTraining;

import com.ptl.PIMS.util.Constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VocationalTrainingAddUpdatePageCommonElements extends
		VocationalSearch {

	WebDriver driver;

	@FindBy(xpath = Constants.VOC_ProgCode)
	public WebElement ProgCode;
	@FindBy(xpath = Constants.VOC_ProgName)
	public WebElement ProgName;
	@FindBy(xpath = Constants.VOC_ProgDuration)
	public WebElement ProgDuration;
	@FindBy(xpath = Constants.VOC_VOCType)
	public WebElement VOCType;
	@FindBy(xpath = Constants.VOC_VOCTrainingInstitute)
	public WebElement TrainingInstitute;
	@FindBy(xpath = Constants.VOC_VOCPrisonInstitute)
	public WebElement PrisonInstitute;
	@FindBy(xpath = Constants.VOC_VOCStartDate)
	public WebElement StartDate;
	@FindBy(xpath = Constants.VOC_VOCEndDate)
	public WebElement EndDate;
	@FindBy(xpath = Constants.VOC_VOCVenue)
	public WebElement Venue;
	@FindBy(xpath = Constants.VOC_ResourcePerson)
	public WebElement ResourcePerson;
	@FindBy(xpath = Constants.VOC_NoOfParticipants)
	public WebElement NoOfParticipants;

	public void editField(WebElement element, String newText) {

		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(newText);

	}
}
