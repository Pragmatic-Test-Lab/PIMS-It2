package com.ptl.PIMS.TestCases.MovementManagement;

import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.MovementManagement.CreateMovementInAuthorize;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementInPage;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutPage;
import com.ptl.PIMS.Pages.MovementManagement.MovementInAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.MovementInPage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutAuthorizePage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutPage;
import com.ptl.PIMS.Pages.MovementManagement.SelectMovementOutAdmissionPage;
import com.ptl.PIMS.TestCases.TestBase;

public class MovementOutInTest extends TestBase {

	MovementOutPage movementoutPage;
	CreateMovementOutPage createmovementoutPage;
	SelectMovementOutAdmissionPage selectmovementoutadmissionpage;
	
	MovementOutAuthorizePage movementoutauthorizePage;
	CreateMovementOutAuthorizePage createmovementoutauthorizePage;
	
	MovementInPage movementinPage;
	CreateMovementInPage createmovementinPage;
	
	MovementInAuthorizePage movementinauthorizePage;
	CreateMovementInAuthorize createmovementinauthorizePage;

	private String admissionId="T/10362/2015";
	
	@Test   
	public void createwMovementOut(){

		loginToApplication();		
		movementoutPage = getTopMenu().gotoNewMovementOutPage();
		selectmovementoutadmissionpage = movementoutPage.getCreateMovementOutAdmissionPage();
		selectmovementoutadmissionpage = selectmovementoutadmissionpage.doSearch(admissionId, "", "");
		
		try {  Thread.sleep(2000);	} catch (InterruptedException e) {}
		createmovementoutPage = selectmovementoutadmissionpage.GoToMovementOutPage();
		
		createmovementoutPage.EnterMovementData();
		movementoutPage = createmovementoutPage.ClickCreateButton();

		assertTrue(movementoutPage.successMessageAvaiable(), "Success Message not found in Movement Out Create.");
	}	
	

	@Test(dependsOnMethods="createwMovementOut")
	public void movementOutAuthorizeTest(){

		movementoutauthorizePage = topMenu.gotomovementAuthorizePage();
		createmovementoutauthorizePage = movementoutauthorizePage.goToAuthorizePage(admissionId);

		movementoutauthorizePage = createmovementoutauthorizePage.ClickAuthorizeButton();

		assertTrue(movementoutauthorizePage.successMessageAvaiable(),"Success Message not found in Authorize Movement Out.");				
	}

	@Test(dependsOnMethods="movementOutAuthorizeTest")
	public void createMovementInTest(){
		
		movementinPage = topMenu.gotomovementInPage();		
		createmovementinPage = movementinPage.getCreateMovementInPage(admissionId);
		
		createmovementinPage.EnterMovementData();
		movementinPage = createmovementinPage.ClickCreateButton();

		assertTrue(movementinPage.successMessageAvaiable(),	"Success Message not found in Movement In Update.");				
	}

	
	@Test(dependsOnMethods="createMovementInTest")
	public void movementInAuthorizeTest(){
		
		movementinauthorizePage = topMenu.gotomovementinAuthorizePage();		
		createmovementinauthorizePage=movementinauthorizePage.getCreateMovementInAuthorizePage(admissionId);
		
		movementinauthorizePage = createmovementinauthorizePage.ClickAuthorizeButton();

		assertTrue(movementinauthorizePage.successMessageAvaiable(),	"Success Message not found in Authorize Movement In.");				
	}
	
}
