package com.ptl.PIMS.TestCases.MealManagement;

import java.util.Hashtable;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MealManagement.CreateSupplierPage;
import com.ptl.PIMS.Pages.MealManagement.SupplierPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateSupplierTest extends TestBase{
	SupplierPage supplierPage;
	CreateSupplierPage createSupplierPage;

	@Test   
	public void goToNewSupplierPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		supplierPage = topMenu.gotoNewSupplierPage();
		createSupplierPage = supplierPage.getCreateSupplierPage();

		/*Assert.assertTrue(createNewDemandPage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
					"Could not go to new demand order page.");		*/
	}	

	@Test(dependsOnMethods="goToNewSupplierPage")
	public void fillSupplier(){
		createSupplierPage.EnterSupplierData("PTL Supplier"+ (new Random()).nextInt(5000));		
	}

	@Test(dependsOnMethods="fillSupplier")
	public void submitsupplierTest(){
		
		supplierPage = createSupplierPage.ClickCreateButton();
		
		Assert.assertTrue(createSupplierPage.getSuccessMessage().matches(Constants.CreateSupplier_SuccessMessageText),
				"Kitchen Item not created");		
		
	}
	

}
