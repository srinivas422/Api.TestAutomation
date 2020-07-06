package stepdefinitions.api;

import com.PropertiesUtility;
import com.sun.codemodel.JArray;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import steps.api.CircuitsApi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class CircuitsApiSteps {
    private Response response;
    private String baseUri;
    private JsonPath jsonPath;
    private CircuitsApi circuitsApi;
    private static final String api_config_properties = "config.properties";

    @Given("I want to know the number of Formula One races in {string}")
    public void i_want_to_know_the_number_of_Formula_One_races_in(String seasonNum) throws IOException, URISyntaxException {
        circuitsApi = new CircuitsApi();
        PropertiesUtility.loadProperties(api_config_properties);
        response = circuitsApi.getFormulaOneApiResponse(seasonNum);
    }

    @When("I retrieve the circuit list for that season")
    public void i_retrieve_the_circuit_list_for_that_season() {
        //Verifying api response code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        //Verifying the content type
        String contentType = response.header("Content-Type");
        Assert.assertEquals(contentType, "application/json; charset=utf-8");
        jsonPath = new JsonPath(response.body().asString());
    }

    @Then("there should be {string} circuits in the list returned")
    public void there_should_be_circuits_in_the_list_returned(String numberOfCircuits) {
        //Verifying the total tracks
        String totalCircuits = jsonPath.get("MRData.total");
        Assert.assertEquals(totalCircuits, numberOfCircuits);

        //Verifying the number of tracks from the response array
        ArrayList<String> noOfCircuits =jsonPath.get("MRData.CircuitTable.Circuits");
        Assert.assertEquals(noOfCircuits.size(), Integer.parseInt(numberOfCircuits));
    }
}
