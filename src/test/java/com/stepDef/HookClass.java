package com.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowsersUtils;
import utils.ConfigReader;
import utils.DriverHelper;

import java.io.FileNotFoundException;

public class HookClass {


    WebDriver driver=DriverHelper.getDriver();

    public HookClass() throws FileNotFoundException {
    }

    //    public HookClass() throws FileNotFoundException {
//    }
    @Before
   public void setUp() throws FileNotFoundException {
       driver.get(ConfigReader.readProperty("QA_URL"));

   }


    @After
    public void tearDown(Scenario scenario){
       BrowsersUtils.getScreenShotWithCucumber(driver,scenario);
       driver.quit();
   }









}
