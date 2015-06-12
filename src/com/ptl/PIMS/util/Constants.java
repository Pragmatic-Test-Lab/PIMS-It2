package com.ptl.PIMS.util;

public class Constants {

	// paths
	public static String CONFIG_FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\com\\ptl\\config\\config.properties";
	public static String EXCEL_Path = System.getProperty("user.dir")
			+ "\\src\\com\\ptl\\data\\TestData.xlsx";


	//Login Page
	public static final String Login_username = "//*[@id='login-form-login']";
	public static final String Login_password = "//*[@id='login-form-password']";
	public static final String Login_login = "//*[@id='login-form']/button";
	public static final String Login_PasswordError = "//*[text()='Password']/following::div[1]";

	// Home Page
	public static final String Home_MainImage = ".//img[@src='../views/site/prison.jpg']";

	// Top Menu Links
	public static final String TopMenu_PIMSTopLink = "//a[text()='HOME']";
	public static final String TopMenu_RegistrationManagementTopLink = "//a[contains(text(),'Registration Management')]";
	public static final String TopMenu_RegistrationManagement_AdmissionTopLink = "//*[text() = 'Admission']";
	public static final String TopMenu_AuthorizeSubLink = "//*[text()='Authorize']";
	public static final String TopMenu_RegistrationManagement_RegistrationTopLink = "//*[text() = 'Registration']";
	public static final String TopMenu_AuthorizeRegistrationSubLink = "//a[contains(@href,'/registration-authorization')]";
	public static final String TopMenu_PostRegistrationTopLink = "(.//a[text()='Post Registration'])[1]";
	public static final String TopMenu_AuthorizePostRegSubLink = "//a[contains(@href,'/post-registration-authorization')]";
	public static final String TopMenu_TransactionManagementTopLink = "//a[text()='Transaction Management ']";
	public static final String TopMenu_AppealTopLink = "//a[text()='Appeal Management']";
	public static final String TopMenu_AppealAddUpdateLink = "//a[text()='Appeal Add/Update']";
	public static final String TopMenu_AppealJailorApprovalLink = "//a[text()='Jailor Approval']";
	public static final String TopMenu_AppealSPApprovalLink = "//a[text()='SP Approval']";
	public static final String TopMenu_AppealSendToCourtApprovalLink = "//a[text()='Court Approval']";
	public static final String TopMenu_AppealCourtApprovalLink = "//a[text()='Appeal Response']";
	public static final String TopMenu_VOCTopLink = "//a[text()='Vocational Training']";
	public static final String TopMenu_VOCAddUpdateLink = "//a[text()='Vocational Training Programs Add/Update']";
	public static final String TopMenu_VOCAuth = "//a[text()='Vocational Training Programs Authorizations']";
	public static final String TopMenu_VOCPart = "//a[text()='Vocational Training Programe Participants']";
	public static final String TopMenu_VOCAuthPart = "//a[text()='Vocational Training Program Participants Authorization']";
	
	public static final String TopMenu_RehabTopLink = "//a[text()='Rehabilitation Management']";
	public static final String TopMenu_ActionPlanTop = "//a[text()='Action Plan']";
	public static final String TopMenu_ActionPlanAdd = "//a[text()='Action Plan Add/Update']";
	public static final String TopMenu_ActionPlanAuthorize = "//a[text()='Action Plan Authorize']";
	public static final String TopMenu_RehabProgram = "//a[text()='Rehabilitation Programme']";
	public static final String TopMenu_RehabSheduleTop = "//a[text()='Schedule Rehabilitation Programs']";
	public static final String TopMenu_RehabSheduleAdd = "//a[text()='Schedule Rehabilitation Programs Add/Update']";
	public static final String TopMenu_RehabSheduleAuth = "//a[text()='Schedule Rehabilitation Programs Authorize']";
	public static final String TopMenu_RehabSheduleParticipantsTop = "//a[text()='Rehabilitation Participants']";
	public static final String TopMenu_RehabSheduleParticipants = "//a[text()='Rehabilitation Participants Add/Update']";
	public static final String TopMenu_RehabSheduleParticipantAuth = "//a[text()='Rehabilitation Participants Authorizations']";
	public static final String TopMenu_DisciplineTopLink = "//a[text()='Discipline Management']";
	public static final String TopMenu_DisciplineAddUpdateLink = "//a[text()='Discipline Add/Update']";
	public static final String TopMenu_DisciplineAuthorizeLink = "//a[text()='Discipline Authorize']";
	public static final String TopMenu_IncidenceTopLink = "//a[text()='Incidence Management']";
	public static final String TopMenu_IncidenceAddLink = "//a[text()='Incidence Add/Update']";
	public static final String TopMenu_IncidenceAuthorizeLink = "//a[text()='Incidence Authorizations']";
	public static final String TopMenu_IncidenceRecaptureAddUpdateLink = "//a[text()='Re-capture Add']";
	public static final String TopMenu_IncidenceRecaptureAuthorizeLink = "//a[text()='Re-capture Authorize']";
	public static final String TopMenu_EscortCalendarTopLink= "//a[text()='Calendar']";
	public static final String TopMenu_EscortManagementTopLink= "//a[text()='Movement Management']";
	public static final String TopMenu_EscortListAddUpdateLink= "//a[text()='Movement Out Add/Update']";
	public static final String TopMenu_EscortAuthorizeLink= "//a[text()='Escort Authorize']";
	public static final String TopMenu_EscortOutLink= "//a[text()='Escort Out']";
	public static final String TopMenu_EscortInLink= "//a[text()='Escort In']";
	public static final String TopMenu_EscortInOutAuthorizeLink= "//a[text()='Escort in/out Authorization']";
	
	public static final String TopMenu_LogOut = "//a[contains(text(),'Logout')]";

	//Iteration 1 Pages
	//

	//Authorize Admission
	public static final String Admission_InmateCategory = "//*[@id='admission-adm_inmate_category_id']";
	public static final String Admission_DOAdmission = "//*[@id='admission-adm_date_of_admission']";
	public static final String Admission_RegNum = "//*[@id='admission-adm_registration_no']";

	public static final String Admission_InmateCourtDetailTab = "//a[text() = 'Court Detail']";
	public static final String Admission_InmateCourtTableBody = "//*[@id='inmate_case_details_grid']/tbody";
	public static final String Admission_InmateCourtDetail_AddNew = "//button[text()='Add New']";
	public static final String Admission_InmateCourtDetail_Court = "(.//select[contains(@name, 'icd_court_id')])";
	public static final String Admission_InmateCourtDetail_CaseNumber = "(.//input[contains(@name, 'icd_case_number')])";
	public static final String Admission_InmateCourtDetail_DateConviction = "(.//input[contains(@name, 'icd_date_of_conviction')])";
	public static final String Admission_InmateCourtDetail_DateSentence = "(.//*[contains(@name, 'icd_date_of_sentence')])";

	public static final String CalendarPopup_AdmissionMonthYearText = "(.//th[contains(@class,'switch')])[3]";
	public static final String CalendarPopup_AdmissionYearText = "(.//th[contains(@class,'switch')])[4]";
	public static final String CalendarPopup_AdmissionYearText_FirstPart = ".//span[text()='";
	public static final String CalendarPopup_AdmissionYearText_LastPart = "' and @class='year active']";

	public static final String AuthorizeButton = "//button[text() = 'Authorize']";
	//

	//Authorize Registration


	public static final String Registration_CaseDetailTab = "//a[text() = 'Inmate Case Details']";
	public static final String Registration_CaseTableBody = "//*[@id='sentence_grid']/tbody";
	public static final String Registration_CaseDetail_AddNew = "//button[text()='Add New']";	
	public static final String Registration_CaseDetail_CaseNumber = "(.//select[contains(@name, '[sen_case_id]')])";
	public static final String Registration_CaseDetail_Offence = "(.//select[contains(@name, '[sen_offence_id]')])";
	public static final String Registration_CaseDetail_SentenceType = "(.//select[contains(@name, '[sen_sentence_type_id]')])";
	public static final String Registration_CaseDetail_Years = "(.//input[contains(@name, '[sen_years]')])";
	public static final String Registration_CaseDetail_Months = "(.//input[contains(@name, '[sen_months]')])";
	public static final String Registration_CaseDetail_Days = "(.//input[contains(@name, '[sen_days]')])";
	public static final String Registration_CaseDetail_Fine = "(.//input[contains(@name, 'sen_fine_charges')])";		
	//

	//
	//


	//Iteration 2 Pages
	//
	public static final String SuccessMessage = ".//div[@class='alert alert-success']";


	//Appeal Management
	public static final String AppealManagement_RegNoSearch = "//*[@name='AppealSearch[registration_no]']";
	public static final String AppealManagement_BioIdSearch = "//*[@name='AppealSearch[biometric_id]']";
	public static final String AppealManagement_NameSearch = "//*[@name='AppealSearch[name_as_in_warrant]']";
	public static final String AppealManagement_DateSearch = "//*[@name='AppealSearch[app_date]']";
	public static final String AppealManagement_ReasonSearch = "//*[@name='AppealSearch[app_reason]']";
	public static final String AppealManagement_NewAppealButton = "//*[@href='/PIMS3/web/appeal/selectadmission']";
	public static final String AppealManagement_FirstAppeal = "(.//*[contains(@class, 'glyphicon')]//parent::a)[1]";

	public static final String AppealManagement_AppealDate = "//*[@id='appeal-app_date']";
	public static final String AppealManagement_AppealCase = "//*[@id='appeal-app_case_id']";
	public static final String AppealManagement_AppealAllAvailableCases = "//select[@id='appeal-app_case_id']/option";	
	public static final String AppealManagement_AppealCourt = "//*[@id='appeal-app_court_id']";
	public static final String AppealManagement_IsExternalAppeal = "//*[@name='Appeal[app_external_appeal]']";
	public static final String AppealManagement_WarrantUpload = ".//*[@id='appeal-warrant']";
	public static final String AppealManagement_AppealFormUpload = "//*[@id='appeal-appealform']";
	public static final String AppealManagement_ReasonTab = "//a[text()='Reason']";	
	public static final String AppealManagement_AppealReason = "//*[@id='appeal-app_reason']";
	public static final String AppealManagement_RequestTab = "//a[text()='Request']";
	public static final String AppealManagement_AppealRequest = "//*[@id='appeal-app_request']";
	public static final String AppealManagement_AddUpdateButton = "//*[@type='submit']";
	public static final String AppealManagement_UpdateSuccessMessage = "//*[@type='submit']";

	public static final String AppealManagement_ApproveAppealButton = "//button[text() = 'Authorize']";


	//Meal Management Page 

	//Meal Management Page 

	public static final String DemandOrderAdd = "//*[text()='Demand Order Add/Update']";
	public static final String TransactionManagement = ".//a[text()='Transaction Management ']";
	public static final String MealManagement = ".//a[text()='Meal Management']";
	public static final String DemandOrder = ".//a[text()='Demand Order']";
	public static final String CreateDemand = ".//a[text()='Create Demand Order']";
	public static final String CreateDemandHeader="//*[@class='stock-tranaction-header-create']/h1";
	public static final String CreateDemandPageHeader="Create Demand Order";
	public static final String CreateDemandButton = "//*[@class='btn btn-success']";
	public static final String DemandSuccessMessage="//*[@class='alert alert-success']";
	public static final String CreateDemandOrder_SuccessMessageText = "Created .* successfully";
	public static final String DemandOrderAuthorize = "//*[text()='Demand Order Authorize']";
	public static final String DemandOrderId = "//*[@id='stocktranactionheader-sth_order_no']";
	public static final String OrdernoSearch = "//*[@name='StockTranactionHeaderSearch[sth_order_no]']";
	public static final String SelectDemandOrder = "(//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String AuthorizeDemand = "//*[@class='btn btn-primary']";
	public static final String AuthorizeDemandSuccess = "//*[@class='alert alert-success']";
	public static final String AuthorizeDemandOrder_SuccessMessageText = "Saved .* successfully";

	public static final String KitchenSlip = ".//a[text()='Kitchen Slip']";
	public static final String KitchenSlipAdd = ".//a[text()='Kitchen Slip Add/Update']";
	public static final String CreateKitchenSlip = "//*[@class='btn btn-success']";
	public static final String KitchenSlipId = "//*[@id='stocktranactionheader-sth_refference_no']";
	public static final String CreateKitchenSlipButton = "//*[@class='btn btn-success']";
	public static final String SuccessMessageKitchen = "//*[@class='alert alert-success']";
	public static final String CreateKitchenSlip_SuccessMessageText = "Created .* successfully";
	public static final String Kitchenitemline ="//*[@id='stocktranactiondetails-1-std_kitchen_item_id']";
	public static final String AddNewKitchenItem = "//*[@class='btn btn-success glyphicon glyphicon-plus']";
	public static final String quantityline = "//*[@id='stocktranactiondetails-1-std_quantity']";
	public static final String KitchenOrderNo = "//*[@name='StockTranactionHeaderSearch[sth_refference_no]']";
	public static final String SelectKitchenOrder = "(//*[@class='glyphicon glyphicon-ok'])[1]";
	public static final String KitchenOrderAuthorize = "//*[text()='Kitchen Slip Authorize']";
	public static final String AuthorizeKitchen = "//*[@class='btn btn-primary']";
	public static final String SuccessMessageKitchenAuthorize = "//*[@class='alert alert-success']";
	public static final String AuthorizeKitchen_SuccessMessageText = "Saved .* successfully";

	public static final String Supplier = ".//a[text()='Supplier']";
	public static final String SupplierAdd = ".//a[text()='Supplier']";
	public static final String CreateSupplier = "//*[text()='Create Supplier']";
	public static final String SupplierName = "//*[@id='supplier-sup_name']";
	public static final String CreateSupplierButton = "//*[@class='btn btn-success']";
	public static final String CreateSupplier_SuccessMessageText = "Created .* successfully";
	public static final String SupplierSuccessMessage = "//*[@class='alert alert-success']";

	public static final String KitchenItem = ".//a[text()='Kitchen Item']";
	public static final String KitchenItemName = "//*[@id='kitchenitem-kit_name']";
	public static final String KitchenItemNameSinhala = "//*[@id='kitchenitem-kit_name_si']";
	public static final String KitchenItemNameTamil = "//*[@id='kitchenitem-kit_name_ta']";
	public static final String Unit = "//*[@id='kitchenitem-kit_unit_id']";
	public static final String Wastage = "//*[@id='kitchenitem-kit_wastage']";
	public static final String CreateKitchenItemButton = "//*[@class='btn btn-success']";
	public static final String CreateKitchenItem="//*[text()='Create Kitchen Item']";
	public static final String CreateKitchenItem_SuccessMessageText = "Created .* successfully";
	public static final String KitchenSuccessMessage = "//*[@class='alert alert-success']";

	public static final String Recipe = ".//*[text()='Recipe']";
	public static final String CreateRecipe="(.//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String KitchenItemName2 = "";
	public static final String addnewrecipe = "//*[@class='btn btn-success glyphicon glyphicon-plus']";
	public static final String RecipeTableBody = "//*[@id='recepe_details_grid']/tbody";
	public static final String RecipeCountitem = "(.//select[contains(@id, '-red_kitchen_item_id')])";
	public static final String RecipeCountquantity = "(.//input[contains(@id, '-red_quantity')])";
	public static final String CreateRecipeItemButton = "//*[@class='btn btn-primary']";
	public static final String CreateRecipe_SuccessMessageText="Saved .* successfully";
	public static final String RecipeSuccessMessage = "//*[@class='alert alert-success']";

	public static final String CreatePurchaseOrder = ".//a[text()='Create Purchase Order']";
	public static final String PurchaseOrder = ".//a[text()='Purchase Order']";
	public static final String PurchaseOrderAdd = ".//a[text()='Purchase Order Add/Update']";
	public static final String PurchaseOrderId = "//*[@id='stocktranactionheader-sth_order_no']";
	public static final String SupplierLine = "//*[@id='stocktranactionheader-sth_supplier_id']";
	public static final String Kitchenitemline1 = "//*[@id='stocktranactiondetails-1-std_kitchen_item_id']";
	public static final String quantityline1 = "//*[@id='stocktranactiondetails-1-std_quantity']";
	public static final String AddNewPurchaseOrder = "//*[@class='btn btn-success glyphicon glyphicon-plus']";
	public static final String PurchaseOrderCreate = "//*[@class='btn btn-success']";
	public static final String SuccessMessagePurchaseOrder = "//*[@class='alert alert-success']";
	public static final String CreatePurchaseOrder_SuccessMessageText = "Created .* successfully";
	public static final String PurchaseOrderNo = "//*[@name='StockTranactionHeaderSearch[sth_order_no]']";
	public static final String SelectPurchaseOrder ="(//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String AuthorizePurchase="//*[@class='btn btn-primary']";
	public static final String SuccessMessagePurchaseAuthorize ="//*[@class='alert alert-success']";
	public static final String PurchaseOrderAuthorize = "//*[text()='Purchase Order Authorize']";
	public static final String AuthorizePurchase_SuccessMessageText = "Saved .* successfully";

	public static final String GoodReceivedNo = "//*[@name='StockTranactionHeaderSearch[sth_order_no]']";
	public static final String SelectGoodReceived = "(//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String GoodReceivedQuantity = ".//*[@name='StockTranactionDetails[0][std_issued_quantity]']";
	public static final String CreateGoodReceivedButton = "//*[@class='btn btn-primary']";
	public static final String SuccessMessageGoodReceived = "//*[@class='alert alert-success']";
	public static final String GoodReceived = ".//a[text()='Good Received Note']";
	public static final String GoodReceivedAdd = ".//a[text()='Good Received Note Add/Update']";
	public static final String AuthorizeGoodReceived_SuccessMessageText = "Saved .* successfully";
	public static final String SuccessMessageGoodReceivedAuthorize = ".//div[@class='alert alert-success']";
	public static final String AuthorizeGoodReceived = "//*[@class='btn btn-primary']";
	public static final String GoodReceivedAuthorized = ".//a[text()='Good Received Note Authorize']";





	//


	//Vocational Management Page
	public static final String VOCManagement_SearchProgCode = "//input[@name='VocationalTrainingProgramSearch[vtp_program_code]']";
	public static final String VOCManagement_SearchProgName = "//input[@name='VocationalTrainingProgramSearch[vtp_program_name]']";
	public static final String VOCManagement_SearchProgDuration = "//input[@name='VocationalTrainingProgramSearch[vtp_duration]']";
	public static final String VOCManagement_NewVOCProgButton = "//a[@href='/PIMS3/web/vocational-training-program/create']";

	public static final String VOC_ProgCode = "//input[@name='VocationalTrainingProgram[vtp_program_code]']";
	public static final String VOC_ProgName = "//input[@name='VocationalTrainingProgram[vtp_program_name]']";
	public static final String VOC_ProgDuration = "//input[@name='VocationalTrainingProgram[vtp_duration]']";
	public static final String VOC_VOCType = "//select[@name='VocationalTrainingProgram[vtp_vocatinal_type_id]']";
	public static final String VOC_VOCTrainingInstitute = "//select[@name='VocationalTrainingProgram[vtp_training_institute_id]']";
	public static final String VOC_VOCPrisonInstitute = "//select[@name='VocationalTrainingProgram[vtp_prison_institute_id]']";
	public static final String VOC_VOCStartDate = "//input[@name='VocationalTrainingProgram[vtp_start_date]']";
	public static final String VOC_VOCEndDate = "//input[@name='VocationalTrainingProgram[vtp_end_date]']";
	public static final String VOC_VOCVenue = "//input[@name='VocationalTrainingProgram[vtp_venue]']";
	public static final String VOC_ResourcePerson = "//input[@name='VocationalTrainingProgram[vtp_resource_person]']";
	public static final String NewVOC_CreateButton = "//button[text()='Create']";
	public static final String UpdateVOC_UpdateButton = "//button[text()='Update']";
	public static final String AuthVOC_AuthorizeButton = "//button[text()='Authorize']";

	public static final String VOCParticipants_Table = "//*[@id='vocational_training_details_grid']/tbody";
	public static final String VOCParticipants_AddNew = "//button[text()='Add New']";
	public static final String VOCParticipants_RegNo = "(.//*[contains(@id,'-vtd_admission_id')])";
	public static final String VOCParticipants_IsParticipated = "(.//*[contains(@id,'-vtd_status')])";
	public static final String VOCParticipants_Grade = "(.//*[contains(@id,'-vtd_grade')])";
	public static final String VOCParticipants_Remarks = "(.//*[contains(@id,'-vtd_remarks')])";
	public static final String VOCParticipants_UpdateButton = "//button[text()='Update']";
	public static final String VOCParticipantsAuth_AuthorizeButton = "//button[text()='Authorize']";


	public static final String RehabilitationManagement_APPrisonSearch = "//input[@name='RehabilitationActionPlanHeaderSearch[rph_institute_id]']";
	public static final String RehabilitationManagement_APYearSearch = "//input[@name='RehabilitationActionPlanHeaderSearch[rph_year]']";
	public static final String RehabilitationManagement_FirstRecord = "(.//span[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String RehabilitationManagement_NewAPButton = "//a[@href='/PIMS3/web/rehabilitation-action-plan-header/create']";
	
	public static final String RehabilitationManagement_APYear = "//*[@id='rehabilitationactionplanheader-rph_year']";
	public static final String RehabilitationManagement_RehabTable = "//*[@id='rehabilitation_action_plan_grid']/tbody";
	public static final String RehabilitationManagement_AddNew = "//button[text()='Add New']";
	public static final String RehabilitationManagement_APRehabProgram = "(.//*[contains(@id,'-rap_rehabilitation_program_id')])";
	public static final String RehabilitationManagement_APRehabStart = "(.//*[contains(@id,'-rap_start_date')])";
	public static final String RehabilitationManagement_APRehabEnd = "(.//*[contains(@id,'-rap_end_date')])";
	public static final String RehabilitationManagement_APRehabCost = "(.//*[contains(@id,'-rap_cost')])";
	public static final String RehabilitationManagement_CreateButton = "//button[text()='Create']";
	public static final String RehabilitationManagement_UpdateButton = "//button[text()='Update']";
	public static final String RehabilitationManagement_AuthorizeButton = "//button[text()='Authorize']";
	
	public static final String RehabilitationManagement_searchCode = "//input[@name='RehabilitationProgramSearch[rep_code]']";
	public static final String RehabilitationManagement_searchName = "//input[@name='RehabilitationProgramSearch[rep_name]']";
	public static final String RehabilitationManagement_newProgramButton = "//a[@href='/PIMS3/web/rehabilitation-program/create']";
	public static final String RehabilitationManagement_RehabCode = "//input[@name='RehabilitationProgram[rep_code]']";
	public static final String RehabilitationManagement_RehabName = "//input[@name='RehabilitationProgram[rep_name]']";
	public static final String RehabilitationManagement_RehabCategory = "//select[@name='RehabilitationProgram[rep_rehabilitation_program_category_id]']";
	
	public static final String RehabilitationManagementSearch_SheProg = "//input[@name='RehabilitationParticipantsSearch[rehabilitation_programe]']";
	public static final String RehabilitationManagementSearch_SheStart = "//input[@name='RehabilitationParticipantsSearch[rhp_start_date]']";
	public static final String RehabilitationManagementSearch_SheEnd = "//input[@name='RehabilitationParticipantsSearch[rhp_end_date]']";
	public static final String RehabilitationManagementSearch_SheOrg = "//input[@name='RehabilitationParticipantsSearch[rhp_conducted_organization]']";
	public static final String RehabilitationManagement_NewSheduleButton = "//a[@href='/PIMS3/web/shedule-rehabilitation-programe/create']";
	public static final String RehabilitationManagement_SheduleProgram = "//select[@name='RehabilitationParticipants[rhp_rehabilitation_program_id]']";
	public static final String RehabilitationManagement_SheduleStart = "//input[@name='RehabilitationParticipants[rhp_start_date]']";
	public static final String RehabilitationManagement_SheduleEnd = "//input[@name='RehabilitationParticipants[rhp_end_date]']";
	public static final String RehabilitationManagement_SheduleOrgan = "//input[@name='RehabilitationParticipants[rhp_conducted_organization]']";
	public static final String RehabilitationManagement_OkFirstRecord = "(.//span[@class='glyphicon glyphicon-ok'])[1]";
	
	public static final String RehabilitationManagement_ParticipantTable = "//*[@id='rehabilitation_participants_details_grid']/tbody";
	public static final String RehabilitationManagement_ParticipantInmate = "(.//select[contains(@id,'rpd_admission_id')])";
	public static final String RehabilitationManagement_ParticipantRemark = "(.//input[contains(@id,'rpd_remarks')])";


	
	public static final String DisciplineManagement_NewDiscButton = "//a[@href='/PIMS3/web/discipline/selectadmission']";
	public static final String DisciplineManagement_FirstPencil = "(.//span[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String DisciplineManagement_FirstOk = "(.//span[@class='glyphicon glyphicon-ok'])[1]";
	public static final String DisciplineManagement_SearchComId = "//input[@name='DisciplineSearch[dis_id]']";
	public static final String DisciplineManagement_SearchRegNo = "//input[@name='DisciplineSearch[registration_no]']";
	public static final String DisciplineManagement_SearchDOIncident = "//input[@name='DisciplineSearch[dis_date_of_incident]']";
	public static final String DisciplineManagement_SearchDOInquiry = "//input[@name='DisciplineSearch[dis_date_of_inquiry]']";
	
	public static final String DisciplineManagement_ComplaintTab = "//a[text()='Complaint']";
	public static final String DisciplineManagement_ComplaintDOInquiry = "//*[@id='discipline-dis_date_of_inquiry']";
	public static final String DisciplineManagement_ComplaintDOIncident = "//*[@id='discipline-dis_date_of_incident']";
	public static final String DisciplineManagement_ComplaintReoprtedByInmate = "//*[@id='discipline-dis_is_reported_by_inmate']";
	public static final String DisciplineManagement_ComplaintReoprtedByInmateRegNo = "//input[@id='discipline-dis_reported_by_reg_no']";
	public static final String DisciplineManagement_ComplaintReoprtedByOfficer = "//*[@id='discipline-dis_is_reported_by_officer']";
	public static final String DisciplineManagement_ComplaintReoprtedByOfficerName = "//input[@id='discipline-dis_reported_by_officer_name']";
	public static final String DisciplineManagement_ComplaintPlace = "//input[@id='discipline-dis_place']";
	public static final String DisciplineManagement_ComplaintComplaint = "//input[@id='discipline-dis_complaint']";
	public static final String DisciplineManagement_ComplaintInquiryBy = "//input[@id='discipline-dis_inquiry_by']";
	
	public static final String DisciplineManagement_JudgementTab = "//a[text()='Judgement']";
	public static final String DisciplineManagement_JudgementDate = "//*[@id='discipline-dis_judgement_date']";
	public static final String DisciplineManagement_JudgementGuilty = "//*[@id='discipline-dis_decision']";
	public static final String DisciplineManagement_JudgementText = "//*[@id='discipline-dis_judgement']";
	public static final String DisciplineManagement_JudgementDeductedRemision = "//*[@id='discipline-dis_deducted_remision_marks']";
	public static final String DisciplineManagement_JudgementGoodConduct = "//*[@id='discipline-dis_added_remision_marks']";
	public static final String DisciplineManagement_JudgementDOGoodConduct = "//*[@id='discipline-dis_added_date_of_remision_marks']";

	public static final String DisciplineManagement_CreateButton = "//button[text()='Create']";
	public static final String DisciplineManagement_UpdateButton = "//button[text()='Update']";
	public static final String DisciplineManagement_AuthorizeButton = "//button[text()='Authorize']";	
	
	//
	
	//Incidence Management
	
	public static final String IncidenceManagement_IncidenceTable = "//*[@id='event_grid']/tbody";
	public static final String IncidenceManagement_AddNew = "//button[text()='Add New']";
	public static final String IncidenceManagement_UpdateButton = "//button[text()='Update']";
	public static final String IncidenceManagement_AuthorizeButton = "//button[text()='Authorize']";	
	
	public static final String IncidenceManagement_Date = "(.//input[contains(@id,'-evt_date')])";
	public static final String IncidenceManagement_EventType = "(.//select[contains(@id,'evt_event_type_id')])";
	public static final String IncidenceManagement_EventD = "(.//input[contains(@id,'-evt_event_description')])";
	public static final String IncidenceManagement_Action = "(.//input[contains(@id,'-evt_action')])";
	public static final String IncidenceManagement_Place = "(.//input[contains(@id,'-evt_place_occured')])";
	public static final String IncidenceManagement_RecaptureDate = "(.//input[contains(@id,'-evt_recapture_date')])";
	
	public static final String IncidenceManagement_RegNoSearch = ".//input[@name='EventSearch[registration_no]']";
	public static final String IncidenceManagement_EventTypeSearch = ".//input[@name='EventSearch[evt_date]']";
	public static final String IncidenceManagement_EventDescSearch = ".//input[@name='EventSearch[evt_event_description]']";

	//
	
	//Escort Management
	
	public static final String EscortManagement_CreateButton = "//button[text()='Create'']";
	public static final String EscortManagement_UpdateButton = "//button[text()='Update'']";
	public static final String EscortManagement_AuthorizeButton = "//button[text()='Authorize'']";
	public static final String EscortManagement_SearchID = "//input[@name='EscortHeaderSearch[esh_id]']";
	public static final String EscortManagement_SearchDate = "//input[@name='EscortHeaderSearch[esh_date]']";
	public static final String EscortManagement_FirstRecord = "(.//span[@class='glyphicon glyphicon-pencil'])[1]";
	
	public static final String EscortManagement_CalendarCaseTable = "//*[@id='case_dates_grid']/tbody";
	public static final String EscortManagement_CalendarAddNew = "//button[text()='Add New']";
	public static final String EscortManagement_CalendarCaseDropdown = "(.//select[contains(@name,'cdt_case_id'])";
	public static final String EscortManagement_CalendarCaseDate = "(.//input[contains(@name,'cdt_next_case_date'])";
	public static final String EscortManagement_CalendarCaseIsCompleted = "(.//input[contains(@name,'cdt_is_completed'])";

	public static final String EscortManagement_NewEscortButton = "//a[@href='/PIMS3/web/escort-header/create']";
	public static final String EscortManagement_NewEscortCalendarField = "//*[@id='escortheader-esh_date']";
	public static final String EscortManagement_EscortTable = "//*[@id='escort_grid']/tbody";
	public static final String EscortManagement_EscortDetails = "(.//input[contains(@id,'-esc_escort_details')])";
	public static final String EscortManagement_EscortRegistrationNo = "(.//select[contains(@id,'-esc_admission_id')]/option[@selected=''])";
	public static final String EscortManagement_EscortCase = "(.//select[contains(@id,'-esc_case_id')]/option[@selected=''])";
	public static final String EscortManagement_EscortCourt = "(.//input[contains(@id,'court-')])";

	
	//
	
	//

	// Inmate Search Pages
	public static final String SelectInmate_Header = ".//*[@class='breadcrumb']/following::h1";
	public static final String InmateSearch_RegNoSearchField = ".//*[contains(@name,'Search[adm_registration_no]')]";
	public static final String InmateSearch_BiometricSearchField = ".//*[contains(@name,'Search[adm_biometric_id]')]";
	public static final String InmateSearch_NameSearchField = ".//*[contains(@name,'Search[adm_name_as_in_warrant]')]";
	public static final String InmateSearch_TableFirstInmate = "(.//*[contains(@class, 'glyphicon')]//parent::a)[1]";
	public static final String InmateSearchPage_NoSearchResultsFound = ".//*[text()='No results found.']";

	public static final String SearchPage_SuccessMessage = ".//div[@class='alert alert-success']";


	// Calendar Popup
	public static final String CalendarPopup_GoToMonthSelection = "//div[contains(@class,'picker-dropdown') and contains(@style,'display: block;')]"
			+ "/div[contains(@class,'picker-days')]/descendant::th[contains(@class,'switch')]";
	public static final String CalendarPopup_GoToYearSelection = "//div[contains(@class,'picker-dropdown') and contains(@style,'display: block;')]"
			+ "/div[contains(@class,'picker-months')]/descendant::th[contains(@class,'switch')]";
	public static final String CalendarPopup_SelectYearFP = "//div[@style='display: block;']/descendant::span[text()='";
	public static final String CalendarPopup_SelectYearLP = "' and contains(@class,'year')]";
	public static final String CalendarPopup_SelectMonthFP = "//div[@style='display: block;']/descendant::span[text()='";
	public static final String CalendarPopup_SelectMonthLP = "' and contains(@class,'month')]";
	public static final String CalendarPopup_SelectDayFP = "(.//div[contains(@style,'display: block;')]/descendant::div[@style='display: block;']/descendant::td[text()='";
	public static final String CalendarPopup_SelectDayLP = "' and not(@class='old day' or @class='new day')])";
	public static final String CalendarPopup_SelectHourFP = ".//div[@style='display: block;']/descendant::span[text()='";
	public static final String CalendarPopup_SelectHourLP = ":00' and contains(@class,'hour')]";
	public static final String CalendarPopup_SelectMinuteFP = ".//div[@style='display: block;']/descendant::span[text()='";
	public static final String CalendarPopup_SelectMinuteLP = "' and contains(@class,'minute')]";

	//Industrial Management

	public static final String IndustrialManagement = ".//a[text()='Industrial Training']";
	public static final String IndustrialManagementMorning = ".//a[text()='Industrial Attendance Morning']";
	public static final String CreateMorningButton = "(//*[@class='btn btn-success'])";
	public static final String attendancebox1 = "//*[@id='industrialattendance-0-ina_morning_attendance']";
	public static final String attendanceline1 = "//*[@id='industrialattendance-0-ina_remarks']";
	public static final String attendancebox3 = "//*[@id='industrialattendance-2-ina_morning_attendance']";
	public static final String attendanceline3 = "//*[@id='industrialattendance-2-ina_remarks']";
	public static final String attendancebox5 = "//*[@id='industrialattendance-4-ina_morning_attendance']";
	public static final String attendanceline5 = "//*[@id='industrialattendance-4-ina_remarks']";
	public static final String GoToIndustry = "(//*[@class='glyphicon glyphicon-ok'])[1]";
	public static final String SuccessMessageMorning = "(//*[@class='alert alert-success'])";
	public static final String CreateIndustrialMorningSuccessMessageText = "Created .* successfully";
	
	public static final String EveningRecord = "(//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String eveningattendancebox1 = "//*[@id='industrialattendance-0-ina_evening_attendance']";
	public static final String salarybox1 = "//*[@id='industrialattendance-0-ina_salary_approved']";
	public static final String eveningattendanceline1 = "//*[@id='industrialattendance-0-ina_remarks']";
	public static final String eveningattendancebox5 = "//*[@id='industrialattendance-3-ina_evening_attendance']";
	public static final String salarybox5 = "//*[@id='industrialattendance-3-ina_salary_approved']";
	public static final String eveningattendanceline5 = "//*[@id='industrialattendance-3-ina_remarks']";
	public static final String CreateEveningButton = "(//*[@class='btn btn-primary'])";
	public static final String SuccessMessageEvening = "(//*[@class='alert alert-success'])";
	public static final String IndustrialManagementEvening = ".//a[text()='Industrial Attendance Evening']";
	public static final String CreateIndustrialEveningSuccessMessageText = "Saved .* successfully";
	
	public static final String CreateWage = "(//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String wagesduration = "//*[@id='industrialwages-inw_duration']";
	public static final String wagesdailyrate = ".//*[@id='industrialwages-inw_daily_rate']";
	public static final String wagesSavings = ".//*[@id='industrialwages-inw_savings']";
	public static final String UpdateWages = "(//*[@class='btn btn-primary'])";
	public static final String SuccessMessageWages = "(//*[@class='alert alert-success'])";
	public static final String CreateWagesSuccessMessageText = "Saved .* successfully";
	public static final String IndustrialWages = ".//a[text()='Wages']";
	
	public static final String TrainingRecord = "(//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String SuccessMessageTraining = "(//*[@class='alert alert-success'])";
	public static final String industrialtrainingperformances = ".//a[text()='Industrial Daily Performances']";
	public static final String Addtrainingitem1 = "(.//*[@class='btn btn-success glyphicon glyphicon-plus'])[1]";
	public static final String Addtrainingitem2 = "(.//*[@class='btn btn-success glyphicon glyphicon-plus'])[2]";
	public static final String Addtrainingitem3 = "(.//*[@class='btn btn-success glyphicon glyphicon-plus'])[3]";
	public static final String industrialproduct = "(.//input[contains(@id,'-idp_product_name')])";
	public static final String noofpieces = "(.//input[contains(@id,'-idp_quantity')])";
	public static final String industrialworkpromotions = ".//a[text()='Industrial Work Promotions']";
	public static final String industrialgrade = "(.//select[contains(@id,'-iwp_grade_id')])";
	public static final String industrialtradedivisions = "//a[text()='Industrial Trade Divisions']";
	public static final String industrytype = "(.//select[contains(@id,'-itd_industry_type_id')])";
	public static final String tradedivision = "(.//select[contains(@id,'-itd_trade_division_id')])";
	public static final String IndustrialTraining = ".//a[text()='Industrial Training Add/Update']";
	public static final String IndustrialTrainingTable1 = "//*[@id='industrial_daily_performance_grid']/tbody";
	public static final String IndustrialTrainingTable2 = "//*[@id='industrial_work_promotion_grid']/tbody";
	public static final String IndustrialTrainingTable3 = "//*[@id='industrial_trade_division_grid']/tbody";
	public static final String IndustrialPerformanceDate = "(.//input[contains(@id,'-idp_date')])";
	public static final String IndustrialPromotionDate = "(.//input[contains(@id,'-iwp_date')])";
	public static final String IndustrialTradeDate = "(.//input[contains(@id,'-itd_date')])";
	public static final String CreateIndustrialTrainingSuccessMessageText = "Saved .* successfully";
	
	
	
	
	//Movement Management
	
	
	public static final String MovementOutCreate = "(.//*[@class='btn btn-success'])";
	public static final String CreateMovementOut = "(.//*[@class='glyphicon glyphicon-user'])[1]";
	public static final String TopMenu_MovementLink = "//a[contains(text(),'Movement Management')]";
	public static final String TopMenu_MovementOutLink = "//a[contains(text(),'Movement Out Add/Update')]";
	public static final String MovementAdmissionId = "//*[@id='w1']/table/tbody/tr[1]/td[2]";
	public static final String CreateMovementOutButton = "(.//*[@class='btn btn-success'])";
	public static final String MovementOutSuccessMessage = ".//*[@class='alert alert-success']";
	public static final String CreateMovementOut_SuccessMessageText = "Created .* successfully";
	public static final String MovementAdmissionIdSearch = "(.//*[@class='form-control'])[1]";
	public static final String LocationFrom = "//*[@id='movement-mov_location_from_id']";
	public static final String LocationTo = "//*[@id='movement-mov_location_to_id']";
	public static final String AdmisssionIdAuthoriseSearch = "//*[@id='w0-filters']/td[2]/input";
	public static final String AuthoriseMovementOut = "(//*[@class='glyphicon glyphicon-ok'])[1]";
	public static final String TopMenu_MovementOutAuthorizeLink = "//a[contains(text(),'Movement Out Authorize')]";
	public static final String CreateMovementOutAuthorizeButton = "(.//*[@class='btn btn-primary'])";
	public static final String MovementOutAuthorizeSuccessMessage = ".//*[@class='alert alert-success']";
	public static final String AuthorizeMovement_SuccessMessageText = "Saved .* successfully";
	public static final String MovementinCreate = "(.//*[@class='glyphicon glyphicon-pencil'])[1]";
	public static final String CreateMovementInButton = "(.//*[@class='btn btn-primary'])";
	public static final String MovementInSuccessMessage = "//*[@class='alert alert-success']";
	public static final String MovementIn_SuccessMessageText = "Saved .* successfully";
	public static final String TopMenu_MovementInLink = "//a[contains(text(),'Movement In Add/Update')]";
	public static final String MovementInDate = "//*[@id='movement-mov_in_time']";
	public static final String TopMenu_MovementInAuthorizeLink = "//a[contains(text(),'Movement In Authorize')]";
	public static final String AuthorizeMovementIn_SuccessMessageText = "Saved .* successfully";
	public static final String MovementOutDate = "//*[@id='movement-mov_out_time']";
	public static String admissionid="T/10362/2015";



	
	
	/*public static final String RecipeCountitem = "(.//select[contains(@id, '-red_kitchen_item_id')])";
	public static final String RecipeCountquantity = "(.//input[contains(@id, '-red_quantity')])";*/









}
