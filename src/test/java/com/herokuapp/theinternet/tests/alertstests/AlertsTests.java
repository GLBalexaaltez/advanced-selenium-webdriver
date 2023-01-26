package com.herokuapp.theinternet.tests.alertstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JavascriptAlertsPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertsTests extends TestUtilities {

    @Parameters({ "expectedAlertMessage", "expectedResultMessage" })
    @Test
    public void jsAlertTest(String expectedAlertMessage, String expectedResultMessage){
        log.info("Starting jsAlertTest");

        // OPENING HOME PAGE
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // OPENING JAVASCRIPT ALERTS PAGE
        JavascriptAlertsPage alertsPage = welcomePage.clickJavascriptAlertsLink();

        // CLICKING JAVASCRIPT ALERT
        alertsPage.openJSAlert();

        // STORING ALERT TEXT
        String actualAlertMessage = alertsPage.getAlertText();

        // CLICKING ACCEPT IN ALERT
        alertsPage.acceptAlert();

        // STORING RESULTS TEXT
        String results = alertsPage.getResultText();

        // ASSERTIONS
        Assert.assertTrue(actualAlertMessage.equals(expectedAlertMessage));
        Assert.assertTrue(results.equals(expectedResultMessage));

        log.info("Finishing jsAlertTest");
    }

    @Test
    public void jsConfirmTest(){

    }

    @Test
    public void jsPromptTest(){

    }
}
