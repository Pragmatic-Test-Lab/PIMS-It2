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
	public static final String TopMenu_PIMSTopLink = "//a[text()='PIMS']";
	public static final String TopMenu_LogOut = "//a[contains(text(),'Logout')]";

	//Iteration 2 Pages
	//


	//Meal Management Page 

	public static final String DemandOrderAdd = "//*[text()='Demand Order Add/Update']";
	public static final String TransactionManagement = ".//a[text()='Transaction Management ']";
	public static final String MealManagement = ".//a[text()='Meal Management']";
	public static final String DemandOrder = ".//a[text()='Demand Order']";
	public static final String CreateDemand = ".//a[text()='Create Demand Order']";
	public static final String CreateDemandHeader="//*[@class='stock-tranaction-header-create']/h1";
	public static final String CreateDemandPageHeader="Create Demand Order";

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
