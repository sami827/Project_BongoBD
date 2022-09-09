package com.qa.BongoBD.qa.testCases;

import com.bongoBD.qa.base.BaseClass;
import com.bongoBD.qa.pages.ContentPage;
import com.bongoBD.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ContentPageTest extends BaseClass {

    HomePage homePage;
    ContentPage contentPage;

    public ContentPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        contentPage = homePage.clickOnContent();
    }

    @Test
    public void interactingVideoElements() throws InterruptedException {

        //Verifying Content Page
        boolean flag = contentPage.verifyContent();
        Assert.assertTrue(flag);
        Thread.sleep(30000);

        //Interacting with video
        /*Please do note that if the commercial duration is more than 20 seconds,
        you've to press the "Skip Ad" button manually to allow the functionalities to perform the way it's intended*/
        contentPage.interactingVideo();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        // Just comment out the below statement if you don't want the content to stop
        driver.quit();
    }

}
