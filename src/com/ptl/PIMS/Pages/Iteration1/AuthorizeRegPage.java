package com.ptl.PIMS.Pages.Iteration1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;


public class AuthorizeRegPage {

	//Authorize Registration Page
    @FindBy(xpath = Constants.AuthorizeButton)
	WebElement AuthorizeRegistration;
    
    
    @FindBy(xpath = Constants.Registration_CaseDetailTab)
	public WebElement CaseTab;
	@FindBy(xpath = Constants.Registration_CaseTableBody)
	public WebElement CaseTabTableBody;	
    @FindBy(xpath = Constants.Registration_CaseDetail_AddNew)
	WebElement AddNewCase;
	
	WebDriver driver;	

	public AuthorizeRegPage(WebDriver dr) {
		driver = dr;
	}
	
	public AuthorizeRegInmatePage authorizeInmate(){
		AuthorizeRegistration.click();
		
		AuthorizeRegInmatePage allocateLocationInmateSelect = PageFactory
				.initElements(driver, AuthorizeRegInmatePage.class);
		return allocateLocationInmateSelect;
	}
	
	public void addcaseDetailsOfInmate(String CaseNo, String Offense, String Sentence, String Day, String Month, 
			String Year, String Fine){

		CaseTab.click();
		
		String[] CaseNos = CaseNo.split(",");
		String[] Offenses = Offense.split(",");
		String[] Sentences = Sentence.split(",");
		String[] Years = Year.split(",");		
		String[] Months = Month.split(",");		
		String[] Days = Day.split(",");		
		String[] Fines = Fine.split(",");		

		int dataRows = initialRowCount(CaseTabTableBody);
		
		for(int i=0; i< Offenses.length; i++){

			AddNewCase.click();			
			
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_CaseNumber + "[" + (dataRows + i) + "]")).sendKeys(CaseNos[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Offence + "[" + (dataRows + i) + "]")).sendKeys(Offenses[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_SentenceType + "[" + (dataRows + i) + "]")).sendKeys(Sentences[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Years + "[" + (dataRows + i) + "]")).sendKeys(Years[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Months + "[" + (dataRows + i) + "]")).sendKeys(Months[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Days + "[" + (dataRows + i) + "]")).sendKeys(Days[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Fine + "[" + (dataRows + i) + "]")).sendKeys(Fines[i]);
			
		}	

	}
	
	public void addMultipleSentences(String casePrefix, String commonOffense, String commonSentence, String Day, String Month, 
			String Year, String Fine){

		CaseTab.click();

		String[] Years = Year.split(",");		
		String[] Months = Month.split(",");		
		String[] Days = Day.split(",");		
		String[] Fines = Fine.split(",");		

		int dataRows = initialRowCount(CaseTabTableBody);
		
		for(int i=0; i< Years.length; i++){

			AddNewCase.click();			
			
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_CaseNumber + "[" + (dataRows + i) + "]")).sendKeys(casePrefix + i);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Offence + "[" + (dataRows + i) + "]")).sendKeys(commonOffense);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_SentenceType + "[" + (dataRows + i) + "]")).sendKeys(commonSentence);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Years + "[" + (dataRows + i) + "]")).sendKeys(Years[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Months + "[" + (dataRows + i) + "]")).sendKeys(Months[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Days + "[" + (dataRows + i) + "]")).sendKeys(Days[i]);
			driver.findElement(By.xpath(Constants.Registration_CaseDetail_Fine + "[" + (dataRows + i) + "]")).sendKeys(Fines[i]);
			
		}	

	}
	
	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;

	}
}






