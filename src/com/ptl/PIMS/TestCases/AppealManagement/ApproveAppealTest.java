package com.ptl.PIMS.TestCases.AppealManagement;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveByCourt;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveByCourtAppealSelect;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveByJailor;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveByJailorAppealSelect;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveBySP;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveBySPAppealSelect;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveSendToCourt;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveSendToCourtAppealSelect;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class ApproveAppealTest extends TestBase{


	
	@Test(dataProvider = "getAppealData", dependsOnMethods = "createAppealTest")
	public void approveAppealTest(Hashtable<String, String> data) {
		
		registrationNo = "";
		
		loginToApplication();
		ApproveByJailorAppealSelect JApprovePage = getTopMenu().gotoAppealApproveByJailor();
		
		//Jailor Approve Appeal
		JApprovePage = JApprovePage.AppealForSearch(registrationNo, "", "", "", data.get("Updated Reason"));
		ApproveByJailor JailorApproval =  JApprovePage.SelectFirstAppeal();
		JApprovePage = JailorApproval.approveAppeal();
		
		if(!JApprovePage.successMessageAvaiable())
	    	Assert.assertTrue(JApprovePage.successMessageAvaiable(), "Could not find success message element in Appeal Jailor Approval Page.");
		//
		
		
		//SP Approve Appeal
		ApproveBySPAppealSelect SPApprovePage = getTopMenu().gotoAppealApproveBySP();

		SPApprovePage = SPApprovePage.AppealForSearch(registrationNo, "", "", "", data.get("Updated Reason"));
		ApproveBySP SPApproval =  SPApprovePage.SelectFirstAppeal();
		SPApprovePage = SPApproval.approveAppeal();
		
		if(!SPApprovePage.successMessageAvaiable())
			Assert.assertTrue(SPApprovePage.successMessageAvaiable(), "Could not find success message element in Appeal SP Approval Page.");
		//
		
		//Send To Court Approve Appeal
		ApproveSendToCourtAppealSelect STCApprovePage = getTopMenu().gotoAppealApproveSendToCourt();

		STCApprovePage = STCApprovePage.AppealForSearch(registrationNo, "", "", "", data.get("Updated Reason"));
		ApproveSendToCourt STCourtApproval =  STCApprovePage.SelectFirstAppeal();
		STCApprovePage = STCourtApproval.approveAppeal();
		
		if(!STCApprovePage.successMessageAvaiable())
			Assert.assertTrue(STCApprovePage.successMessageAvaiable(), "Could not find success message element in Appeal Court Approval Page.");
		//
		
		
		//Court Accept Approve Appeal
		ApproveByCourtAppealSelect CApprovePage = getTopMenu().gotoAppealApproveByCourt();

		CApprovePage = CApprovePage.AppealForSearch(registrationNo, "", "", "", data.get("Updated Reason"));
		ApproveByCourt CourtApproval =  CApprovePage.SelectFirstAppeal();
		CApprovePage = CourtApproval.approveAppeal();
		
		if(!CApprovePage.successMessageAvaiable())
			Assert.assertTrue(CApprovePage.successMessageAvaiable(), "Could not find success message element in Appeal Court Responce Page.");
		//
	}
	
	@DataProvider
	public Object[][] getAppealData() {
		return TestUtil.getTestData("Appeal Test", xls);
	}

}