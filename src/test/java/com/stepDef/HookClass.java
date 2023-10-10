package com.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowsersUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class HookClass {


    WebDriver driver=DriverHelper.getDriver();
   @Before
   public void setUp(){
       driver.get(ConfigReader.readProperty("QA_URL"));

   }


    @After
    public void tearDown(Scenario scenario){
       BrowsersUtils.getScreenShotWithCucumber(driver,scenario);
       driver.quit();
   }









}
