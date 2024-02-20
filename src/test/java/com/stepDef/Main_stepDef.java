package com.stepDef;

import com.pages.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.io.FileNotFoundException;

public class Main_stepDef {

    // driver
     WebDriver driver= DriverHelper.getDriver();

     //pages
    Home home =new Home(driver);

    public Main_stepDef() throws FileNotFoundException {
    }

    @Given("user navigates to Masjid El Houda and validate {string}")
    public void user_navigates_to_masjid_el_houda_and_validate(String expectedUrl) {
      home.validateTitle(driver, expectedUrl);
    }

    @When("user validates all menu options {string} are displayed and clickable")
    public void userValidatesAllMenuOptionsOPTIONAreDisplayedAndClickable(String inputOption) throws InterruptedException {
        home.clickOptionsAndValidate(inputOption);
    }

    @Then("user validates the welcome message {string}")
    public void userValidatesTheWelcomeMessageWelcomeToMasjidAlHuda(String expectedText) {
        Assert.assertTrue( home.validatingWelcomeText(driver).contains(expectedText));
    }


    @When("user validates salah info is displayed , {string}")
    public void user_validates_salah_info_is_displayed(String expectedHeader) throws InterruptedException {
       Assert.assertEquals(expectedHeader, home.validateSalahHeader());
    }


    @And("user registers in keep me informed feature")
    public void userRegistersInKeepMeInformedFeature() throws FileNotFoundException {
        home.registerInKeepMeInformed(driver,
                                      ConfigReader.readProperty("email"),
                                      ConfigReader.readProperty("phoneNumber")

            );

    }

    @Then("user validates that registration was done successfully, {string}")
    public void userValidatesThatRegistrationWasDoneSuccessfully(String expectedMessage) {
        Assert.assertEquals(expectedMessage, home.validateRegistrationDone(driver));
    }
}
