## To Get Started

#### Pre-requisites
1. Java installed in the system
2. Maven installed in the system

#### Run Scripts from Commandline
* Clone this repo and verify if folder structure is intact
* Run either of the following maven command from command line 
```
mvn clean test 
mvn clean verify
```
* The scripts should run successfully in **terminal** as it is defined in the **pom** file.
* Target folder should be created with cucumber-html-report and surefire-reports.
* **Test_Output** folder should be created with the default testng reports

#### Run Scripts from IDE
* Goto **RunApiTestSuites** class under the **TestRunner** package and click the *Run* button

#### Writing Features
```
Feature: CircuitsApi
  In order to impress my friends
  As a Formula 1 fan
  I want to know the number of races for a given Formula 1 season

  @formulaone
  Scenario Outline: Check the number of races in a season
    Given I want to know the number of Formula One races in "<season>"
    When I retrieve the circuit list for that season
    Then there should be "<numberOfCircuits>" circuits in the list returned

    Examples:
      | season | numberOfCircuits |
      | 2017   | 20               |
      | 2016   | 21               |
      | 1966   | 9                |
      | 1950   | 7                |
```

#### Writing Step Definitions

```
public class CircuitsApiSteps {
    @Given("I want to know the number of Formula One races in {string}")
        public void i_want_to_know_the_number_of_Formula_One_races_in(String string) {

    }
}
```


#### Cucumber Options

```
@CucumberOptions(strict = true, 
        tags = {"@formulaone"},
        features = {"src/test/java/apiautomation/features/api"},
        glue = {"apiautomation.stepdefinitions.api"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber-html-reports",
                "json:target/cucumber-report/cucumber.json"})
```

#### HTML Reports
Default cucumber HTML reports are generated under below path, which can be customized according to specific requirement
```
target/cucumber-report/cucumber-html-reports/overview-failures.html/overview-feature.html
````
##### Success Cucumber Reports

![report1](./images/report1.png)
![report2](./images/report2.png)
![report3](./images/report3.png)
