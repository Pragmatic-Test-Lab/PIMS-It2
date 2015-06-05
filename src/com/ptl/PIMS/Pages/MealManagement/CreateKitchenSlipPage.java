package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.CommonMethods;
import com.ptl.PIMS.util.Constants;

public class CreateKitchenSlipPage{
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.KitchenSlipId)
	WebElement kitchenslipid;
	@FindBy(xpath = Constants.CreateKitchenSlipButton)
	WebElement kitchenslipcreate;
	@FindBy(xpath = Constants.SuccessMessageKitchen)
	WebElement successMessageKitchen;
	@FindBy(xpath = Constants.AddNewKitchenItem)
	WebElement addnewkitchenitem;
	
	public CreateKitchenSlipPage(WebDriver dr){
		driver = dr;
	}

	public String getKitchenSlipID(){


		return kitchenslipid.getAttribute("value");

	}

	public KitchenSlipPage ClickCreateButton(){
		kitchenslipcreate.click();
		KitchenSlipPage kitchenslippage = PageFactory.initElements(driver, KitchenSlipPage.class);
		return kitchenslippage;
	}

	public void EnterKitchenSlipData(String kitchenitem3,String quantity1){
		//int dataRows = initialRowCount(recipetablebody);

		addnewkitchenitem.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.findElement(By.xpath(Constants.Kitchenitemline)).sendKeys(kitchenitem3);
		driver.findElement(By.xpath(Constants.quantityline)).sendKeys(quantity1);
		//kitchenitemname2.sendKeys(kitchenitem2);

	}


}
