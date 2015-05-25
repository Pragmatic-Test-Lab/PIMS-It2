package com.ptl.PIMS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenItemPage;
import com.ptl.PIMS.Pages.MealManagement.RecipePage;
import com.ptl.PIMS.Pages.MealManagement.SupplierPage;


public class TopMenu {
	
	WebDriver driver;
	
	@FindBy(xpath=Constants.TopMenu_PIMSTopLink)
	WebElement homePageTopLink;
	@FindBy(xpath = Constants.TopMenu_LogOut)
	WebElement logOut;
	@FindBy(xpath = Constants.TransactionManagement)
	WebElement transactionManagement;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.DemandOrder)
	WebElement demandorder;
	@FindBy(xpath = Constants.MealManagement)
	WebElement mealmanagement;
	@FindBy(xpath = Constants.Supplier)
	WebElement supplier;
	@FindBy(xpath = Constants.KitchenItem)
	WebElement kitchenitem;
	@FindBy(xpath = Constants.Recipe)
	WebElement recipe;
	
	public TopMenu(WebDriver dr){
		driver = dr;
	}
	
	public HomePage gotoHomePage(){
		homePageTopLink.click();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		return homePage;
	}

	
	public LoginPage doLogout(){
		logOut.click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		TestBase.isLoggedIn = false;
		return loginPage;		
	}

	public DemandOrderPage gotoNewDemandOrderPage(){
		transactionManagement.click();
		mealmanagement.click();
		demandorder.click();
		DemandOrderAdd.click();
		DemandOrderPage newdDemandOrderPage = PageFactory.initElements(driver, DemandOrderPage.class);
		return newdDemandOrderPage;
	}	

	public SupplierPage gotoNewSupplierPage(){
		transactionManagement.click();
		mealmanagement.click();
		supplier.click();
		SupplierPage newSupplierPage = PageFactory.initElements(driver, SupplierPage.class);
		return newSupplierPage;
	}

	public KitchenItemPage gotoNewKitchenItemPage() {
		// TODO Auto-generated method stub
		transactionManagement.click();
		mealmanagement.click();
		kitchenitem.click();
		KitchenItemPage newkitchenitempage = PageFactory.initElements(driver, KitchenItemPage.class);
		return newkitchenitempage;
	
	}	
	
	public RecipePage gotoNewRecipePage() {
		// TODO Auto-generated method stub
		transactionManagement.click();
		mealmanagement.click();
		recipe.click();
		RecipePage newrecipepage = PageFactory.initElements(driver, RecipePage.class);
		return newrecipepage;
	
	}
	

}
