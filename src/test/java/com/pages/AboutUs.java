package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowsersUtils;

import java.util.ArrayList;
import java.util.List;

public class AboutUs {

    // Constructor
    public AboutUs(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // elements
    private @FindBy(xpath = "//a[.='About']")
    WebElement AboutUsOption;

    private @FindBy(xpath = "//a[.='Masjid Project']")   // tried hover over (Actions class + Js execute not working )
    WebElement MasjidProjectOption;

    private @FindBy(xpath = "//h2[contains(text(),'Board of')]")
    WebElement BoardOfTrust;

    private @FindBy(xpath = "//ul[contains(@class,'list-items')]//li//*[@class='elementor-icon-list-text']")
    List<WebElement> listOfStuff;

    private @FindBy(xpath = "//h2[contains(text(),'To contact')]")
    WebElement actualContactMessage;


     private @FindBy(xpath = "//h4[.='Follow Us']")
     WebElement FollowUs;

    private @FindBy(xpath = "//span[.='YouTube']")
    WebElement YouTube;
    private @FindBy(xpath = "//ul//span[.='Instagram']")
    WebElement Instagram;
    private @FindBy(xpath = "//span[.='Facebook']")
    WebElement Facebook;
    private @FindBy(xpath = "//span[.='WhatsApp']")
    WebElement WhatsApp;


               //* Methods

    public void ClickAboutUs(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.doubleClick(AboutUsOption).perform();
    }


    public String getAboutUsTitle(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }


    // !!! hover over not working
//    public void clickOptions(WebDriver driver) throws InterruptedException {
////        Actions actions=new Actions(driver);
////        actions.moveToElement(AboutUsOption).perform();
////        MasjidProjectOption.click();
//         Thread.sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].dispatchEvent(new Event('mouseover'))",AboutUsOption);
//        Thread.sleep(3000);
//        MasjidProjectOption.click();
//
//    }


    // validating list of stuff
    public int listOfStuff(WebDriver driver) {
        BrowsersUtils.scrollWithJS(driver, listOfStuff.get(0)); // scrolling down to the target
        ArrayList<String> actualListOfOurStuff = new ArrayList<>();
        for (int i = 5; i < 19; i++) {
            String each = listOfStuff.get(i).getText();
            actualListOfOurStuff.add(each);
        }
        return actualListOfOurStuff.size() + 1;  // due indexing starts from zero (added + 1)
    }

    //
    public String validateContactBord(WebDriver driver) {
        BrowsersUtils.scrollWithJS(driver, actualContactMessage); // scrooling
        String actualMessage = BrowsersUtils.getText(actualContactMessage);

        return actualMessage;
    }


    //  ------> scenario 2 social media

    public String validateFollowUs(WebDriver driver){
        BrowsersUtils.scrollWithJS(driver,FollowUs);
        return BrowsersUtils.getText(FollowUs);
    }


    public String ValidationAllOptionsInSocialMedia(WebDriver driver,String ScType) throws InterruptedException {

        switch (ScType) {

            case "YouTube":
                BrowsersUtils.scrollWithJS(driver,YouTube);
                YouTube.click();break;
            case "Instagram":
                BrowsersUtils.scrollWithJS(driver,Instagram);
                Instagram.click();break;

            case "Facebook":

                BrowsersUtils.scrollWithJS(driver,Facebook);
                Facebook.click();break;

            case "WhatsApp":
                BrowsersUtils.scrollWithJS(driver,WhatsApp);
                WhatsApp.click();break;


            default:
                System.out.println("Something Went Wrong! SC media");

        }
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }




}
