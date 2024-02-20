package com.stepDef;

import com.pages.Home;
import com.pages.Services;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.io.FileNotFoundException;

public class Services_StepDef {

    // driver
    WebDriver driver= DriverHelper.getDriver();

    //pages
    Home home =new Home(driver);
   Services services=new Services(driver);

    public Services_StepDef() throws FileNotFoundException {
    }


    @When("user clicks Services and validates is in the services page , {string}")
    public void user_clicks_services_and_validates_is_in_the_services_page(String expectedPageMessage) {
      Assert.assertEquals(expectedPageMessage,services.validatingServicePage(driver));
    }

    @And("user clicks {string} and validates {string}")
    public void userClicksOPTIONAndValidatesURL(String inOption , String expectedUrl) throws InterruptedException {
        Assert.assertEquals(expectedUrl,services.ValidationAllOptionsInServices(driver,inOption));
    }







}
