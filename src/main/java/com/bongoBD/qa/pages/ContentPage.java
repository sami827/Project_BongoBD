package com.bongoBD.qa.pages;

import com.bongoBD.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContentPage extends BaseClass {

    private String CONTENT_TITLE = "//h5[text()='Radhuni Celebrates the Taste of Amar Bangladesh']"; //xpath of Content Title
    


    //Returning boolean if the content title is displayed

    public boolean verifyContent() {
        System.out.println("Verifying Page");
        WebElement title = driver.findElement(By.xpath(CONTENT_TITLE));
        return title.isDisplayed();
    }





}
