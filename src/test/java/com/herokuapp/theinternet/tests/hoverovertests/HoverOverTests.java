package com.herokuapp.theinternet.tests.hoverovertests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HoverOverPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOverTests extends TestUtilities {

    @Test
    public void user2ProfileTest(){

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        HoverOverPage hoverOverPage = welcomePage.clickHoverOverLink();

        hoverOverPage.openUserProfile(2);

        Assert.assertTrue(hoverOverPage.getCurrentUrl().contains("/users/2"), "Url of opened page is not expected Url");
    }
}
