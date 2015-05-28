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







	//

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
	public static final String AddNewKitchenItem = "//*[@class='btn btn-success glyphicon glyphicon-plus']";
	public static final String Kitchenitemline ="//*[@id='stocktranactiondetails-1-std_kitchen_item_id']";
	public static final String quantityline = "//*[@id='stocktranactiondetails-1-std_quantity']";




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




	//



	//
	//

	// Inmate Search Pages
	public static final String SelectInmate_Header = ".//*[@class='breadcrumb']/following::h1";
	public static final String InmateSearch_RegNoSearchField = ".//*[contains(@name,'Search[adm_registration_no]')]";
	public static final String InmateSearch_BiometricSearchField = ".//*[contains(@name,'Search[adm_biometric_id]')]";
	public static final String InmateSearch_NameSearchField = ".//*[contains(@name,'Search[adm_name_as_in_warrant]')]";
	public static final String InmateSearch_TableFirstInmate = "(.//*[contains(@class, 'glyphicon')]//parent::a)[1]";
	public static final String InmateSearchPage_SuccessMessage = ".//div[@class='alert alert-success']";
	public static final String InmateSearchPage_NoSearchResultsFound = ".//*[text()='No results found.']";


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














}
