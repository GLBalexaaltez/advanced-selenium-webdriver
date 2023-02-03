package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By jsAlertsLocator = By.linkText("JavaScript Alerts");
    private By multipleWindowsLocator = By.linkText("Multiple Windows");

    private By editorLocator = By.linkText("WYSIWYG Editor");

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage(){
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened");
    }

    public LoginPage clickFormAuthenticationLink(){
        log.info("Clicking Form Authentication link on Welcome page");
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver, log);
    }

    public CheckboxesPage clickCheckboxesLink(){
        log.info("Clicking Checkboxes link on Welcome Page");
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver, log);
    }
    public DropdownPage clickDropdownLink(){
        log.info("Clicking Dropdown link on Welcome Page");
        click(dropdownLinkLocator);
        return new DropdownPage(driver, log);
    }

    public JavascriptAlertsPage clickJavascriptAlertsLink(){
        log.info("Clicking Javascript Alerts link on Welcome page");
        click(jsAlertsLocator);
        return new JavascriptAlertsPage(driver, log);
    }

    public WindowsPage clickMultipleWindowsLink(){
        log.info("Clicking Multiple Windows link on Welcome page");
        click(multipleWindowsLocator);
        return new WindowsPage(driver, log);
    }

    public EditorPage clickEditorLink(){
        log.info("Clicking Editor link on Welcome Page");
        click(editorLocator);
        return new EditorPage(driver, log);
    }
}
