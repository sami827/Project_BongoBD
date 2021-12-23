package com.bongoBD.qa.pages;

import com.bongoBD.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

    private String PAGE_LOGO = "//img[@alt='primary Logo']"; //xpath of page logo
    private String CONTENT_AMAR_BANGLADESH = "//a[@href='/watch/8z65glKqpXy']"; //xpath of amar bangladesh content



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
        WebElement amarBangladeshBtn = driver.findElement(By.xpath(CONTENT_AMAR_BANGLADESH));
        amarBangladeshBtn.click();

        return new ContentPage();
    }




}
