package com.ptl.PIMS.Pages.Iteration1;

import com.ptl.PIMS.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by PTL_SEC_PC06 on 3/24/2016.
 */
public class RegPage {

    //Authorize Registration Page
    @FindBy(xpath = Constants.registerButton)
    WebElement Registration;



    @FindBy(xpath = Constants.Registration_CaseDetail_AddNew)
    WebElement AddNewCase;

    WebDriver driver;

    public RegPage(WebDriver dr) {
        driver = dr;
    }

    public RegInmatePage registerInmate(){
        Registration.click();

        RegInmatePage allocateLocationInmateSelect = PageFactory
                .initElements(driver, RegInmatePage.class);
        return allocateLocationInmateSelect;
    }





    private int initialRowCount(WebElement element) {
        List<WebElement> rows = element.findElements(By.tagName("tr"));

        int size = rows.size();
        return size;

    }
}
