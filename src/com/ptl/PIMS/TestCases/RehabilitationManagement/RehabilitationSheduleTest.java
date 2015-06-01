package com.ptl.PIMS.TestCases.RehabilitationManagement;

import java.util.Hashtable;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.RehabilitationManagement.Participants.AddParticipantsPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.Participants.AddParticipantsSelectProg;
import com.ptl.PIMS.Pages.RehabilitationManagement.Participants.AuthorizeSheduleParticipants;
import com.ptl.PIMS.Pages.RehabilitationManagement.Participants.AuthorizeSheduleParticipantsSelectProg;
import com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram.AddUpdateRehabilitationProgram;
import com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram.RehabilitationProgramAddPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram.RehabilitationProgramUpdatePage;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.AddUpdateRehabShedule;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.AuthorizeRehabShedule;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.AuthorizeRehabSheduleSelectProg;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.RehabSheduleAddPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.RehabSheduleUpdatePage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;

public class RehabilitationSheduleTest extends TestBase{
	
	String rehabCode;
	AddUpdateRehabilitationProgram rehabPage;
	AddUpdateRehabShedule rehabShedPage;
	
	@Test(dataProvider = "getRehabData")
	public void createRehabilitationProgram(Hashtable<String,String> data) {
		
		loginToApplication();
		
		rehabPage = getTopMenu().gotoRehabilitationProgram();
		RehabilitationProgramAddPage newRehabPage = rehabPage.createNewRehabRecord();
		
		rehabCode = Integer.toString((new Random()).nextInt(99999));
		
		rehabPage = newRehabPage.createRehab(rehabCode, data.get("ProgName") + rehabCode, data.get("ProgCat"));
		Assert.assertTrue(rehabPage.successMessageAvaiable(), "Success message was not found in Create Rehabilitation Program.");		
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods = "createRehabilitationProgram")
	public void editRehabilitationProgram(Hashtable<String,String> data) {

		rehabPage = rehabPage.RehabForSearch(rehabCode, data.get("ProgName") + rehabCode);
		RehabilitationProgramUpdatePage editRehabPage = rehabPage.clickFirstRehabRecord();
		
		rehabCode = "U" + Integer.toString((new Random()).nextInt(9999));

		rehabPage = editRehabPage.editRehab(rehabCode, data.get("ProgName") + rehabCode, data.get("ProgCat"));
		Assert.assertTrue(rehabPage.successMessageAvaiable(), "Success message was not found in Update Rehabilitation Program.");		
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods = "editRehabilitationProgram")
	public void createRehabShedule(Hashtable<String,String> data) {

		rehabShedPage = getTopMenu().gotoAddUpdateSheduleRehab();

		RehabSheduleAddPage addShedulePage = rehabShedPage.gotoCreateNewShedule();
		rehabShedPage = addShedulePage.createRehabShedule(data.get("ProgName") + rehabCode,
				data.get("start"), data.get("end"), data.get("organization"));

		Assert.assertTrue(rehabShedPage.successMessageAvaiable(), "Success message was not found in Add Rehabilitation Shedule.");		
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods = "createRehabShedule")
	public void updateRehabShedule(Hashtable<String,String> data) {
		
		rehabShedPage = rehabShedPage.SheduleForSearch(data.get("ProgName") + rehabCode, data.get("organization"), "", "");
		RehabSheduleUpdatePage editShedPage = rehabShedPage.clickFirstShedule();
		
		rehabShedPage = editShedPage.editRehabShedule(data.get("ProgName") + rehabCode, data.get("Ustart"), data.get("Uend"), data.get("Uorganization"));
		Assert.assertTrue(rehabPage.successMessageAvaiable(), "Success message was not found in Update Rehabilitation Shedule.");
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods = "updateRehabShedule")
	public void authorizeRehabShedule(Hashtable<String,String> data) {
		
		AuthorizeRehabSheduleSelectProg authRehabShedPage = getTopMenu().gotoAuthorizeRehabShedule();
		authRehabShedPage = authRehabShedPage.SheduleForSearch(data.get("ProgName") + rehabCode, data.get("Uorganization"), "", "");
		AuthorizeRehabShedule authShedPage = authRehabShedPage.clickFirstShedule();
		
		authRehabShedPage = authShedPage.authorizeShedule();
		Assert.assertTrue(authRehabShedPage.successMessageAvaiable(), "Success message was not found in Authorize Rehabilitation Shedule.");
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods = "authorizeRehabShedule")
	public void addParticipantsRehabShedule(Hashtable<String,String> data) {
		
		AddParticipantsSelectProg rehabPartPage = getTopMenu().gotoAddRehabSheduleParticipants();
		rehabPartPage = rehabPartPage.SheduleForSearch(data.get("ProgName") + rehabCode, data.get("Uorganization"), "", "");
		AddParticipantsPage addPartPage = rehabPartPage.addParticipantsToSchedule();
		
		rehabPartPage = addPartPage.addParticipants(data.get("RegNos"), data.get("Remarks"));
		Assert.assertTrue(rehabPartPage.successMessageAvaiable(), "Success message was not found in Add Shedule Participants.");
	}
	
	@Test(dataProvider = "getRehabData", dependsOnMethods = "addParticipantsRehabShedule")
	public void authorizeParticipantsRehabShedule(Hashtable<String,String> data) {
		
		AuthorizeSheduleParticipantsSelectProg authRehabShedPartPage = getTopMenu().gotoAuthRehabSheduleParticipants();
		authRehabShedPartPage = authRehabShedPartPage.SheduleForSearch(data.get("ProgName") + rehabCode, data.get("Uorganization"), "", "");
		AuthorizeSheduleParticipants authShedPartPage = authRehabShedPartPage.authParticipants();
		
		authRehabShedPartPage = authShedPartPage.authorizeShedule();
		Assert.assertTrue(authRehabShedPartPage.successMessageAvaiable(), "Success message was not found in Authorize Rehabilitation Shedule Participants.");
	}
	
	@DataProvider
	public Object[][] getRehabData() {
		return TestUtil.getTestData("Rehab Test", xls);
	}

}
