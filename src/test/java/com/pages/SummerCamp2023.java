package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowsersUtils;

import java.time.Duration;

public class SummerCamp2023 {

    public SummerCamp2023(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }



    // elements
    private @FindBy(xpath = "//a[contains(text(),'Summer')]")
    WebElement SummerCampOption;


    private @FindBy(xpath = "//div[contains(text(),'Click Here for registration')]")
    WebElement registerButton;

    private @FindBy(xpath = "//h2//span[contains(text(),'open!')]")
    WebElement registerIsOpen;




               // ----> Methods

    public String clickSummerCamp2023(WebDriver driver) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(SummerCampOption)).click();
        //
        Thread.sleep(2000);
       return  driver.getCurrentUrl();
    }



    public void clickRegisterButton(WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(registerButton));
        BrowsersUtils.clickWithJS(driver,registerButton);   // clicked withJS
    }


    public String validateRegisterIsOpen(WebDriver driver ){
         BrowsersUtils.scrollWithJS(driver,registerIsOpen);

      String actual=BrowsersUtils.getText(registerIsOpen);

         return actual;
    }



}
