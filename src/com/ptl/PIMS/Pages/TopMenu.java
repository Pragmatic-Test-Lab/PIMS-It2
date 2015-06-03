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
import com.ptl.PIMS.Pages.DisciplineManagement.AuthorizeDiscipline_SelectRecordPage;
import com.ptl.PIMS.Pages.DisciplineManagement.EditAddDisciplinePage;
import com.ptl.PIMS.Pages.EscortManagement.EscortAddUpdatePage;
import com.ptl.PIMS.Pages.EscortManagement.EscortAuhtorizeSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.Calendar.CalendarInmateSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.EscortOutInAuthorizeSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.RecordEscortInSelectPage;
import com.ptl.PIMS.Pages.EscortManagement.TimeRecord.RecordEscortOutSelectPage;
import com.ptl.PIMS.Pages.IncidenceManagement.IncidenceAddInmateSelectionPage;
import com.ptl.PIMS.Pages.IncidenceManagement.IncidenceAuthorizeInmateSelectionPage;
import com.ptl.PIMS.Pages.IncidenceManagement.Recapture.RecaptureAddInmatePage;
import com.ptl.PIMS.Pages.IncidenceManagement.Recapture.RecaptureAuthorizeSelectionPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialEveningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialMorningPage;
import com.ptl.PIMS.Pages.IndustrialManagement.IndustrialTrainingPage;
import com.ptl.PIMS.Pages.IndustrialManagement.WagesPage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizePostRegInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeRegInmatePage;
import com.ptl.PIMS.Pages.MealManagement.DemandAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.DemandOrderPage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.GoodReceivedPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.KitchenItemPage;
import com.ptl.PIMS.Pages.MealManagement.KitchenSlipPage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderAuthorizePage;
import com.ptl.PIMS.Pages.MealManagement.PurchaseOrderPage;
import com.ptl.PIMS.Pages.MealManagement.RecipePage;
import com.ptl.PIMS.Pages.MealManagement.SupplierPage;
import com.ptl.PIMS.Pages.MovementManagement.MovementOutPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.AddUpdateActionPlanPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.ActionPlans.AuthorizeActionPlanSelectPage;
import com.ptl.PIMS.Pages.RehabilitationManagement.Participants.AddParticipantsSelectProg;
import com.ptl.PIMS.Pages.RehabilitationManagement.Participants.AuthorizeSheduleParticipantsSelectProg;
import com.ptl.PIMS.Pages.RehabilitationManagement.RehabilitationProgram.AddUpdateRehabilitationProgram;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.AddUpdateRehabShedule;
import com.ptl.PIMS.Pages.RehabilitationManagement.Shedule.AuthorizeRehabSheduleSelectProg;
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
	@FindBy(xpath = Constants.GoodReceivedAuthorized)
	WebElement goodreceivedauthorize;
	@FindBy(xpath = Constants.MealManagement)
	WebElement mealmanagement;
	@FindBy(xpath = Constants.Supplier)
	WebElement supplier;
	@FindBy(xpath = Constants.KitchenItem)
	WebElement kitchenitem;
	@FindBy(xpath = Constants.Recipe)
	WebElement recipe;
	
	@FindBy(xpath = Constants.IndustrialManagement)
	WebElement industrialmanagement;
	@FindBy(xpath = Constants.IndustrialManagementMorning)
	WebElement industrialmanagementmorning;
	@FindBy(xpath = Constants.IndustrialManagementEvening)
	WebElement industrialmanagementevening;
	@FindBy(xpath = Constants.IndustrialWages)
	WebElement wages;
	@FindBy(xpath = Constants.IndustrialTraining)
	WebElement industrialmanagementtraining;
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
	
	@FindBy(xpath = Constants.TopMenu_MovementLink)
	WebElement movementmanagement;
	@FindBy(xpath = Constants.TopMenu_MovementOutLink)
	WebElement movementoutmanagement;
	
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
	
	@FindBy(xpath = Constants.TopMenu_RehabTopLink)
	WebElement rehabTopLink;
	@FindBy(xpath = Constants.TopMenu_ActionPlanTop)
	WebElement apTopLink;
	@FindBy(xpath = Constants.TopMenu_ActionPlanAdd)
	WebElement apAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_ActionPlanAuthorize)
	WebElement apAuthLink;
	@FindBy(xpath = Constants.TopMenu_RehabProgram)
	WebElement rehabAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_RehabSheduleTop)
	WebElement rehabSheduleTopLink;
	@FindBy(xpath = Constants.TopMenu_RehabSheduleAdd)
	WebElement rehabSheduleAddUpdate;
	@FindBy(xpath = Constants.TopMenu_RehabSheduleAuth)
	WebElement rehabSheduleAuth;
	@FindBy(xpath = Constants.TopMenu_RehabSheduleParticipantsTop)
	WebElement rehabShedulePartTop;
	@FindBy(xpath = Constants.TopMenu_RehabSheduleParticipants)
	WebElement rehabShedulePartAdd;
	@FindBy(xpath = Constants.TopMenu_RehabSheduleParticipantAuth)
	WebElement rehabShedulePartAuth;
	
	@FindBy(xpath = Constants.TopMenu_DisciplineTopLink)
	WebElement discTopLink;
	@FindBy(xpath = Constants.TopMenu_DisciplineAddUpdateLink)
	WebElement discAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_DisciplineAuthorizeLink)
	WebElement discAuthorizeLink;

	@FindBy(xpath = Constants.TopMenu_IncidenceTopLink)
	WebElement inciTopLink;
	@FindBy(xpath = Constants.TopMenu_IncidenceAddLink)
	WebElement inciAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_IncidenceAuthorizeLink)
	WebElement inciAuthorizeLink;
	@FindBy(xpath = Constants.TopMenu_IncidenceRecaptureAddUpdateLink)
	WebElement inciRecapAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_IncidenceRecaptureAuthorizeLink)
	WebElement inciRecapAuthorizeLink;	
	
	@FindBy(xpath = Constants.TopMenu_EscortCalendarTopLink)
	WebElement escortCalendarLink;
	@FindBy(xpath = Constants.TopMenu_EscortManagementTopLink)
	WebElement escortTopLink;
	@FindBy(xpath = Constants.TopMenu_EscortListAddUpdateLink)
	WebElement escortAddUpdateLink;
	@FindBy(xpath = Constants.TopMenu_EscortAuthorizeLink)
	WebElement escortAuthorizeLink;
	@FindBy(xpath = Constants.TopMenu_EscortOutLink)
	WebElement escortOutLink;
	@FindBy(xpath = Constants.TopMenu_EscortInLink)
	WebElement escortInLink;
	@FindBy(xpath = Constants.TopMenu_EscortInOutAuthorizeLink)
	WebElement escortInOutAuthorizeLink;
	
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
	
	
	public GoodReceivedAuthorizePage gotoGoodReceivedAuthorizePage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(goodreceived).moveToElement(goodreceivedauthorize).click().build().perform();
		GoodReceivedAuthorizePage newgoodreceivedauthorizePage = PageFactory.initElements(driver, GoodReceivedAuthorizePage.class);
		return newgoodreceivedauthorizePage;
	}	

	public SupplierPage gotoNewSupplierPage(){
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(supplier).click().build().perform();
		SupplierPage newSupplierPage = PageFactory.initElements(driver, SupplierPage.class);
		return newSupplierPage;
	}

	public KitchenItemPage gotoNewKitchenItemPage() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(kitchenitem).click().build().perform();
		KitchenItemPage newkitchenitempage = PageFactory.initElements(driver, KitchenItemPage.class);
		return newkitchenitempage;
	
	}		
	
	public RecipePage gotoNewRecipePage() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(mealmanagement).moveToElement(recipe).click().build().perform();
		RecipePage newrecipepage = PageFactory.initElements(driver, RecipePage.class);
		return newrecipepage;
	
	}
	
	

	public IndustrialMorningPage gotoNewIndustrialMorning() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(industrialmanagement).moveToElement(industrialmanagementmorning).click().build().perform();
		IndustrialMorningPage newindustrialmorningpage = PageFactory.initElements(driver, IndustrialMorningPage.class);
		return newindustrialmorningpage;
	
	}
	
	
	public IndustrialEveningPage gotoNewIndustrialEvening() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(industrialmanagement).moveToElement(industrialmanagementevening).click().build().perform();
		IndustrialEveningPage newindustrialeveningpage = PageFactory.initElements(driver, IndustrialEveningPage.class);
		return newindustrialeveningpage;
	
	}
	
	public WagesPage gotowages() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(industrialmanagement).moveToElement(wages).click().build().perform();
		WagesPage wagespage = PageFactory.initElements(driver, WagesPage.class);
		return wagespage;
	
	}
	
	public IndustrialTrainingPage gotoNewIndustrialTraining() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(industrialmanagement).moveToElement(industrialmanagementtraining).click().build().perform();
		IndustrialTrainingPage newindustrialtrainingpage = PageFactory.initElements(driver, IndustrialTrainingPage.class);
		return newindustrialtrainingpage;
	
	}
	
	public MovementOutPage gotoNewMovementOutPage() {
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(movementmanagement).moveToElement(movementoutmanagement).click().build().perform();
		MovementOutPage newmovementoutpage = PageFactory.initElements(driver, MovementOutPage.class);
		return newmovementoutpage;
	
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
	

	public AddUpdateActionPlanPage gotoActionPlanAddUpdate() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(apTopLink).moveToElement(apAddUpdateLink).click().build().perform();
		return PageFactory.initElements(driver, AddUpdateActionPlanPage.class);
	}
	
	public AuthorizeActionPlanSelectPage gotoActionPlanAuthorize() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(apTopLink).moveToElement(apAuthLink).click().build().perform();
		return PageFactory.initElements(driver, AuthorizeActionPlanSelectPage.class);
	}

	public AddUpdateRehabilitationProgram gotoRehabilitationProgram() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(rehabAddUpdateLink).click().build().perform();
		return PageFactory.initElements(driver, AddUpdateRehabilitationProgram.class);
	}
	
	public AddUpdateRehabShedule gotoAddUpdateSheduleRehab() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(rehabSheduleTopLink).moveToElement(rehabSheduleAddUpdate).click().build().perform();
		return PageFactory.initElements(driver, AddUpdateRehabShedule.class);
	}
	
	public AuthorizeRehabSheduleSelectProg gotoAuthorizeRehabShedule() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(rehabSheduleTopLink).moveToElement(rehabSheduleAuth).click().build().perform();
		return PageFactory.initElements(driver, AuthorizeRehabSheduleSelectProg.class);
	}
	
	public AddParticipantsSelectProg gotoAddRehabSheduleParticipants() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(rehabShedulePartTop).moveToElement(rehabShedulePartAdd).click().build().perform();
		return PageFactory.initElements(driver, AddParticipantsSelectProg.class);
	}
	
	public AuthorizeSheduleParticipantsSelectProg gotoAuthRehabSheduleParticipants() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(rehabTopLink).moveToElement(rehabShedulePartTop).moveToElement(rehabShedulePartAuth).click().build().perform();
		return PageFactory.initElements(driver, AuthorizeSheduleParticipantsSelectProg.class);
	}
	
	
	public EditAddDisciplinePage gotoAddUpdateDiscipline() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(discTopLink).moveToElement(discAddUpdateLink).click().build().perform();
		return PageFactory.initElements(driver, EditAddDisciplinePage.class);
	}
	
	public AuthorizeDiscipline_SelectRecordPage gotoAuthorizeDiscipline() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(discTopLink).moveToElement(discAuthorizeLink).click().build().perform();
		return PageFactory.initElements(driver, AuthorizeDiscipline_SelectRecordPage.class);
	}
	
	
	public IncidenceAddInmateSelectionPage gotoAddIncidence() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(inciTopLink).moveToElement(inciAddUpdateLink).click().build().perform();
		return PageFactory.initElements(driver, IncidenceAddInmateSelectionPage.class);
	}
	
	public IncidenceAuthorizeInmateSelectionPage gotoAuthIncidence() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(inciTopLink).moveToElement(inciAuthorizeLink).click().build().perform();
		return PageFactory.initElements(driver, IncidenceAuthorizeInmateSelectionPage.class);
	}
	
	public RecaptureAddInmatePage gotoAddRecapIncidence() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(inciTopLink).moveToElement(inciRecapAddUpdateLink).click().build().perform();
		return PageFactory.initElements(driver, RecaptureAddInmatePage.class);
	}
	
	public RecaptureAuthorizeSelectionPage gotoAuthorizeRecapIncidence() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(inciTopLink).moveToElement(inciRecapAuthorizeLink).click().build().perform();
		return PageFactory.initElements(driver, RecaptureAuthorizeSelectionPage.class);
	}


	public CalendarInmateSelectPage gotoEscortCalendar() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(escortCalendarLink).click().build().perform();
		return PageFactory.initElements(driver, CalendarInmateSelectPage.class);
	}
	
	public EscortAddUpdatePage gotoEscortAddUpdate() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(escortTopLink).moveToElement(escortAddUpdateLink).click().build().perform();
		return PageFactory.initElements(driver, EscortAddUpdatePage.class);
	}
	
	public EscortAuhtorizeSelectPage gotoEscortAuthorize() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(escortTopLink).moveToElement(escortAuthorizeLink).click().build().perform();
		return PageFactory.initElements(driver, EscortAuhtorizeSelectPage.class);
	}
	
	public RecordEscortOutSelectPage gotoEscortOut() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(escortTopLink).moveToElement(escortOutLink).click().build().perform();
		return PageFactory.initElements(driver, RecordEscortOutSelectPage.class);
	}
	
	public RecordEscortInSelectPage gotoEscortIn() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(escortTopLink).moveToElement(escortInLink).click().build().perform();
		return PageFactory.initElements(driver, RecordEscortInSelectPage.class);
	}
	
	public EscortOutInAuthorizeSelectPage gotoEscortInOutAuthorize() {
		
		Actions action = new Actions(driver);
		action.moveToElement(transactionManagementTopLink).moveToElement(escortTopLink).moveToElement(escortInOutAuthorizeLink).click().build().perform();
		return PageFactory.initElements(driver, EscortOutInAuthorizeSelectPage.class);
	}
	
	public LoginPage doLogout(){
		logOut.click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		TestBase.isLoggedIn = false;
		return loginPage;		
	}








	

}
