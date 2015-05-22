package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateKitchenItemPage {

	WebDriver driver;

	@FindBy(xpath = Constants.SupplierName)
	WebElement suppliername;
	@FindBy(xpath = Constants.CreateSupplierButton)
	WebElement create;
	@FindBy(xpath = Constants.KitchenItemName)
	WebElement kitchenitemname;
	@FindBy(xpath = Constants.KitchenItemNameSinhala)
	WebElement kitchenitemnamesinhala;
	@FindBy(xpath = Constants.KitchenItemNameTamil)
	WebElement kitchenitemnametamil;
	@FindBy(xpath = Constants.Unit)
	WebElement unit;
	@FindBy(xpath = Constants.Wastage)
	WebElement wastage;

	public CreateKitchenItemPage(WebDriver dr){
		driver = dr;
	}

	public void EnterKitchenItemData(String kitchenitem,String kitchenitemsinhala,String kitchenitemtamil, String unit1, String wastage1){
		kitchenitemname.sendKeys(kitchenitem);
		kitchenitemnamesinhala.sendKeys(kitchenitemsinhala);
		kitchenitemnametamil.sendKeys(kitchenitemtamil);
		unit.sendKeys(unit1);
		wastage.sendKeys(wastage1);
	}

	public KitchenItemPage ClickCreateButton(){
		create.click();
		KitchenItemPage kitchenitempage = PageFactory.initElements(driver, KitchenItemPage.class);
		return kitchenitempage;
	}

}
