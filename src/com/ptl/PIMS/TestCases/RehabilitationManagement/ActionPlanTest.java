package com.ptl.PIMS.TestCases.RehabilitationManagement;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.ActionPlanAddPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.ActionPlanUpdatePage;
import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.AddUpdateActionPlanPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.AuthorizeActionPlanPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.AuthorizeActionPlanSelectPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class ActionPlanTest extends TestBase{

	AddUpdateActionPlanPage apPage;
	
	@Test(dataProvider = "getRehabData")
	public void createVOCProgram(Hashtable<String,String> data) {
		
		loginToApplication();
		apPage = getTopMenu().gotoActionPlanAddUpdate();
		
		ActionPlanAddPage newAP = apPage.gotoCreateActionPlan();
				
		newAP.AddRehabilitationPrograms(data.get("year"), data.get("RehabProgram"), data.get("RehabStart"), 
				data.get("RehabEnd"), data.get("RehabCost"));
		apPage = newAP.createActionPlan();
		
		Assert.assertTrue(apPage.successMessageAvaiable(), "Success message was not found in Action Plan Add.");		
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods= "createVOCProgram")
	public void editVOCProgram(Hashtable<String,String> data) {
		
		apPage = apPage.ActionPlanForSearch(data.get("year"), "");
		
		ActionPlanUpdatePage editAP = apPage.clickFirstActionPlan();
		
		editAP.AddRehabilitationPrograms(data.get("Eyear"), data.get("ERehabProgram"), data.get("ERehabStart"), 
				data.get("ERehabEnd"), data.get("ERehabCost"));
		apPage = editAP.updateActionPlan();
		
		Assert.assertTrue(apPage.successMessageAvaiable(), "Success message was not found in Action Plan Edit.");		
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods= "editVOCProgram")
	public void authorizeVOCProgram(Hashtable<String,String> data) {
		
		AuthorizeActionPlanSelectPage authAPPage = getTopMenu().gotoActionPlanAuthorize();
		authAPPage = authAPPage.ActionPlanForSearch(data.get("Eyear"), "");
		
		AuthorizeActionPlanPage authAP = authAPPage.clickFirstActionPlan();

		authAPPage = authAP.AuthorizeAP();
		
		Assert.assertTrue(authAPPage.successMessageAvaiable(), "Success message was not found in Action Plan Authorize.");		
	}
	
	@DataProvider
	public Object[][] getRehabData() {
		return TestUtil.getTestData("Rehab Test - Action Plan", xls);
	}
}
