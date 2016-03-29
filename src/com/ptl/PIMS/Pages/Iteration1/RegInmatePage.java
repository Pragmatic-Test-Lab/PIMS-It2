package com.ptl.PIMS.Pages.Iteration1;

import com.ptl.PIMS.Pages.SelectInmatePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PTL_SEC_PC06 on 3/24/2016.
 */
public class RegInmatePage extends SelectInmatePage {

    public RegInmatePage(WebDriver dr) {
        driver = dr;
    }

    // clicks the first inmate in Table
    public RegPage clickFirstInmate() {

       clickFirstRecord();

        RegPage allocateLocation = PageFactory.initElements(driver, RegPage.class);
        return allocateLocation;
    }



}
