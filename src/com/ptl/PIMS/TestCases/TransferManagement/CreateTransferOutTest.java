package com.ptl.PIMS.TestCases.TransferManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.Pages.TransferManagement.CreateTransferOutPage;
import com.ptl.PIMS.Pages.TransferManagement.SelectTransferOutAdmissionPage;
import com.ptl.PIMS.Pages.TransferManagement.TransferOutPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;

public class CreateTransferOutTest extends TestBase {

	TransferOutPage transferoutPage;
	CreateTransferOutPage createtransferoutPage;
	SelectTransferOutAdmissionPage selecttransferoutadmissionpage;

	@Test   
	public void goToNewTransferOutPage(){

		loginToApplication();		
		TopMenu topMenu = getTopMenu();
		transferoutPage = topMenu.gotoNewTransferOutPage();
		selecttransferoutadmissionpage = transferoutPage.getCreateTransferOutPageAdmissionPage();
		selecttransferoutadmissionpage = selecttransferoutadmissionpage.doSearch(Constants.transferadmissionid, "", "");
		
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		createtransferoutPage = selecttransferoutadmissionpage.GoToTransferOutPage();

	}	

	@Test(dependsOnMethods="goToNewTransferOutPage")
	public void submitTransferOutTest() {
		createtransferoutPage.EnterTransferData();
		transferoutPage = createtransferoutPage.ClickCreateButton();


		Assert.assertTrue(createtransferoutPage.getSuccessMessage().matches(Constants.CreateTransferOut_SuccessMessageText),
				"Demand Order not created");	

	}

}
