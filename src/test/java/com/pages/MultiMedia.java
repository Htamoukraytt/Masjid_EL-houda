package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowsersUtils;

import java.time.Duration;

public class MultiMedia {

     // constructor
    public MultiMedia(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }



    // ---> elements


    private @FindBy(xpath = "//a[.='MultiMedia']")
    WebElement MultiMediaOption;
    private @FindBy(xpath = "//iframe")    // Iframe
    WebElement  iframe;
    private @FindBy(xpath = "//a[contains(text(),'Senior Americans were told')]")
    WebElement mediaVideo;




        // Methods

    public void clickMultiMedia(WebDriver driver){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(MultiMediaOption));
        Actions actions=new Actions(driver);
        actions.click(MultiMediaOption).perform();
    }



     // validating Url of multimedia
     public String validateMultiMediaUrl(WebDriver driver) throws InterruptedException {
      Thread.sleep(2000);
         System.out.println(driver.getCurrentUrl());
      return driver.getCurrentUrl();
     }



     // validating textMessage

    public String validateMultiMediaText(WebDriver driver){

        driver.switchTo().frame(iframe);    // iframe
        BrowsersUtils.scrollWithJS(driver,mediaVideo);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(mediaVideo));
        return BrowsersUtils.getText(mediaVideo);
    }






}
