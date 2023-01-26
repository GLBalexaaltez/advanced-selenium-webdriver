package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/secure";
    private By logOutButtonLocator = By.xpath("//a[@class='button secondary radius']");
    private By successLogInMessage = By.id("flash-messages");

    public SecureAreaPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    // Get current page URL.
    public String getPageUrl(){
        return pageUrl;
    }

    // Verification if the LogOut Button is visible.
    public boolean isLogOutButtonVisible(){
        return find(logOutButtonLocator).isDisplayed();
    }

    // Get success LogIn message.
    public String getSuccessMessageText(){
        return find(successLogInMessage).getText();
    }

    // Click in LogOut button.
    public LoginPage clickLogOutButton(){
        log.info("Clicking LogOut button on Secure Area Page");
        click(logOutButtonLocator);
        return new LoginPage(driver, log);
    }
}
