package com.ptl.PIMS.TestCases.TransferManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferInPage;
import com.ptl.PIMS.Pages.TransferManagement.TransferInPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateTransferInTest  extends TestBase {
	TransferInPage transferinpage;
	CreateTransferInPage createtransferinpage;

	@Test   
	public void goToTransferInPage(){

		loginAsWataraka();		
		TopMenu topMenu = getTopMenu();
		transferinpage = topMenu.gototransferInPage();
		
		createtransferinpage=transferinpage.getCreateTransferInPage();
		
	/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/
	}
	@Test(dependsOnMethods="goToTransferInPage")
	public void submitTransferinTest(){
		createtransferinpage.EnterTransferData();
		transferinpage = createtransferinpage.ClickCreateButton();


		Assert.assertTrue(createtransferinpage.getSuccessMessage().matches(Constants.AuthorizeTransferOut_SuccessMessageText),
				"Transfer In not authorised");				
	}


}
