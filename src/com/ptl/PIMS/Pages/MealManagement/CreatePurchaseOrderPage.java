package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreatePurchaseOrderPage {
	WebDriver driver;
	@FindBy(xpath = Constants.PurchaseOrderId)
	WebElement purchaseorderid;
	@FindBy(xpath = Constants.AddNewPurchaseOrder)
	WebElement addnewpurchaseorder;
	@FindBy(xpath = Constants.PurchaseOrderCreate)
	WebElement purchaseordercreate;
	@FindBy(xpath = Constants.SuccessMessagePurchaseOrder)
	WebElement successMessagePurchaseOrder;

	public CreatePurchaseOrderPage(WebDriver dr){
		driver = dr;
	}
	public String getPurchaseOrderID(){
		return purchaseorderid.getAttribute("value");
	}
	public void EnterPurchaseOrderData(String supplier,String kitchenitem4,String quantity2){
		//int dataRows = initialRowCount(recipetablebody);
		driver.findElement(By.xpath(Constants.SupplierLine)).sendKeys(supplier);
		addnewpurchaseorder.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.findElement(By.xpath(Constants.Kitchenitemline1)).sendKeys(kitchenitem4);
		driver.findElement(By.xpath(Constants.quantityline1)).sendKeys(quantity2);
		//kitchenitemname2.sendKeys(kitchenitem2);

	}
	public PurchaseOrderPage ClickCreateButton(){
		purchaseordercreate.click();
		PurchaseOrderPage purchaseorderpage = PageFactory.initElements(driver, PurchaseOrderPage.class);
		return purchaseorderpage;
	}
	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessagePurchaseOrder.getText();
	}	
}
