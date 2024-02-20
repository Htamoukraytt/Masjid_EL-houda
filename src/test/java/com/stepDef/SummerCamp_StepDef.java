package com.stepDef;

import com.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.io.FileNotFoundException;

public class SummerCamp_StepDef {


    // driver
    WebDriver driver= DriverHelper.getDriver();

    //pages
    Home home =new Home(driver);
    Services services=new Services(driver);

    AboutUs aboutus=new AboutUs(driver);


    MultiMedia multiMedia=new MultiMedia(driver);

    SummerCamp2023 summerCamp=new SummerCamp2023(driver);

    Donate donate=new Donate(driver);

    public SummerCamp_StepDef() throws FileNotFoundException {
    }


    @When("user clicks Summer Camp {int} and validates the page url , {string}")
    public void user_clicks_summer_camp_and_validates_the_page_url(int test ,String expectedUrl) throws InterruptedException {
      Assert.assertEquals(expectedUrl,summerCamp.clickSummerCamp2023(driver));
    }

    @When("user clicks register now")
    public void user_clicks_register_now() {
       summerCamp.clickRegisterButton(driver);
    }


    @Then("user  validates that can register for camp {string}")
    public void userValidatesThatCanRegisterForCamp(String expectedRegister) {
      Assert.assertEquals(expectedRegister,summerCamp.validateRegisterIsOpen(driver));
    }
}
