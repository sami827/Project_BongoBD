package com.bongoBD.qa.pages;

import com.bongoBD.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    private String PAGE_LOGO = "//img[@alt='primary Logo']"; //xpath of page logo
    private String CONTENT_SHAPOD = "//a[@href='/watch/HBQ9uTDTKUo']"; //xpath of SHAPOD content


    // Returning page title
    public String verifyTitle() {
        return driver.getTitle();
    }

    //Returning boolean if the log is displayed
    public boolean verifyLogo() {
        WebElement bongoLogo = driver.findElement(By.xpath(PAGE_LOGO));
        return bongoLogo.isDisplayed();
    }

    public ContentPage clickOnContent() {

        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
        WebElement amarBangladeshBtn = driver.findElement(By.xpath(CONTENT_SHAPOD));
        amarBangladeshBtn.click();

        return new ContentPage();
    }

}
