package com.herokuapp.theinternet.tests.draganddrop;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DragAndDropPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestUtilities {
    @Test
    public void dragAtoBTest(){

        log.info("Starting dragAtoBTest");

        // Open page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        DragAndDropPage dragAndDropPage = welcomePage.clickDragAndDropLink();

        dragAndDropPage.dragAtoB();

        String columnAText = dragAndDropPage.getColumnAText();
        Assert.assertTrue(columnAText.equals("B"), "Column A Header should be 'B'");

        String columnBText = dragAndDropPage.getColumnBText();
        Assert.assertTrue(columnBText.equals("A"), "Column B Header should be 'A'");
    }

}
