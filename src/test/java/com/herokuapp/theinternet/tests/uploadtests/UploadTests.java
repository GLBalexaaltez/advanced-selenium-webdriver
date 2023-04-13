package com.herokuapp.theinternet.tests.uploadtests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploadPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends TestUtilities {
    @Test(dataProvider = "files")
    public void fileUploadTest(int testNumber, String fileName){
        log.info("Starting fileUploadTest #" + testNumber + " for " + fileName);

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        FileUploadPage fileUploadPage = welcomePage.clickFileUploadLink();

        fileUploadPage.selectFile(fileName);

        fileUploadPage.pushUploadButton();

        String fileNames = fileUploadPage.getUploadedFilesNames();

        Assert.assertTrue(fileNames.contains(fileName), "The file (" + fileName + ") is not one of the uploaded (" + fileNames + ")");
    }
}
