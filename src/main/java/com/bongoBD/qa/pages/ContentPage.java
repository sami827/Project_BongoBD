package com.bongoBD.qa.pages;

import com.bongoBD.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ContentPage extends BaseClass {

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    private String CONTENT_TITLE = "//h5[text()='Radhuni Celebrates the Taste of Amar Bangladesh']"; //xpath of Content Title



    //Returning boolean if the content title is displayed

    public boolean verifyContent() {
        System.out.println("Verifying Page");
        WebElement title = driver.findElement(By.xpath(CONTENT_TITLE));
        return title.isDisplayed();
    }


    public void scrollDown() {
        jse.executeScript("window.scrollBy(0,1000)");
    }

    public void pauseVideo() throws InterruptedException {
        jse.executeScript("jwplayer().pause");
        Thread.sleep(15000);
    }


}
