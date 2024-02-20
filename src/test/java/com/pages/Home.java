package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowsersUtils;

import java.time.Duration;

public class Home {

    // constructor
    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //elements
    private @FindBy(xpath = "//a[.='Home']")
    WebElement HomeOption;
    private @FindBy(xpath = "//a[.='Services']")
    WebElement ServicesOption;
    private @FindBy(xpath = "//a[.='MultiMedia']")
    WebElement MultiMediaOption;
    private @FindBy(xpath = "//a[.='About']")
    WebElement AboutOption;
    private @FindBy(xpath = "//a[contains(text(),'Summer')]")
    WebElement SummerCampOption;

    private @FindBy(xpath = "//h2[contains(text(),'Welcome')]")
    WebElement WelcomeMessage;
    private @FindBy(xpath = "//h2[contains(text(),'Salaah Info')]")
    WebElement salaahHeader;


    private @FindBy(css = "#form-field-email")
    WebElement emailBox;
    private @FindBy(xpath = "//input[@placeholder='Phone Number']")
    WebElement phoneNumberBox;

    private @FindBy(xpath = "//button[@type='submit']")
    WebElement submitYes;

    private @FindBy(xpath = "//div[@role='alert']")
    WebElement actualMessage;







                         // script methods


    // validate title
    public void validateTitle(WebDriver driver, String expTitle) {
        String title = driver.getTitle().trim();
        Assert.assertEquals(title, expTitle);
    }


    // method for options
    public void clickOptionsAndValidate(String option) throws InterruptedException {
        String optionForSwitch = option.toLowerCase();
        switch (optionForSwitch) {
            case "home":
                Assert.assertTrue(HomeOption.isDisplayed()); // validation of the the option is present
                HomeOption.click();
                Assert.assertTrue(HomeOption.isEnabled());
                break;
            case "services":
                Assert.assertTrue(ServicesOption.isDisplayed()); // validation of the the option is present
                ServicesOption.click();
                Assert.assertTrue(ServicesOption.isEnabled());
                break;
            case "multimedia":
                Assert.assertTrue(MultiMediaOption.isDisplayed()); // validation of the the option is present
                MultiMediaOption.click();
                Assert.assertTrue(MultiMediaOption.isEnabled());
                break;

            case "about":
                Assert.assertTrue(AboutOption.isDisplayed()); // validation of the the option is present
                AboutOption.click();
                Assert.assertTrue(AboutOption.isEnabled());
                break;

            default:
                if (optionForSwitch.contains("summer-camp")) {
                    Assert.assertTrue(SummerCampOption.isDisplayed()); // validation of the the option is present
                    SummerCampOption.click();
                    Assert.assertTrue(SummerCampOption.isEnabled());
                } else {
                    System.out.println("Sorry Not in the Menu !");
                }

        }

    }


    // method validating Welcome To
    public String validatingWelcomeText(WebDriver driver) {
        HomeOption.click();
        BrowsersUtils.scrollWithJS(driver, WelcomeMessage);
        String text = BrowsersUtils.getText(WelcomeMessage);
        return text;


    }

    // method validate Salah info is displayed
    public String validateSalahHeader() throws InterruptedException {
        HomeOption.click();
        String actualHeader = BrowsersUtils.getText(salaahHeader);
        System.out.println(actualHeader);
        return actualHeader;
    }




    // methods validating keep me updated feature is working
     public void registerInKeepMeInformed(WebDriver driver ,String email, String phoneNumber ){
        HomeOption.click();
        BrowsersUtils.scrollWithJS(driver,emailBox);
        emailBox.sendKeys(email);  //SENDING KEYS
        phoneNumberBox.sendKeys(phoneNumber); //SENDING KEYS
        submitYes.submit();
     }

     public String validateRegistrationDone(WebDriver driver ){
         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
         wait.until(ExpectedConditions.visibilityOf(actualMessage));

        return BrowsersUtils.getText(actualMessage);
     }








    }





