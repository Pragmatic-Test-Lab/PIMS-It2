package com.ptl.PIMS.TestCases.TransferManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferInAuthorizePage;
import com.ptl.PIMS.Pages.TransferManagement.TransferInAuthorizePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateTransferInAuthorizeTest extends TestBase {
	TransferInAuthorizePage transferinauthorizepage;
	CreateTransferInAuthorizePage createtransferinauthorizepage;

	@Test   
	public void goToTransferInAuthorizePage(){

		loginAsWataraka();		
		TopMenu topMenu = getTopMenu();
		transferinauthorizepage = topMenu.gototransferInauthorizePage();
		
		createtransferinauthorizepage=transferinauthorizepage.getCreateTransferInAuthorizePage();
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToTransferInAuthorizePage")
	public void submitTransferinAuthorizeTest(){
		
		transferinauthorizepage = createtransferinauthorizepage.ClickAuthorizeButton();


		Assert.assertTrue(createtransferinauthorizepage.getSuccessMessage().matches(Constants.AuthorizeTransferOut_SuccessMessageText),
				"Transfer In not authorised");				
	}



}
