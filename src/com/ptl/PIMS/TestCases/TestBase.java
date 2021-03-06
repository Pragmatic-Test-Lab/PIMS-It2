package com.ptl.PIMS.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.ptl.PIMS.Pages.Iteration1.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import com.ptl.PIMS.Pages.HomePage;
import com.ptl.PIMS.Pages.LoginPage;
import com.ptl.PIMS.Pages.TopMenu;
import com.ptl.PIMS.util.Constants;
import com.ptl.PIMS.util.ReadXLS;
import com.ptl.PIMS.util.TestUtil;


public class TestBase{

	public static Logger APPLICATION_LOGS = null;
	public static Properties CONFIG = null;
	public static WebDriver driver = null;
	public static TopMenu topMenu = null;
	public static int tempNum = 1;
	protected ReadXLS xls = new ReadXLS(System.getProperty("user.dir")
			+ "\\src\\com\\ptl\\data\\TestData.xlsx");
	
	public static boolean isLoggedIn = false;
	
	//inmate data
	public static String registrationNo = "";
	public static String appealRegistrationNo = "", visitRegistrationNo = "";
	public static String progCode = "";
	public static String mealId = "";

	@BeforeSuite
	public void initConfiguration() {

		if (CONFIG == null) {
			// initialize loggin & properties files
			APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");

			// initialize Properties file
			CONFIG = new Properties();
			FileInputStream fs;
			try {
				fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
				CONFIG.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		

	}

	@BeforeSuite
	public void initDriver() {
		if (driver == null) {
			if (CONFIG.getProperty("browser").equalsIgnoreCase("firefox17")) {
				/*
				 * System.setProperty("webdriver.firefox.bin",
				 * "C:\\Program Files (x86)\\Mozilla Firefox17\\firefox.exe");
				 */
				ProfilesIni allProfiles = new ProfilesIni();
				FirefoxProfile profile17 = allProfiles.getProfile("Firefox17");
				FirefoxBinary binary17 = new FirefoxBinary(
						new File(
								"C:\\Program Files (x86)\\Mozilla Firefox17\\firefox.exe"));
				driver = new FirefoxDriver(binary17, profile17);

			} else if (CONFIG.getProperty("browser")
					.equalsIgnoreCase("firefox")) {
				/*
				 * System.setProperty("webdriver.firefox.bin",
				 * "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
				 */

				ProfilesIni allProfiles = new ProfilesIni();
				FirefoxProfile profile = allProfiles.getProfile("Selenium");
				// FirefoxBinary binary = new FirefoxBinary(new
				// File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
				driver = new FirefoxDriver(profile);
				// driver = new FirefoxDriver();

			} else if (CONFIG.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")
								+ "//drivers//chromedriver.exe");
				DesiredCapabilities capability = DesiredCapabilities.chrome();
				capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

				// ChromeOptions options = new ChromeOptions();
				// options.setBinary(new
				// File("C://Program Files (x86)//Google//Chrome//Application//chrome.exe"));
				driver = new ChromeDriver(capability);
				// driver = new ChromeDriver();
			} else if (CONFIG.getProperty("browser").equalsIgnoreCase("IE")) {
				/*
				 * File file = new File("C:\\IEDriverServer.exe");
				 * System.setProperty("webdriver.ie.driver",
				 * file.getAbsolutePath());
				 */

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")
								+ "//drivers//IEDriverServer.exe");
				DesiredCapabilities caps = DesiredCapabilities
						.internetExplorer();
				caps.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				driver = new InternetExplorerDriver(caps);

				// System.setProperty("webdriver.ie.driver",
				// System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
				// System.setProperty("webdriver.ie.driver",
				// "E:\\Selenium\\workspace\\IEDriverServer.exe");
				// driver = new InternetExplorerDriver();
			}
			APPLICATION_LOGS.debug("Browser initialized");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	//@AfterSuite
	public void quitDriver() {

		driver.quit();
		driver = null;
	}

	public TopMenu getTopMenu() {
		if (topMenu == null) {
			topMenu = PageFactory.initElements(driver, TopMenu.class);
		}
		return topMenu;
	}
	
	public HomePage loginToApplication(){
		
		HomePage homePage;
				
		if (!isLoggedIn) {
			APPLICATION_LOGS.debug("Login into system");
			driver.get(CONFIG.getProperty("BASE_URL"));
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

			homePage = lp
					.doLogin(CONFIG.getProperty("USER_NAME"), CONFIG.getProperty("PASSWORD"));

			Assert.assertTrue(homePage.IsMainPageImageShown(),
					"Homepage Image not found!");
			
			APPLICATION_LOGS.debug("Successfully logged in");
			isLoggedIn = true;
		}
		else
			homePage = getTopMenu().gotoHomePage();
		
		return homePage;

	}
	
	public HomePage loginAsWataraka(){
		
		HomePage homePage;
		LoginPage lp;
				
		if (!isLoggedIn) {
			driver.get(CONFIG.getProperty("BASE_URL"));
			lp = PageFactory.initElements(driver, LoginPage.class);
		}
		else{
			lp = getTopMenu().doLogout();
		}
		
		homePage = lp.doLogin("admin_wataraka", "test$123");
		isLoggedIn = true;	
		
		return homePage;
	}

public void waitForPageReload(){
        WebDriverWait wait = new WebDriverWait(driver, Constants.PAGELOAD_TIMEOUT);        
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[not (.='')]"))));
}

	public void assertTrue(boolean condition, String message){		

		if(!condition){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("c:\\Selenium-TestRun\\Failure Screenshots\\Iteration 2\\" 
							+ (new SimpleDateFormat("yyyy-MM-dd\\HH-mm-ss").format(Calendar.getInstance().getTime())) + " - " + message + ".png"));
		} catch (IOException e1) {}		
		}
		Assert.assertTrue(condition, message);
		
	}
	

	public void createInmateForAppeal(String courts, String caseNos, String sentenceDate, String convictiondate,String offensecode,
			String Offences,  String Sentences, String Days, String Months, String Years, String Fines) {
		
		//Authorize Admission with court details
		AuthorizeAdmissionInmatePage authorizeInmateSelect = getTopMenu().gotoAuthorizeAdmissionPage();
		AuthorizeAdmissionPage authorizePage = authorizeInmateSelect.clickFirstInmate();
		
		authorizePage.fillCase(courts, caseNos, sentenceDate, convictiondate);
		
		authorizePage.changeInmateCategory("Convicted");
		authorizePage.changeAdmissionDate(TestUtil.getTodaysDate());
		try {   Thread.sleep(2000);		} catch (InterruptedException e) {e.printStackTrace();}
		appealRegistrationNo = authorizePage.getRegistrationNumber();	    
    
	    authorizeInmateSelect = authorizePage.doAuthorizeAdmission();		
	    assertTrue(authorizeInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Admission Page.");


		//registration confirm
		RegInmatePage reginmateselect = getTopMenu().gotoRegistrationPage();
		reginmateselect.doSearch(appealRegistrationNo, "", "");
				RegPage regPage = reginmateselect.clickFirstInmate();
		waitForPageReload();
		reginmateselect= regPage.registerInmate();
		assertTrue(reginmateselect.successMessageAvaiable(), "Could not find Success Message element in Admission Page.");
		
		//Authorize Registration with sentence details
		AuthorizeRegInmatePage authorizeRegInmateSelect = getTopMenu().gotoAuthorizeRegistrationPage();
		authorizeRegInmateSelect.doSearch(appealRegistrationNo, "", "");
		AuthorizeRegPage authorizeRegPage = authorizeRegInmateSelect.clickFirstInmate();
		
		authorizeRegPage.addcaseDetailsOfInmate(courts, offensecode, Offences,  Sentences, Days, Months, Years, Fines);
		
		authorizeRegInmateSelect = authorizeRegPage.authorizeInmate();		
    	assertTrue(authorizeRegInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Registration Page.");
	}
	
	public void createInmateForVisit() {
		
		//Authorize Admission with court details
		AuthorizeAdmissionInmatePage authorizeInmateSelect = getTopMenu().gotoAuthorizeAdmissionPage();
		AuthorizeAdmissionPage authorizePage = authorizeInmateSelect.clickFirstInmate();
		
		authorizePage.changeInmateCategory("Convicted");
		authorizePage.changeAdmissionDate(TestUtil.getTodaysDate());
		
		visitRegistrationNo = authorizePage.getRegistrationNumber(); 
		authorizeInmateSelect = authorizePage.doAuthorizeAdmission();
	
	    assertTrue(authorizeInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Admission Page.");
	    //	    
		
		//Authorize Registration with sentence details
		AuthorizeRegInmatePage authorizeRegInmateSelect = getTopMenu().gotoAuthorizeRegistrationPage();
		authorizeRegInmateSelect.doSearch(visitRegistrationNo, "", "");
		
		AuthorizeRegPage authorizeRegPage = authorizeRegInmateSelect.clickFirstInmate();		
		authorizeRegInmateSelect = authorizeRegPage.authorizeInmate();
		
    	assertTrue(authorizeRegInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Registration Page.");
	}
	
	public String createInmateForTransfer() {
		
		//Authorize Admission with court details
		AuthorizeAdmissionInmatePage authorizeInmateSelect = getTopMenu().gotoAuthorizeAdmissionPage();
		AuthorizeAdmissionPage authorizePage = authorizeInmateSelect.clickFirstInmate();
		
		authorizePage.changeInmateCategory("Convicted");
		authorizePage.changeAdmissionDate(TestUtil.getTodaysDate());
		
		String transferRegistrationNo = authorizePage.getRegistrationNumber(); 
		authorizeInmateSelect = authorizePage.doAuthorizeAdmission();
	
	    assertTrue(authorizeInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Admission Page.");
	    //	    
		
		//Authorize Registration with sentence details
		AuthorizeRegInmatePage authorizeRegInmateSelect = getTopMenu().gotoAuthorizeRegistrationPage();
		authorizeRegInmateSelect.doSearch(transferRegistrationNo, "", "");
		
		AuthorizeRegPage authorizeRegPage = authorizeRegInmateSelect.clickFirstInmate();		
		authorizeRegInmateSelect = authorizeRegPage.authorizeInmate();
		
    	assertTrue(authorizeRegInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Registration Page.");
	
    	return transferRegistrationNo;
	}
	
	

}
