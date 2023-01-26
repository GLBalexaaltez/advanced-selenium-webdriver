package com.herokuapp.theinternet.pages;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertsPage extends BasePageObject {

    private By clickForJsAlertLocator = By.xpath("//button[text()='Click for JS Alert']");
    private By clickForJsConfirmLocator = By.xpath("//button[text()='Click for JS Confirm']");
    private By clickForJsPromptLocator = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultsLocator = By.id("result");


    public JavascriptAlertsPage(WebDriver driver, Logger log){
        super(driver, log);
    }

    public void openJSAlert(){
        log.info("Clicking JS Alert");
        click(clickForJsAlertLocator);
    }

    public void openJSConfirm(){
        log.info("Clicking JS Confirm");
        click(clickForJsConfirmLocator);
    }

    public void openJSPrompt(){
        log.info("Clicking JS Prompt");
        click(clickForJsPromptLocator);
    }

    public String getAlertText(){
        Alert alert = switchToAlert();
        String alertText = alert.getText();
        log.info("Alert says: " + alertText);
        return alertText;
    }

    public void acceptAlert(){
        log.info("Switch to alert and clicking ok");
        Alert alert = switchToAlert();
        alert.accept();
    }

    public void dismissAlert(){
        log.info("Switch to alert and clicking cancel");
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public void typeTextIntoVoid(String text){
        log.info("Type text into the Alert and click ok");
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    public String getResultText(){
        String result = find(resultsLocator).getText();
        log.info("Result text: " + result);
        return result;
    }
}
