package apiautomation.TestRunner;

import apiautomation.ReportHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(strict = true, tags = {"@formulaone"},
        features = {"src/test/java/apiautomation/features/api"},
        glue = {"apiautomation.stepdefinitions.api"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber-html-reports",
                "json:target/cucumber-report/cucumber.json"})
public class RunApiTestSuite extends AbstractTestNGCucumberTests {
    @AfterSuite(alwaysRun=true)
    public void generateHTMLReports() {
        ReportHelper.generateCucumberReport();
    }
}