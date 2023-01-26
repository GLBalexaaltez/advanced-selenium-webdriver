package com.herokuapp.theinternet.tests.dropdowntests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends TestUtilities {

    @Test
    public void optionTwoTest(){
        log.info("Starting optionTwoTest");

        // Open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // Click on dropdown link
        DropdownPage dropdownPage = welcomePage.clickDropdownLink();

        // Select option 2
        dropdownPage.selectOption(2);

        // Verify option 2 is selected
        String selectedOption = dropdownPage.getSelectedOption();
        Assert.assertTrue(selectedOption.equals("Option 2"), "Option 2 is not selected, instead selected " + selectedOption);
    }
}
