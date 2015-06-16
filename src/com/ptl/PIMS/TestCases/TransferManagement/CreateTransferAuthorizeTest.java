package com.ptl.PIMS.TestCases.TransferManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferOutAuthorizePage;
import com.ptl.PIMS.Pages.TransferManagement.TransferOutAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateTransferAuthorizeTest extends TestBase {
	TransferOutAuthorizePage transferoutauthorizepage;
	CreateTransferOutAuthorizePage createtransferoutauthorizepage;

	@Test   
	public void goToTransferOutAuthorizePage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		transferoutauthorizepage = topMenu.gototransferAuthorizePage();
		
		createtransferoutauthorizepage=transferoutauthorizepage.getCreateTransferOutAuthorizePage();
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToTransferOutAuthorizePage")
	public void submitmovementoutAuthorizeTest(){

		transferoutauthorizepage = createtransferoutauthorizepage.ClickAuthorizeButton();


		Assert.assertTrue(createtransferoutauthorizepage.getSuccessMessage().matches(Constants.AuthorizeTransferOut_SuccessMessageText),
				"Transfer Out not authorised");				
	}

}
