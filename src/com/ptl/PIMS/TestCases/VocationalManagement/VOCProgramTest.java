package com.ptl.PIMS.TestCases.VocationalManagement;

import java.util.Hashtable;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.VocationalTraining.AuthorizeVoc;
import com.ptl.PIMS.Pages.VocationalTraining.AuthorizeVoc_ProgSelect;
import com.ptl.PIMS.Pages.VocationalTraining.EditVocationalProgram;
import com.ptl.PIMS.Pages.VocationalTraining.NewVocationalProgram;
import com.ptl.PIMS.Pages.VocationalTraining.VocationalTrainingAddUpdatePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class VOCProgramTest extends TestBase {

	VocationalTrainingAddUpdatePage vocPage;
	
	@Test(dataProvider = "getVOCData")
	public void createVOCProgram(Hashtable<String, String> data) {
		
		loginToApplication();
		vocPage = getTopMenu().gotoVocationalAddUpdate();
		NewVocationalProgram newVOC = vocPage.CreateNewVocProg();
		
		progCode = data.get("progCode") + (new Random()).nextInt(5000);
		
		vocPage = newVOC.createNewVOC(progCode, data.get("progName"), data.get("progDuration"), 
					data.get("vocType"), data.get("vocTInstitute"),data.get("vocStartDate"), data.get("vocEndDate"), data.get("vocVenue"), 
					data.get("resourcePerson"));
		
		Assert.assertTrue(vocPage.successMessageAvaiable(), "Success message was not found in Vocational Training Add.");		
	}
	
	@Test(dataProvider = "getVOCData", dependsOnMethods = "createVOCProgram")
	public void editVOCProgram(Hashtable<String, String> data) {
		
		vocPage = vocPage.VOCForSearch(progCode, data.get("progName"), data.get("progDuration"));
		EditVocationalProgram editVOC = vocPage.SelectFirstVOC();
		
		vocPage = editVOC.editVOC(data.get("EprogName"), data.get("EprogDuration"), 
				data.get("EvocType"), data.get("EvocTInstitute"),data.get("EvocStartDate"), data.get("EvocEndDate"));
		
		Assert.assertTrue(vocPage.successMessageAvaiable(), "Success message was not found in Vocational Training Edit.");		
	}
	
	@Test(dependsOnMethods="editVOCProgram")
	public void authorizeVOCProgram() {
		
		AuthorizeVoc_ProgSelect vocAuthPage = getTopMenu().gotoVocationalAuthorize();

		vocAuthPage = vocAuthPage.VOCForSearch(progCode,"", "");
		AuthorizeVoc authVOC = vocAuthPage.SelectFirstVOC();	
		vocAuthPage = authVOC.doAuthorization();		
		
		Assert.assertTrue(vocAuthPage.successMessageAvaiable(), "Success message was not found in Vocational Training Authorize.");		
	}
	
	@DataProvider
	public Object[][] getVOCData() {
		return TestUtil.getTestData("VOC Programs", xls);
	}

}