package com.bongoBD.qa.pages;

import com.bongoBD.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



public class ContentPage extends BaseClass {


    private String CONTENT_TITLE = "//h5[text()='Radhuni Celebrates the Taste of Amar Bangladesh']"; //xpath of Content Title
    private String SKIP_AD = "//div[contains(text(),'Skip Ad')]"; //xpath of Skip ad button
    private String FORWARD_BUTTON = "//button[contains(@class,'forward_button')]"; //xpath of forward button
    private String VOLUME_BUTTON = "//button[@title='Mute']"; //xpath of volume button


    //Returning boolean if the content title is displayed

    public boolean verifyContent() {
        System.out.println("Verifying Page");
        WebElement title = driver.findElement(By.xpath(CONTENT_TITLE));
        return title.isDisplayed();
    }

    public void interactingVideo() throws InterruptedException {
        WebElement volumeBtn = driver.findElement(By.xpath(VOLUME_BUTTON));
        volumeBtn.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        volumeBtn.sendKeys(Keys.ARROW_UP);

    }

}
