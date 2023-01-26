package com.herokuapp.theinternet.tests.checkboxestests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTests extends TestUtilities {

    @Test
    public void selectTwoCheckBoxesTest(){
        log.info("Starting selectTwoCheckBoxesTest");

        // Open page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // Click on Checkboxes link
        CheckboxesPage checkboxes = welcomePage.clickCheckboxesLink();

        // Select all Checkboxes
        checkboxes.selectAllCheckboxes();

        // Verify all Checkboxes are checked
        Assert.assertTrue(checkboxes.areAllCheckboxesChecked(), "Not all checkboxes are checked");
    }
}
