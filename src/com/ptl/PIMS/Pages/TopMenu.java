package com.ptl.PIMS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.AppealManagement.AppealAddUpdatePage;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveByCourtAppealSelect;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveByJailorAppealSelect;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveBySPAppealSelect;
import com.ptl.PIMS.Pages.AppealManagement.ApprovalPages.ApproveSendToCourtAppealSelect;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizePostRegInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeRegInmatePage;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenItemPage;
import com.ptl.PIMS.Pages.MealManagement.SupplierPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.Constants;


public class TopMenu {
	
	WebDriver driver;	
	
	@FindBy(xpath=Constants.TopMenu_PIMSTopLink)
	WebElement homePageTopLink;
	@FindBy(xpath=Constants.TopMenu_RegistrationManagementTopLink)
	WebElement registrationManagementTopLink;	
	@FindBy(xpath=Constants.TopMenu_RegistrationManagement_AdmissionTopLink)
	WebElement admissionTopLink;
	@FindBy(xpath = Constants.TopMenu_AuthorizeSubLink)
	WebElement authorizeSubLink;
	@FindBy(xpath = Constants.TopMenu_RegistrationManagement_RegistrationTopLink)
	WebElement registrationMainLink;
	@FindBy(xpath = Constants.TopMenu_AuthorizeRegistrationSubLink)
	WebElement authorizeRegSub;
	@FindBy(xpath = Constants.TopMenu_PostRegistrationTopLink)
	WebElement postRegMain;
	@FindBy(xpath = Constants.TopMenu_AuthorizePostRegSubLink)
	WebElement postRegAuthorizeSub;
	@FindBy(xpath = Constants.TopMenu_TransactionManagementTopLink)
	WebElement transactionManagementTopLink;
	@FindBy(xpath = Constants.DemandOrderAdd)
	WebElement DemandOrderAdd;
	@FindBy(xpath = Constants.DemandOrder)
	WebElement demandorder;
	@FindBy(xpath = Constants.MealManagement)
	WebElement mealmanagement;
	@FindBy(xpath = Constants.Supplier)
	WebElement supplier;
	@FindBy(xpath = Constants.KitchenItem)
	WebElement kitchenitem;
	@FindBy(xpath = Constants.TopMenu_AppealTopLink)
	WebElement appealTopLink;
	@FindBy(xpath = Constants.TopMenu_AppealAddUpdateLink)
	WebElement appealAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_AppealJailorApprovalLink)
	WebElement appealJailorApprovalLink;
	@FindBy(xpath = Constants.TopMenu_AppealSPApprovalLink)
	WebElement appealSPApprovalLink;
	@FindBy(xpath = Constants.TopMenu_AppealSendToCourtApprovalLink)
	WebElement appealSendToCourtApprovalLink;
	@FindBy(xpath = Constants.TopMenu_AppealCourtApprovalLink)
	WebElement appealCourtApprovalLink;
	@FindBy(xpath = Constants.TopMenu_LogOut)
	WebElement logOut;

	public TopMenu(WebDriver dr){
		driver = dr;
	}
	
	public HomePage gotoHomePage(){
		homePageTopLink.click();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		return homePage;
	}
	
	public AuthorizeAdmissionInmatePage gotoAuthorizeAdmissionPage() {

		
		Actions action = new Actions(driver);
		action.moveToElement(registrationManagementTopLink).moveToElement(admissionTopLink).moveToElement(authorizeSubLink).click().build().perform();
		
		AuthorizeAdmissionInmatePage authorizeAdmissionSelectPage = PageFactory.initElements(driver, AuthorizeAdmissionInmatePage.class);
		return authorizeAdmissionSelectPage;
	}


	public AuthorizeRegInmatePage gotoAuthorizeRegistrationPage() {

		Actions action = new Actions(driver);
		action.moveToElement(registrationManagementTopLink).moveToElement(registrationMainLink).moveToElement(authorizeRegSub).click().build().perform();
		
		AuthorizeRegInmatePage authorizeInmateSelectPage = PageFactory.initElements(driver, AuthorizeRegInmatePage.class);
		return authorizeInmateSelectPage;
	}
	
	public AuthorizePostRegInmatePage gotoPostRegistrationAuthorizePage(){

		Actions action = new Actions(driver);
		action.moveToElement(registrationManagementTopLink).moveToElement(registrationMainLink).moveToElement(postRegAuthorizeSub).click().build().perform();

		AuthorizePostRegInmatePage postRegAuthorizePage = PageFactory.initElements(driver, AuthorizePostRegInmatePage.class);
		return postRegAuthorizePage;		
	}	
	
	public DemandOrderPage gotoNewDemandOrderPage(){
		transactionManagementTopLink.click();
		mealmanagement.click();
		demandorder.click();
		DemandOrderAdd.click();
		DemandOrderPage newdDemandOrderPage = PageFactory.initElements(driver, DemandOrderPage.class);
		return newdDemandOrderPage;
	}	

	public SupplierPage gotoNewSupplierPage(){
		transactionManagementTopLink.click();
		mealmanagement.click();
		supplier.click();
		SupplierPage newSupplierPage = PageFactory.initElements(driver, SupplierPage.class);
		return newSupplierPage;
	}

	public KitchenItemPage gotoNewKitchenItemPage() {
		// TODO Auto-generated method stub
		transactionManagementTopLink.click();
		mealmanagement.click();
		kitchenitem.click();
		KitchenItemPage newkitchenitempage = PageFactory.initElements(driver, KitchenItemPage.class);
		return newkitchenitempage;
	
	}		
	
	
	public AppealAddUpdatePage gotoAppealAddUpdate(){

		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(appealTopLink).moveToElement(appealAddUpdateLink).click().build().perform();
		
		AppealAddUpdatePage selectAppealPage = PageFactory.initElements(driver, AppealAddUpdatePage.class);
		return selectAppealPage;
	}

	public ApproveByJailorAppealSelect gotoAppealApproveByJailor() {

		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(appealTopLink).moveToElement(appealJailorApprovalLink).click().build().perform();
		
		ApproveByJailorAppealSelect approveAppealPage = PageFactory.initElements(driver, ApproveByJailorAppealSelect.class);
		return approveAppealPage;
	}

	public ApproveBySPAppealSelect gotoAppealApproveBySP() {

		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(appealTopLink).moveToElement(appealSPApprovalLink).click().build().perform();

		ApproveBySPAppealSelect approveAppealPage = PageFactory.initElements(driver, ApproveBySPAppealSelect.class);
		return approveAppealPage;	
	}

	public ApproveSendToCourtAppealSelect gotoAppealApproveSendToCourt() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(appealTopLink).moveToElement(appealSendToCourtApprovalLink).click().build().perform();
		
		ApproveSendToCourtAppealSelect approveAppealPage = PageFactory.initElements(driver, ApproveSendToCourtAppealSelect.class);
		return approveAppealPage;	
	}

	public ApproveByCourtAppealSelect gotoAppealApproveByCourt() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(appealTopLink).moveToElement(appealCourtApprovalLink).click().build().perform();

		ApproveByCourtAppealSelect approveAppealPage = PageFactory.initElements(driver, ApproveByCourtAppealSelect.class);
		return approveAppealPage;	
	}

	
	public LoginPage doLogout(){
		logOut.click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		TestBase.isLoggedIn = false;
		return loginPage;		
	}



	

}
