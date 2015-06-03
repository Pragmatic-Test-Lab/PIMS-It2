package com.ptl.PIMS.Pages.MovementManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class MovementInPage {
WebDriver driver;
@FindBy(xpath = Constants.MovementinCreate)
WebElement movementin;
@FindBy(xpath = Constants.AdmisssionIdAuthoriseSearch)
WebElement admisssionidinsearch;
@FindBy(xpath = Constants.AuthoriseMovementOut)
WebElement authorisemovementout;
	
public MovementInPage(WebDriver dr){
	driver = dr;
}
public CreateMovementInPage getCreateMovementInPage(){
	admisssionidinsearch.sendKeys(Constants.admissionid+ Keys.ENTER);
	movementin.click();
	CreateMovementInPage createmovementin = PageFactory.initElements(driver, CreateMovementInPage.class);
	return createmovementin;	
}


}
