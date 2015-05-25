package com.ptl.PIMS.Pages.MealManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.util.Constants;

public class CreateRecipePage {
	
	WebDriver driver;


	@FindBy(xpath = Constants.CreateRecipeItemButton)
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
	@FindBy(xpath = Constants.addnewrecipe)
	WebElement addnewrecipe;
	@FindBy(xpath = Constants.RecipeTableBody)
	WebElement recipetablebody;
	@FindBy(xpath = Constants.RecipeSuccessMessage)
	WebElement successMessageRecipe;
	

	public CreateRecipePage(WebDriver dr){
		driver = dr;
	}

	public void EnterRecipeData(String kitchenitem2,String kitchenitemsinhala,String kitchenitemtamil, String unit1, String wastage1){
		int dataRows = initialRowCount(recipetablebody);
		
		addnewrecipe.click();
		
		driver.findElement(By.xpath(Constants.RecipeCountitem + "[" + (dataRows) + "]")).sendKeys("Dhal");
		driver.findElement(By.xpath(Constants.RecipeCountquantity + "[" + (dataRows) + "]")).sendKeys("200");
		//kitchenitemname2.sendKeys(kitchenitem2);
		
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

		return successMessageRecipe.getText();
	}

	private int initialRowCount(WebElement element) {
		List<WebElement> rows = element.findElements(By.tagName("tr"));	
		
		int size = rows.size();		
		return size;
	}
	
}
