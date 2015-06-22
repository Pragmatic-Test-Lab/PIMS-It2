package com.ptl.PIMS.TestCases.TransferManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TransferManagement.CreateTransferInAuthorizePage;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferInPage;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferOutAuthorizePage;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferOutPage;
import com.ptl.PIMS.Pages.TransferManagement.SelectTransferOutAdmissionPage;
import com.ptl.PIMS.Pages.TransferManagement.TransferInAuthorizePage;
import com.ptl.PIMS.Pages.TransferManagement.TransferInPage;
import com.ptl.PIMS.Pages.TransferManagement.TransferOutAuthorizePage;
import com.ptl.PIMS.Pages.TransferManagement.TransferOutPage;
import com.ptl.PIMS.TestCases.TestBase;

public class TransferOutInTest extends TestBase {

	TransferOutPage transferoutPage;
	CreateTransferOutPage createtransferoutPage;
	SelectTransferOutAdmissionPage selecttransferoutadmissionpage;
	
	TransferOutAuthorizePage transferoutauthorizepage;
	CreateTransferOutAuthorizePage createtransferoutauthorizepage;
	
	TransferInPage transferinpage;
	CreateTransferInPage createtransferinpage;
	
	TransferInAuthorizePage transferinauthorizepage;
	CreateTransferInAuthorizePage createtransferinauthorizepage;
	
	public String transferadmissionid = "";
	

	@Test   
	public void createTransferInmate(){
		
		loginToApplication();
		transferadmissionid = createInmateForTransfer();
	}
	
	@Test(dependsOnMethods="createTransferInmate")
	public void createTransferOutTest(){

		transferoutPage = topMenu.gotoNewTransferOutPage();
		selecttransferoutadmissionpage = transferoutPage.getCreateTransferOutPageAdmissionPage();
		selecttransferoutadmissionpage = selecttransferoutadmissionpage.doSearch(transferadmissionid, "", "");
		
		try {  Thread.sleep(3000); } catch (InterruptedException e) {}

		createtransferoutPage = selecttransferoutadmissionpage.GoToTransferOutPage();
		
		createtransferoutPage.EnterTransferData();
		transferoutPage = createtransferoutPage.ClickCreateButton();

		assertTrue(transferoutPage.successMessageAvaiable(), "Success Message not found in Transfer Out Create.");

	}
	
	
	@Test(dependsOnMethods="createTransferOutTest")
	public void TranferOutAuthorizeTest(){
	
		transferoutauthorizepage = getTopMenu().gototransferAuthorizePage();
		
		createtransferoutauthorizepage = transferoutauthorizepage.getCreateTransferOutAuthorizePage(transferadmissionid);	
		/*	Assert.assertTrue(createdemandauthorizePage.getActualPageTitle().equals(Constants.CreateDemandPageHeader),
				"Could not go to new demand order page.");		
		*/	
		transferoutauthorizepage = createtransferoutauthorizepage.ClickAuthorizeButton();
	
		assertTrue(transferoutauthorizepage.successMessageAvaiable(), "Success Message not found in Transfer Out Authorize.");	

	}	


	@Test(dependsOnMethods="TranferOutAuthorizeTest")
	public void updateTransferInTest(){
		
		loginAsWataraka();		
		transferinpage = getTopMenu().gototransferInPage();
		
		createtransferinpage = transferinpage.getCreateTransferInPage(transferadmissionid);
		
		createtransferinpage.EnterTransferData();
		transferinpage = createtransferinpage.ClickCreateButton();

		assertTrue(transferinpage.successMessageAvaiable(), "Success Message not found in Transfer Out Create.");				
	}	

	@Test(dependsOnMethods="updateTransferInTest")
	public void TranferInAuthorizeTest(){
		
		transferinauthorizepage = getTopMenu().gototransferInauthorizePage();
		
		createtransferinauthorizepage=transferinauthorizepage.getCreateTransferInAuthorizePage(transferadmissionid);
		transferinauthorizepage = createtransferinauthorizepage.ClickAuthorizeButton();

		assertTrue(transferinauthorizepage.successMessageAvaiable(), "Success Message not found in Transfer In Authorize.");				
	}

}
