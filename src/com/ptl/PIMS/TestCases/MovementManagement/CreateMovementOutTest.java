package com.ptl.PIMS.TestCases.MovementManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutPage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutPage;
import com.ptl.PIMS.Pages.MovementManagement.SelectMovementOutAdmissionPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateMovementOutTest extends TestBase {

	MovementOutPage movementoutPage;
	CreateMovementOutPage createmovementoutPage;
	SelectMovementOutAdmissionPage selectmovementoutadmissionpage;

	@Test   
	public void goToNewMovementOutPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		movementoutPage = topMenu.gotoNewMovementOutPage();
		selectmovementoutadmissionpage = movementoutPage.getCreateMovementOutAdmissionPage();
		createmovementoutPage=selectmovementoutadmissionpage.SearchAdmissionID();

	}	

	@Test(dependsOnMethods="goToNewMovementOutPage")
	public void submitMovementOutTest() {
		createmovementoutPage.EnterMovementData();
		movementoutPage = createmovementoutPage.ClickCreateButton();


		Assert.assertTrue(createmovementoutPage.getSuccessMessage().matches(Constants.CreateMovementOut_SuccessMessageText),
				"Demand Order not created");	

	}

}
