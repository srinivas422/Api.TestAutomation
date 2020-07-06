package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = {"@formulaone"},
        features = {"src/test/java/features/api"},
        glue = {"stepdefinitions.api"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber-html-reports/api",
                "json:target/cucumber-report/cucumber.json"})
public class RunApiTestSuite extends AbstractTestNGCucumberTests {

}
