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

public class Services {

    // Constructor
    public Services(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    // elements

    private @FindBy(xpath = "//h2[.='Programs & Services']") // message
    WebElement       ServicesPageText;

    private @FindBy(xpath = "//a[.='Services']//span")
    WebElement ServicesOption;

    private @FindBy(xpath = "//span[.='Zakat/Sadaqah']") // +
    WebElement ZakatOption;
    private @FindBy(xpath = "//li//a[.='Children’s Quran']")
    WebElement ChildrenQuranOption ;
    private @FindBy(xpath = "//span[.='Janazah']") //+
    WebElement JanazahOption;
    private @FindBy(xpath = "//span[.='Nikah']") // +
    WebElement NikahOption;
    private @FindBy(xpath = "//span[.='Religious Advice']") //+
    WebElement AdviceOption;
    private @FindBy(xpath = "//span[.='Al Huda Academy']")   //+
    WebElement AcademyOption;
    private @FindBy(xpath = "//span[.='Weekend School']")  //
    WebElement WeekendSchoolOption;

    private @FindBy(xpath = "//span[.='Maktab/Nazirah']")  //+
    WebElement MaktabNazirahOption;

    private @FindBy(xpath = "//span[.='Outreach']") //+
    WebElement OutreachOption;


    private @FindBy(xpath = " //span[.='Newly Practicing']") // NOT CLICKABLE
    WebElement  NewPracticingOption;

    private @FindBy(xpath = "//span[.='Adult Education']") //  NOT CLICKABLE
    WebElement  AdultEducationOption;



    //     -----> Methods


    // validating we are in service page

    public String  validatingServicePage(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.doubleClick(ServicesOption).perform();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(ServicesPageText));
        return BrowsersUtils.getText(ServicesPageText);
    }




    // services Options

    public String ValidationAllOptionsInServices(WebDriver driver,String inOption) throws InterruptedException {
        driver.navigate().back();


        switch (inOption) {

            case "Zakat/Sadaqah":
                BrowsersUtils.scrollWithJS(driver, ZakatOption);
                ZakatOption.click();
                break;

            case "Janazah":
                BrowsersUtils.scrollWithJS(driver, JanazahOption);
                JanazahOption.click();break;

            case "Nikah":
                BrowsersUtils.scrollWithJS(driver,NikahOption);
                NikahOption.click();break;

            case "Advice":
                BrowsersUtils.scrollWithJS(driver,AdviceOption);
                AdviceOption.click();break;

            case "Al Huda Academy":
                BrowsersUtils.scrollWithJS(driver,AcademyOption);
                AcademyOption.click();break;

            case "Weekend School":
                BrowsersUtils.scrollWithJS(driver,WeekendSchoolOption);
                WeekendSchoolOption.click();break;

            case "Maktab/Nazirah":
                BrowsersUtils.scrollWithJS(driver,MaktabNazirahOption);
                MaktabNazirahOption.click();break;

            case "Outreach":
                BrowsersUtils.scrollWithJS(driver,OutreachOption);
                OutreachOption.click();break;

//            case "Newly Practicing":
//                BrowsersUtils.scrollWithJS(driver,NewPracticingOption);     // not available(not clickable)
//                NewPracticingOption.click();break;
//
//            case "Adult Education":
//                BrowsersUtils.scrollWithJS(driver,AdultEducationOption);    // not available(not clickable)
//                AdultEducationOption.click();break;

            default:
                System.out.println("Something Went Wrong!");

        }
            Thread.sleep(3000);
            String url = driver.getCurrentUrl();
            System.out.println(url);
            return url;
        }


    }