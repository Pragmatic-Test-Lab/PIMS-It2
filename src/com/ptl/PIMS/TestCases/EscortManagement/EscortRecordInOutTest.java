package com.ptl.PIMS.TestCases.EscortManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.EscortManagement.EscortAddUpdatePage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.EscortOutInAuthorizePage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.EscortOutInAuthorizeSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.RecordEscortInPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.RecordEscortInSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.RecordEscortOutPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.RecordEscortOutSelectPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class EscortRecordInOutTest extends TestBase{ 
	
	EscortAddUpdatePage escortAddUpdate;

	@Test(dataProvider = "getEscData")
	public void markEscortOutData(Hashtable<String,String> data) {
		
		loginToApplication();
 
		RecordEscortOutSelectPage recordOutSelect = getTopMenu().gotoEscortOut();
		recordOutSelect = recordOutSelect.EscortForSearch(data.get("NCDate"), "");
		
		RecordEscortOutPage recordOut = recordOutSelect.selectLastEscort(); 
    
		recordOut.addEscortOutTime(registrationNo, data.get("caseNos"), data.get("courts"), data.get("NCDate"));
		recordOutSelect = recordOut.updateEscort();
	    
	    assertTrue(recordOutSelect.successMessageAvaiable(), "Could not foutd Success Message out Escort Out Page.");  

	}
	
	@Test(dataProvider = "getEscData", dependsOnMethods = "markEscortOutData")
	public void markEscortInData(Hashtable<String,String> data) {
		
		RecordEscortInSelectPage recordInSelect = getTopMenu().gotoEscortIn();
		recordInSelect = recordInSelect.EscortForSearch(data.get("NCDate"), "");
		
		RecordEscortInPage recordIn = recordInSelect.selectLastEscort(); 
    
		recordIn.addEscortInTime(registrationNo, data.get("caseNos"), data.get("courts"), data.get("NCDate"));
		recordInSelect = recordIn.updateEscort();
	    
	    assertTrue(recordInSelect.successMessageAvaiable(), "Could not find Success Message in Escort In Page.");  

	}
	
	@Test(dataProvider = "getEscData", dependsOnMethods = "markEscortInData")
	public void AuthorizeEscortInOut(Hashtable<String,String> data) {
		
		EscortOutInAuthorizeSelectPage authEscortSelect = getTopMenu().gotoEscortInOutAuthorize();
		authEscortSelect = authEscortSelect.EscortForSearch(data.get("NCDate"), "");
		
		EscortOutInAuthorizePage escortAuth = authEscortSelect.selectLastEscort(); 
		authEscortSelect = escortAuth.authorizeRecord();
	    
	    assertTrue(authEscortSelect.successMessageAvaiable(), "Could not find Success Message in Escort InOut Authorize.");  

	}

	
	@DataProvider
	public Object[][] getEscData() {
		return TestUtil.getTestData("Escort Test", xls);
	}
}
