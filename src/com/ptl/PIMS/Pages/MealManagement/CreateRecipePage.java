package com.ptl.PIMS.Pages.MealManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateRecipePage {
	
	WebDriver driver;


	@FindBy(xpath = Constants.CreateKitchenItemButton)
	WebElement create;
	@FindBy(xpath = Constants.KitchenItemName2)
	WebElement kitchenitemname2;
	@FindBy(xpath = Constants.KitchenItemNameSinhala)
	WebElement kitchenitemnamesinhala;
	@FindBy(xpath = Constants.KitchenItemNameTamil)
	WebElement kitchenitemnametamil;
	@FindBy(xpath = Constants.Unit)
	WebElement unit;
	@FindBy(xpath = Constants.Wastage)
	WebElement wastage;
	@FindBy(xpath = Constants.KitchenSuccessMessage)
	WebElement successMessagekitchen;

	public CreateRecipePage(WebDriver dr){
		driver = dr;
	}

	public void EnterRecipeData(String kitchenitem2,String kitchenitemsinhala,String kitchenitemtamil, String unit1, String wastage1){
		kitchenitemname2.sendKeys(kitchenitem2);
		kitchenitemnamesinhala.sendKeys(kitchenitemsinhala);
		kitchenitemnametamil.sendKeys(kitchenitemtamil);
		unit.sendKeys(unit1);
		wastage.sendKeys(wastage1);
	}

	public RecipePage ClickCreateButton(){
		create.click();
		RecipePage recipepage = PageFactory.initElements(driver, RecipePage.class);
		return recipepage;
	}

	public String getSuccessMessage(){

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		return successMessagekitchen.getText();
	}

}
