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
import com.ptl.PIMS.Pages.MealManagement.DemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.KitchenItemPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenSlipPage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderPage;
import com.ptl.PIMS.Pages.MealManagement.RecipePage;
import com.ptl.PIMS.Pages.MealManagement.SupplierPage;
import com.ptl.PIMS.Pages.VocationalTraining.AddParticipantsVoc_ProgSelect;
import com.ptl.PIMS.Pages.VocationalTraining.AuthorizeVocParticipants_ProgSelect;
import com.ptl.PIMS.Pages.VocationalTraining.AuthorizeVoc_ProgSelect;
import com.ptl.PIMS.Pages.VocationalTraining.VocationalTrainingAddUpdatePage;
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
	@FindBy(xpath = Constants.DemandOrderAuthorize)
	WebElement DemandOrderAuthorize;
	@FindBy(xpath = Constants.KitchenSlip)
	WebElement kitchenslip;
	@FindBy(xpath = Constants.KitchenSlipAdd)
	WebElement kitchenslipadd;
	@FindBy(xpath = Constants.KitchenOrderAuthorize)
	WebElement KitchenOrderAuthorize;
	@FindBy(xpath = Constants.PurchaseOrder)
	WebElement purchaseorder;
	@FindBy(xpath = Constants.PurchaseOrderAdd)
	WebElement purchaseorderadd;
	@FindBy(xpath = Constants.PurchaseOrderAuthorize)
	WebElement purchaseorderauthorize;
	@FindBy(xpath = Constants.GoodReceived)
	WebElement goodreceived;
	@FindBy(xpath = Constants.GoodReceivedAdd)
	WebElement goodreceivedadd;
	
	@FindBy(xpath = Constants.MealManagement)
	WebElement mealmanagement;
	@FindBy(xpath = Constants.Supplier)
	WebElement supplier;
	@FindBy(xpath = Constants.KitchenItem)
	WebElement kitchenitem;
	@FindBy(xpath = Constants.Recipe)
	WebElement recipe;
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
	@FindBy(xpath = Constants.TopMenu_VOCTopLink)
	WebElement vocTopLink;
	@FindBy(xpath = Constants.TopMenu_VOCAddUpdateLink)
	WebElement vocAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_VOCAuth)
	WebElement vocAuthLink;
	@FindBy(xpath = Constants.TopMenu_VOCPart)
	WebElement vocParticipantsLink;
	@FindBy(xpath = Constants.TopMenu_VOCAuthPart)
	WebElement vocAuthParticipantsLink;
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
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(demandorder).moveToElement(DemandOrderAdd).click().build().perform();
		/*
		transactionManagementTopLink.click();
		mealmanagement.click();
		demandorder.click();
		DemandOrderAdd.click();*/
		DemandOrderPage newdDemandOrderPage = PageFactory.initElements(driver, DemandOrderPage.class);
		return newdDemandOrderPage;
	}	
	
	public DemandAuthorizePage gotoNewDemandAuthorizePage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(demandorder).moveToElement(DemandOrderAuthorize).click().build().perform();
		DemandAuthorizePage newdDemandauthorizePage = PageFactory.initElements(driver, DemandAuthorizePage.class);
		return newdDemandauthorizePage;
	}	
	
	public KitchenSlipPage gotoNewKitchenSlipPage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(kitchenslip).moveToElement(kitchenslipadd).click().build().perform();
		KitchenSlipPage newKitchenSlipPage = PageFactory.initElements(driver, KitchenSlipPage.class);
		return newKitchenSlipPage;
	}	
	
	public KitchenAuthorizePage gotoNewKitchenAuthorizePage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(kitchenslip).moveToElement(KitchenOrderAuthorize).click().build().perform();
		KitchenAuthorizePage newKitchenauthorizePage = PageFactory.initElements(driver, KitchenAuthorizePage.class);
		return newKitchenauthorizePage;
	}	
	
	public PurchaseOrderPage gotoNewPurchaseOrderPage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(purchaseorder).moveToElement(purchaseorderadd).click().build().perform();
		PurchaseOrderPage newpurchaseorderPage = PageFactory.initElements(driver, PurchaseOrderPage.class);
		return newpurchaseorderPage;
	}	
	
	
	public PurchaseOrderAuthorizePage gotoNewPurchaseAuthorizePage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(purchaseorder).moveToElement(purchaseorderauthorize).click().build().perform();
		PurchaseOrderAuthorizePage newpurchaseorderauthorizePage = PageFactory.initElements(driver, PurchaseOrderAuthorizePage.class);
		return newpurchaseorderauthorizePage;
	}	
	public GoodReceivedPage gotogoodreceivedPage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(goodreceived).moveToElement(goodreceivedadd).click().build().perform();
		GoodReceivedPage newgoodreceivedPage = PageFactory.initElements(driver, GoodReceivedPage.class);
		return newgoodreceivedPage;
	}	
	

	public SupplierPage gotoNewSupplierPage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(supplier).click().build().perform();
		/*transactionManagementTopLink.click();
		mealmanagement.click();
		supplier.click();*/
		SupplierPage newSupplierPage = PageFactory.initElements(driver, SupplierPage.class);
		return newSupplierPage;
	}

	public KitchenItemPage gotoNewKitchenItemPage() {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(kitchenitem).click().build().perform();
		
		/*transactionManagementTopLink.click();
		mealmanagement.click();
		kitchenitem.click();*/
		KitchenItemPage newkitchenitempage = PageFactory.initElements(driver, KitchenItemPage.class);
		return newkitchenitempage;
	
	}		
	
	public RecipePage gotoNewRecipePage() {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(recipe).click().build().perform();
		
		/*transactionManagementTopLink.click();
		mealmanagement.click();
		recipe.click();*/
		RecipePage newrecipepage = PageFactory.initElements(driver, RecipePage.class);
		return newrecipepage;
	
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
	
	public VocationalTrainingAddUpdatePage gotoVocationalAddUpdate() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(vocTopLink).moveToElement(vocAddUpdateLink).click().build().perform();

		VocationalTrainingAddUpdatePage gotoNewVoc = PageFactory.initElements(driver, VocationalTrainingAddUpdatePage.class);
		return gotoNewVoc;
	}
	
	public AuthorizeVoc_ProgSelect gotoVocationalAuthorize() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(vocTopLink).moveToElement(vocAuthLink).click().build().perform();

		AuthorizeVoc_ProgSelect gotoAuthVoc = PageFactory.initElements(driver, AuthorizeVoc_ProgSelect.class);
		return gotoAuthVoc;
	}
	
	public AddParticipantsVoc_ProgSelect gotoVocationalParticipants() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(vocTopLink).moveToElement(vocParticipantsLink).click().build().perform();
		
		AddParticipantsVoc_ProgSelect partVoc = PageFactory.initElements(driver, AddParticipantsVoc_ProgSelect.class);
		return partVoc;
	}
	
	public AuthorizeVocParticipants_ProgSelect gotoVocationalParticipantsAuthorize() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(vocTopLink).moveToElement(vocAuthParticipantsLink).click().build().perform();
		
		AuthorizeVocParticipants_ProgSelect authPartVoc = PageFactory.initElements(driver, AuthorizeVocParticipants_ProgSelect.class);
		return authPartVoc;
	}

	
	public LoginPage doLogout(){
		logOut.click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		TestBase.isLoggedIn = false;
		return loginPage;		
	}





	

}
