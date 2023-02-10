package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage extends BasePageObject{

    private By choseFileFieldLocator = By.id("file-upload");
    private By uploadButtonLocator = By.id("file-submit");
    private By uploadedFilesLocator = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void pushUploadButton(){
        log.info("Clicking on upload button");
        click(uploadButtonLocator);
    }
    public void selectFile(String fileName){
        log.info("Selecting '" + fileName + "' file from Files folder");
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "files" + File.separator  + fileName;
        log.info("Path: " + filePath);
        type(filePath, choseFileFieldLocator);
        log.info("File selected");
    }

    public String getUploadedFilesNames(){
        String names = find(uploadedFilesLocator).getText();
        log.info("Uploaded files: " + names);
        return names;
    }
}
