package com.stepDef;

import com.pages.AboutUs;
import com.pages.Home;
import com.pages.MultiMedia;
import com.pages.Services;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class MultiMedia_StepDef {


    // driver
    WebDriver driver= DriverHelper.getDriver();

    //pages
    Home home =new Home(driver);
    Services services=new Services(driver);

    AboutUs aboutus=new AboutUs(driver);

    MultiMedia multiMedia=new MultiMedia(driver);


    @When("user clicks Multimedia")
    public void user_clicks_multimedia() {
        multiMedia.clickMultiMedia(driver);
    }


    @When("user validates url , {string}")
    public void user_validates_url(String expectedUrl) throws InterruptedException {
    Assert.assertEquals(expectedUrl, multiMedia.validateMultiMediaUrl(driver));
    }


    @Then("user validates Text {string}")
    public void userValidatesText(String expectedText) {
       Assert.assertEquals(expectedText,multiMedia.validateMultiMediaText(driver));
    }
}
