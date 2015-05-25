package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;


public class CreateSupplierPage {
	WebDriver driver;

	@FindBy(xpath = Constants.SupplierName)
	WebElement suppliername;
	@FindBy(xpath = Constants.CreateSupplierButton)
	WebElement create;
	@FindBy(xpath = Constants.SupplierSuccessMessage)
	WebElement successMessagesupplier;

	public CreateSupplierPage(WebDriver dr){
		driver = dr;
	}

	public void EnterSupplierData(String Supplier){
		suppliername.sendKeys(Supplier);
	}

	public SupplierPage ClickCreateButton(){
		create.click();
		SupplierPage supplierpage = PageFactory.initElements(driver, SupplierPage.class);
		return supplierpage;
	}

	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessagesupplier.getText();
	}

}
