package apiautomation.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(strict = true, tags = {"@formulaone"},
        features = {"src/test/java/apiautomation/features/api"},
        glue = {"apiautomation.stepdefinitions.api"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber-html-reports",
                "json:target/cucumber-report/cucumber-json-reports/cucumber.json"})
public class RunApiTestSuite extends AbstractTestNGCucumberTests {

}