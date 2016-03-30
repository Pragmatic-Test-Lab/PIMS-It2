package com.ptl.PIMS.TestCases.VocationalManagement;

import com.ptl.PIMS.Pages.VocationalTraining.*;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class VOCProgramTest extends TestBase {

	VocationalTrainingAddUpdatePage vocPage;
	String vocProgramName;
	
	@Test(dataProvider = "getVOCData")
	public void createVOCProgram(Hashtable<String, String> data) {
		
		loginToApplication();
		vocPage = getTopMenu().gotoVocationalAddUpdate();
		NewVocationalProgram newVOC = vocPage.CreateNewVocProg();

		vocProgramName = TestUtil.getRandomString(5);

		vocPage = newVOC.createNewVOC(vocProgramName, data.get("progName"), data.get("progDuration"),
					data.get("vocType"), data.get("vocTInstitute"),data.get("vocStartDate"), data.get("vocEndDate"), data.get("vocVenue"),
				data.get("resourcePerson"), data.get("noOfParticipants"));

		assertTrue(vocPage.successMessageAvaiable(), "Success message was not found in Vocational Training Add.");		
	}
	
	@Test(dataProvider = "getVOCData", dependsOnMethods = "createVOCProgram")
	public void editVOCProgram(Hashtable<String, String> data) {

		vocPage = vocPage.VOCForSearch(vocProgramName, data.get("progName"), data.get("progDuration"));
		EditVocationalProgram editVOC = vocPage.SelectFirstVOC();
		
		vocPage = editVOC.editVOC(data.get("EprogName"), data.get("EprogDuration"), 
				data.get("EvocType"), data.get("EvocTInstitute"),data.get("EvocStartDate"), data.get("EvocEndDate"));
		
		assertTrue(vocPage.successMessageAvaiable(), "Success message was not found in Vocational Training Edit.");		
	}
	
	@Test(dependsOnMethods="editVOCProgram")
	public void authorizeVOCProgram() {
		
		AuthorizeVoc_ProgSelect vocAuthPage = getTopMenu().gotoVocationalAuthorize();

		vocAuthPage = vocAuthPage.VOCForSearch(vocProgramName, "", "");
		AuthorizeVoc authVOC = vocAuthPage.SelectFirstVOC();	
		vocAuthPage = authVOC.doAuthorization();

		assertTrue(vocAuthPage.successMessageAvaiable(), "Success message was not found in Vocational Training Authorize.");
		progCode = vocProgramName;
	}
	
	@DataProvider
	public Object[][] getVOCData() {
		return TestUtil.getTestData("VOC Programs", xls);
	}

}