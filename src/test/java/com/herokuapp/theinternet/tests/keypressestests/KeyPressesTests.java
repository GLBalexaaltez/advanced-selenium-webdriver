package com.herokuapp.theinternet.tests.keypressestests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTests extends TestUtilities {
    @Test
    public void pressKeyTest(){
        log.info("Starting pressKeyTest");

        // Open KeyPressesPage
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();

        keyPressesPage.pressKey(Keys.ENTER);

        String result = keyPressesPage.getResultText();

        Assert.assertTrue(result.equals("You entered: ENTER"), "Result is not expected." +
                "\nShould be 'You entered: ENTER', but it is: " + result);
    }

    @Test
    public void pressKeyWithActionsTest(){
        log.info("Starting pressKeyWithActionsTest");

        // Open KeyPressesPage
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();

        keyPressesPage.pressKeyWithActions(Keys.SPACE);

        String result = keyPressesPage.getResultText();

        Assert.assertTrue(result.equals("You entered: SPACE"), "Result is not expected." +
                "\nShould be 'You entered: ENTER', but it is: " + result);
    }
}
