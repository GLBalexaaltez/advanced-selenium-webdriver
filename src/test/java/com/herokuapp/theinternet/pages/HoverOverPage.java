package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HoverOverPage extends BasePageObject {

    private By avatarLocator = By.xpath("//img[@alt='User Avatar']");
    private By viewProfileLinkLocator = By.xpath(".//a[contains(text(),'View profile')]");
    public HoverOverPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openUserProfile(int i){
        List<WebElement> avatars = findAll(avatarLocator);
        WebElement specifiedUserAvatar = avatars.get(i - 1);
        hoverOverElement(specifiedUserAvatar);
        specifiedUserAvatar.findElement(viewProfileLinkLocator).click();
    }
}
