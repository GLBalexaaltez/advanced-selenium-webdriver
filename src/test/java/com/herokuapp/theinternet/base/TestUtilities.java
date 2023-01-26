package com.herokuapp.theinternet.base;

public class TestUtilities extends BaseTest {

    protected void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
