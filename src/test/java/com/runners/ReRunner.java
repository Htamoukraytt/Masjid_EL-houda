package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(     // Regression Suit

        features ="/Users/htamoukraytt/IdeaProjects/MASJID-ELHOUDA/src/test/resources/features",  // path of the feature
        glue =  "com/stepDef",     // path of stepDef(snippets)
        dryRun = false,
        tags =  "@Smoke" ,
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt","json:target/cucumber-reports/cucumber.json"}

)

public class ReRunner {



    

}
