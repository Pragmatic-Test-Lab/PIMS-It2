package com.ptl.PIMS.TestCases.VocationalManagement;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.VocationalTraining.AddParticipantsVoc;
import com.ptl.PIMS.Pages.VocationalTraining.AddParticipantsVoc_ProgSelect;
import com.ptl.PIMS.Pages.VocationalTraining.AuthorizeVocParticipants;
import com.ptl.PIMS.Pages.VocationalTraining.AuthorizeVocParticipants_ProgSelect;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class VOCParticipantTest extends TestBase{
	
	
	@Test(dataProvider = "getVOCData")
	public void addVOCParticipants(Hashtable<String, String> data) {
		
		loginToApplication();
		
		AddParticipantsVoc_ProgSelect vocPartPage = getTopMenu().gotoVocationalParticipants();
		vocPartPage = vocPartPage.VOCForSearch(progCode, "", "");		
		AddParticipantsVoc vocPart = vocPartPage.SelectFirstVOC();
		
		vocPartPage = vocPart.addParticipants(data.get("RegNos"), data.get("Grades"), data.get("Remarks"));
		
		assertTrue(vocPartPage.successMessageAvaiable(), "Success message was not found in Vocational Training Participant Add.");		
	}
	
	
	@Test(dependsOnMethods = "addVOCParticipants")
	public void authorizeVOCParticipants() {
		
		AuthorizeVocParticipants_ProgSelect vocAuthPartPage = getTopMenu().gotoVocationalParticipantsAuthorize();
		vocAuthPartPage = vocAuthPartPage.VOCForSearch(progCode, "", "");		
		AuthorizeVocParticipants vocAuthPart = vocAuthPartPage.SelectFirstVOC();
		
		vocAuthPartPage = vocAuthPart.doAuthorization();
		
		assertTrue(vocAuthPartPage.successMessageAvaiable(), "Success message was not found in Vocational Training Participant Authorize.");		
	}
	
	@DataProvider
	public Object[][] getVOCData() {
		return TestUtil.getTestData("VOC Programs", xls);
	}
}
