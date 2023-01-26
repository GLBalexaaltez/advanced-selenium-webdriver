package com.herokuapp.theinternet.tests.windowstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import com.herokuapp.theinternet.pages.WindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTests extends TestUtilities {
    @Test
    public void newWindowTest(){
        log.info("Starting newWindowTest");

        // Open Main Page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // Click on MultipleWindows link
        WindowsPage windowsPage = welcomePage.clickMultipleWindowsLink();

        // Click "Click here" link to open new window
        windowsPage.openNewWindow();

        // Find and switch to new window page
        NewWindowPage newWindowPage = windowsPage.switchToNewWindowPage();

        // Assertion
        Assert.assertEquals(newWindowPage.getCurrentUrl(), newWindowPage.getPageUrl());
    }
}
