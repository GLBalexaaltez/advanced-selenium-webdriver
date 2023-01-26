package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

    private By userNameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By logInButtonLocator = By.tagName("button");
    private By unsuccessLogInMessage = By.id("flash-messages");

    public LoginPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public SecureAreaPage successLogIn(String username, String password){
        log.info("Executing LogIn with username: [" + username + "] and password: [" + password + "]");
        type(username, userNameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
        return new SecureAreaPage(driver, log);
    }

    public void unsuccessLogIn(String username, String password){
        log.info("Executing LogIn with username: [" + username + "] and password: [" + password + "]");
        type(username, userNameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
    }

    public String getUnsuccessMessageText(){
        return find(unsuccessLogInMessage).getText();
    }

    public void waitForErrorMessage(){
        waitForVisibilityOf(unsuccessLogInMessage, 5);
    }
}
