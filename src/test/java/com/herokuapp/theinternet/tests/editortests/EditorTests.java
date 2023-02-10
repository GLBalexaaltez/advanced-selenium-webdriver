package com.herokuapp.theinternet.tests.editortests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditorTests extends TestUtilities {
    @Test
    public void defaultEditorValueTest(){
        log.info("Starting defaultEditorValueTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        welcomePage.scrollToBottom();

        EditorPage editorPage = welcomePage.clickEditorLink();

        String editorText = editorPage.getEditorText();

        Assert.assertTrue(editorText.equals("Your content goes here."),
                "Editor default text is not expected. It is: " + editorText);
    }
}
