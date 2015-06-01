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

	//
	
	//Rehabilitation Management Page
	
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
	public static final String CalendarPopup_MonthYearText = "(.//th[@class='datepicker-switch'])[1]";
	public static final String CalendarPopup_YearText_FirstPart = ".//span[text()='";
	public static final String CalendarPopup_YearText_LastPart = "' and @class='year']";
	public static final String CalendarPopup_MonthText_FirstPart = "(.//span[text()='";
	public static final String CalendarPopup_MonthText_LastPart = "' and @class='month'])";
	public static final String CalendarPopup_YearText = "(.//th[@class='datepicker-switch'])[2]";
	public static final String CalendarPopup_DateText_FirstPart = "(.//td[contains(@class,'day')][text()='";
	public static final String CalendarPopup_DateText_LastPart = "'])";
	public static final String CalendarPopup_HourText_FirstPart = "//*[text()='";
	public static final String CalendarPopup_HourText_LastPart = "']";
	public static final String CalendarPopup_MinuteText_FirstPart = "//*[text()='";
	public static final String CalendarPopup_MinuteText_LastPart = "']";
	public static final String GoodReceivedAuthorize = null;

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
	
	








}
