package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Donate {

      // constructor
    public Donate(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    // elements for donations

    private @FindBy(xpath = "//a[@role='button']//span[.='Donate']")  // smoke
    WebElement DonateButton;
    private  @FindBy(xpath = "//nav//a[.='Masjid Expenses']")
    WebElement MasjidExpenses;
    private  @FindBy(xpath = "//nav//a[.='Zakat & Sadaqah']")
    WebElement ZakatSadaqah;
    private  @FindBy(xpath = "//nav//a[.='Maktab & Nazirah']")
    WebElement MaktabNazirah;

    private  @FindBy(xpath = "//nav//a[.='Tuition Fees']")
    WebElement TuitionFees;

    private  @FindBy(xpath = "//nav//a[.='Ramadan 2023']")
    WebElement Ramadan2023;



             //=======>  Methods


    public void clickDonate(WebDriver driver){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(DonateButton));
        DonateButton.click();
    }



       // validating donation Options


    public String validatingDonationOptions(WebDriver driver,String DonationOption) throws InterruptedException {
        // String optionForSwitch = option.toLowerCase();
        Thread.sleep(2000);
        switch (DonationOption) {
            case "MasjidExpenses":
                Assert.assertTrue(MasjidExpenses.isDisplayed()); // validation of the the option is present
                MasjidExpenses.click();
                break;
            case "ZakatSadaqah":
                Assert.assertTrue(ZakatSadaqah.isDisplayed()); // validation of the the option is present
                ZakatSadaqah.click();
                break;
            case "MaktabNazirah":
                Assert.assertTrue(MaktabNazirah.isDisplayed()); // validation of the the option is present
                MaktabNazirah.click();
                break;

            case "TuitionFees":
                Assert.assertTrue(TuitionFees.isDisplayed()); // validation of the the option is present
                TuitionFees.click();
                break;

            case "Ramadan2023":
                Assert.assertTrue(Ramadan2023.isDisplayed()); // validation of the the option is present
                Ramadan2023.click();
                break;


            default:
                System.out.println("wrong Donation Type!");
        }

        Thread.sleep(4000);
        String url=driver.getCurrentUrl();
        return url;


    }









}
