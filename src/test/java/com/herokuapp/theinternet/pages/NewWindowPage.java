package com.herokuapp.theinternet.pages;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class NewWindowPage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/windows/new";

    public NewWindowPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getPageUrl(){
        return pageUrl;
    }
}
