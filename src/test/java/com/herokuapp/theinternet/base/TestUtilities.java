package com.herokuapp.theinternet.base;

import org.testng.annotations.DataProvider;

public class TestUtilities extends BaseTest {

    protected void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name="files")
    protected static Object[][] files(){
        return new Object[][]{
                {1, "index.html"},
                {2, "Spiffo.png"},
                {3, "text.txt"}
        };
    }
}
