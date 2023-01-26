package com.herokuapp.theinternet.tests.loginpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PositiveLogInTests extends TestUtilities {

	@Parameters({"username", "password", "expectedMessage"})
	@Test(priority = 1)
	public void logInTest(String username, String password, String expectedMessage) {
		log.info("Starting LogIn test");

		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on Form Authentication link
		LoginPage loginPage = welcomePage.clickFormAuthenticationLink();

		// Enter username and password and click in LogIn button
		SecureAreaPage secureAreaPage = loginPage.successLogIn(username, password);

		// ASSERTIONS
		// New URL matches expected URL
		Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());

		// LogOut button is visible
		Assert.assertTrue(secureAreaPage.isLogOutButtonVisible(),"LogOut button is not visible.");

		// Successful LogIn message
		String actualMessage = secureAreaPage.getSuccessMessageText();
		Assert.assertTrue(actualMessage.contains(expectedMessage),
				"actualMessage does not contain expectedMessage\nexpectedMessage: "
						+ expectedMessage + "\nactualMessage: " + actualMessage);

	}
}
