package com.ptl.PIMS.TestCases.DisciplineManagement;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.DisciplineManagement.AuthorizeDisciplinePage;
import com.ptl.PIMS.Pages.DisciplineManagement.AuthorizeDiscipline_SelectRecordPage;
import com.ptl.PIMS.Pages.DisciplineManagement.EditAddDisciplinePage;
import com.ptl.PIMS.Pages.DisciplineManagement.EditDisciplinePage;
import com.ptl.PIMS.Pages.DisciplineManagement.NewDisciplinePage;
import com.ptl.PIMS.Pages.DisciplineManagement.SelectInmateForDisciplinePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class DisciplineTest extends TestBase{

	EditAddDisciplinePage addUpdateDiscPage;
	
	@Test(dataProvider = "getDiscData")
	public void createDisciplineRecord(Hashtable<String,String> data) {
		
		loginToApplication();
 
		addUpdateDiscPage = getTopMenu().gotoAddUpdateDiscipline();
		SelectInmateForDisciplinePage inmateSelectionPage = addUpdateDiscPage.CreateNewDiscipline();
		
		inmateSelectionPage = inmateSelectionPage.doSearch(data.get("RegNo"), "", "");		
		NewDisciplinePage discPage = inmateSelectionPage.clickFirstInmate();

		addUpdateDiscPage = discPage.createDisciplineWithOnlyMandatoryData(data.get("doIncident"), data.get("officer"), data.get("place"), 
				data.get("complaint"), data.get("inquirer"));
		
		Assert.assertTrue(addUpdateDiscPage.successMessageAvaiable(), "Success message was not found in Create Discipline.");		
	}
	
	
	@Test(dataProvider = "getDiscData", dependsOnMethods = "createDisciplineRecord")
	public void editDisciplineRecord(Hashtable<String,String> data) {

		addUpdateDiscPage = addUpdateDiscPage.DisciplineForSearch("", data.get("RegNo"), "", "");
		EditDisciplinePage editDisc  = addUpdateDiscPage.SelectFirstDiscipline();

		addUpdateDiscPage = editDisc.addJudgementDetails(data.get("doJudgement"), data.get("judgement"), data.get("remissionDeduction"));
		
		Assert.assertTrue(addUpdateDiscPage.successMessageAvaiable(), "Success message was not found in Edit Discipline.");		
	}
	
	@Test(dataProvider = "getDiscData", dependsOnMethods = "editDisciplineRecord")
	public void authorizeDiscipline(Hashtable<String,String> data) {

		AuthorizeDiscipline_SelectRecordPage authDisc = getTopMenu().gotoAuthorizeDiscipline();
		authDisc = authDisc.DisciplineForSearch("", data.get("RegNo"), "", "");
		AuthorizeDisciplinePage authDiscPage  = authDisc.SelectFirstDiscipline();

		authDisc = authDiscPage.authorizeRecord();
				
		Assert.assertTrue(authDisc.successMessageAvaiable(), "Success message was not found in Authorize Discipline.");		
	}
	
	@DataProvider
	public Object[][] getDiscData() {
		return TestUtil.getTestData("Discipline Test", xls);
	}
}
