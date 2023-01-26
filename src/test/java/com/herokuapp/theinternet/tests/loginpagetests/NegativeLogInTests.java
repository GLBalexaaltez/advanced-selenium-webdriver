package com.herokuapp.theinternet.tests.loginpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeLogInTests extends TestUtilities {

	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)
	public void negativeTest(String username, String password, String expectedMessage) {
		log.info("Starting Negative Test");

		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		LoginPage loginPage = welcomePage.clickFormAuthenticationLink();
		loginPage.unsuccessLogIn(username, password);
		loginPage.waitForErrorMessage();

		// ASSERTION
		String actualMessage = loginPage.getUnsuccessMessageText();
		Assert.assertTrue(actualMessage.contains(expectedMessage),
				"actualMessage does not contain expectedMessage\nexpectedMessage: "
						+ expectedMessage + "\nactualMessage: " + actualMessage);
	}

}
