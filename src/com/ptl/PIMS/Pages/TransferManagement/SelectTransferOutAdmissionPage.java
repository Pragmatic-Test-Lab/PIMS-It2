package com.ptl.PIMS.Pages.TransferManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptl.PIMS.Pages.SelectInmatePage;
import com.ptl.PIMS.Pages.MovementManagement.CreateMovementOutPage;
import com.ptl.PIMS.util.Constants;

public class SelectTransferOutAdmissionPage extends SelectInmatePage{

	
	
	@FindBy(xpath = Constants.CreateMovementOut)
	WebElement firstInmate;
	
	public SelectTransferOutAdmissionPage(WebDriver dr){
		driver = dr;
	}
	
	public CreateTransferOutPage GoToTransferOutPage(){
				
		firstInmate.click();
		CreateTransferOutPage createtransferout = PageFactory.initElements(driver, CreateTransferOutPage.class);
		return createtransferout;	
	}
	
	

}
