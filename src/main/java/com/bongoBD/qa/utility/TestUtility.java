package com.bongoBD.qa.utility;

import com.bongoBD.qa.base.BaseClass;


public class TestUtility extends BaseClass {

    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT = 30;

    public void switchToFrameByName(String frameName) {

        driver.switchTo().frame(frameName);
    }

    public void switchToFrameByIndex(int number) {

        driver.switchTo().frame(number);
    }

}
