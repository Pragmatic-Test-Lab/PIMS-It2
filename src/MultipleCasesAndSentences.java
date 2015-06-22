import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeAdmissionPage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeRegInmatePage;
import com.ptl.PIMS.Pages.Iteration1.AuthorizeRegPage;
import com.ptl.PIMS.TestCases.TestBase;
import com.ptl.PIMS.util.TestUtil;


public class MultipleCasesAndSentences extends TestBase{
	
	
	@Test(dataProvider = "getCaseSentenceData")
	public void createAppealTestData(Hashtable<String, String> data) {
		
		loginToApplication();
		
		/*Authorize Admission with court details
		AuthorizeAdmissionInmatePage authorizeInmateSelect = getTopMenu().gotoAuthorizeAdmissionPage();
		AuthorizeAdmissionPage authorizePage = authorizeInmateSelect.clickFirstInmate();
		
		authorizePage.fillMultipleCases(data.get("Court"), data.get("Case Prefix"), TestUtil.getTodaysDate(), TestUtil.getTodaysDate(),
				Integer.parseInt(data.get("no Of Cases")));
		authorizePage.changeInmateCategory("Convicted");
		authorizePage.changeAdmissionDate(TestUtil.getTodaysDate());
	    registrationNo = authorizePage.getRegistrationNumber();	    
    
	    authorizeInmateSelect = authorizePage.doAuthorizeAdmission();		
	    assertTrue(authorizeInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Admission Page.");
	    */	    
		
		registrationNo = "T/10438/2015";
		
		//Authorize Registration with sentence details
		AuthorizeRegInmatePage authorizeRegInmateSelect = getTopMenu().gotoAuthorizeRegistrationPage();
		authorizeRegInmateSelect.doSearch(registrationNo, "", "");
		AuthorizeRegPage authorizeRegPage = authorizeRegInmateSelect.clickFirstInmate();
		authorizeRegPage.addMultipleSentences(data.get("Case Prefix"), data.get("Common Offence"), data.get("Common Sentence"), data.get("Days"), 
				data.get("Months"), data.get("Years"), data.get("Fines"));
		authorizeRegInmateSelect = authorizeRegPage.authorizeInmate();
		
    	assertTrue(authorizeRegInmateSelect.successMessageAvaiable(), "Could not find Success Message element in Registration Page.");

	}
	
	@DataProvider
	public Object[][] getCaseSentenceData() {
		return TestUtil.getTestData("Remission Test", xls);
	}

}
