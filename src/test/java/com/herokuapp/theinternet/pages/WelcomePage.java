package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By jsAlertsLocator = By.linkText("JavaScript Alerts");
    private By multipleWindowsLocator = By.linkText("Multiple Windows");
    private By editorLocator = By.linkText("WYSIWYG Editor");
    private By keyPressLocator = By.linkText("Key Presses");
    private By fileUploadLocator = By.linkText("File Upload");
    private By dragAndDropLocator = By.linkText("Drag and Drop");
    private By hoverOverLocator = By.linkText("Hovers");
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

    public KeyPressesPage clickKeyPressesLink(){
        log.info("Clicking Key Presses link on Welcome Page");
        click(keyPressLocator);
        return new KeyPressesPage(driver, log);
    }

    public FileUploadPage clickFileUploadLink(){
        log.info("Clicking File Upload link on Welcome Page");
        click(fileUploadLocator);
        return new FileUploadPage(driver, log);
    }

    public DragAndDropPage clickDragAndDropLink(){
        log.info("Clicking Drag and Drop link on Welcome Page");
        click(dragAndDropLocator);
        return new DragAndDropPage(driver, log);
    }

    public HoverOverPage clickHoverOverLink(){
        log.info("Clicking Hover Over link on Welcome Page");
        click(hoverOverLocator);
        return new HoverOverPage(driver, log);
    }

    // SCROLL COMMANDS
    // window.scrollBy(x, y); Scroll by a specific amount of pixels
    // window.scrollTo(x, y); Scroll to a specific location of the page
    // window.scrollBy(0, document.body.scrollHeight); Scroll to bottom of the page
    // window.scrollBy(0, 0); Scroll to top of the page
    // arguments[0]scrollToView(); Scroll to specific element
    public void scrollToBottom(){
        log.info("Scrolling to the bottom of the page");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
