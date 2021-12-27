package com.bongoBD.qa.pages;

import com.bongoBD.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ContentPage extends BaseClass {


    private String CONTENT_TITLE = "//h5[text()='Shapod']"; //xpath of Content Title
    private String SKIP_AD = "//div[contains(text(),'Skip Ad')]"; //xpath of Skip ad button
    private String FORWARD_BUTTON = "//button[contains(@class,'forward_button')]"; //xpath of forward button
    private String VOLUME_BUTTON = "//button[@title='Mute']"; //xpath of volume button
    private String PROGRESS_BAR = "//div[contains(@class,'vjs-play-progress')]"; //xpath of progress bar


    //Returning boolean if the content title is displayed

    public boolean verifyContent() {
        System.out.println("Verifying Page");
        WebElement title = driver.findElement(By.xpath(CONTENT_TITLE));
        return title.isDisplayed();
    }


    //Can interact with all the video elements with this method
    public void interactingVideo() throws InterruptedException {

        WebElement slider = driver.findElement(By.xpath(PROGRESS_BAR));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 400, 0).build().perform();

        WebElement volumeBtn = driver.findElement(By.xpath(VOLUME_BUTTON));
        volumeBtn.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        volumeBtn.sendKeys(Keys.ARROW_UP);

    }

}
