$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/api/CircuitsApi.feature");
formatter.feature({
  "name": "CircuitsApi",
  "description": "  In order to impress my friends\n  As a Formula 1 fan\n  I want to know the number of races for a given Formula 1 season",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check the number of races in a season",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@formulaone"
    }
  ]
});
formatter.step({
  "name": "I want to know the number of Formula One races in \"\u003cseason\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I retrieve the circuit list for that season",
  "keyword": "When "
});
formatter.step({
  "name": "there should be \"\u003cnumberOfCircuits\u003e\" circuits in the list returned",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "season",
        "numberOfCircuits"
      ]
    },
    {
      "cells": [
        "2017",
        "20"
      ]
    },
    {
      "cells": [
        "2016",
        "21"
      ]
    },
    {
      "cells": [
        "1966",
        "9"
      ]
    },
    {
      "cells": [
        "1950",
        "7"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check the number of races in a season",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@formulaone"
    }
  ]
});
formatter.step({
  "name": "I want to know the number of Formula One races in \"2017\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_want_to_know_the_number_of_Formula_One_races_in(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I retrieve the circuit list for that season",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_retrieve_the_circuit_list_for_that_season()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there should be \"20\" circuits in the list returned",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.there_should_be_circuits_in_the_list_returned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the number of races in a season",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@formulaone"
    }
  ]
});
formatter.step({
  "name": "I want to know the number of Formula One races in \"2016\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_want_to_know_the_number_of_Formula_One_races_in(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I retrieve the circuit list for that season",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_retrieve_the_circuit_list_for_that_season()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there should be \"21\" circuits in the list returned",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.there_should_be_circuits_in_the_list_returned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the number of races in a season",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@formulaone"
    }
  ]
});
formatter.step({
  "name": "I want to know the number of Formula One races in \"1966\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_want_to_know_the_number_of_Formula_One_races_in(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I retrieve the circuit list for that season",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_retrieve_the_circuit_list_for_that_season()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there should be \"9\" circuits in the list returned",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.there_should_be_circuits_in_the_list_returned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the number of races in a season",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@formulaone"
    }
  ]
});
formatter.step({
  "name": "I want to know the number of Formula One races in \"1950\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_want_to_know_the_number_of_Formula_One_races_in(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I retrieve the circuit list for that season",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.i_retrieve_the_circuit_list_for_that_season()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there should be \"7\" circuits in the list returned",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.api.CircuitsApiSteps.there_should_be_circuits_in_the_list_returned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});