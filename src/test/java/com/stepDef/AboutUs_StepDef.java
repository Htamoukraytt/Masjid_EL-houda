package com.stepDef;

import com.pages.AboutUs;
import com.pages.Home;
import com.pages.Services;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.io.FileNotFoundException;

public class AboutUs_StepDef {

    // driver
    WebDriver driver= DriverHelper.getDriver();

    //pages
    Home home =new Home(driver);
   Services services=new Services(driver);

   AboutUs aboutus=new AboutUs(driver);

    public AboutUs_StepDef() throws FileNotFoundException {
    }

    @When("user clicks About Us feature")
    public void user_clicks_about_us_feature() {
        aboutus.ClickAboutUs(driver);
    }


    @And("user validates About Us page {string}")
    public void user_validates_about_us_page(String expectedTitle) throws InterruptedException {
      Assert.assertEquals(expectedTitle,aboutus.getAboutUsTitle(driver));
    }


    @When("user validates stuff members are {int}")
    public void user_validates_stuff_members_are(Integer expectedNumberOfStuff) {
       Assert.assertTrue(expectedNumberOfStuff == aboutus.listOfStuff(driver) );
    }


    @Then("user validates {string} , for contacting the To contact stuff")
    public void userValidatesToContactTheBoardPleaseEmailUsAtBoardMasjidalhudaOrgForContactingTheToContactStuff(String expectedMessage) {
       Assert.assertEquals(expectedMessage,aboutus.validateContactBord(driver));
    }


    @When("user validate {string} is present")
    public void user_validate_is_present(String expectedFollowUs) {
      Assert.assertEquals(expectedFollowUs,aboutus.validateFollowUs(driver));
    }



    @When("user clicks social media type {string} and validates {string}")
    public void user_clicks_social_media_type_and_validates(String ScOption, String expectedScUrl) throws InterruptedException {
      Assert.assertEquals(expectedScUrl,aboutus.ValidationAllOptionsInSocialMedia(driver,ScOption));
    }



}
