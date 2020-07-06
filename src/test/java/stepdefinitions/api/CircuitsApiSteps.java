package stepdefinitions.api;

import com.ApiRequestSpecification;
import com.PropertiesUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.http.ContentType.fromContentType;

public class CircuitsApiSteps {
    private Response response;
    private String baseUri;
    private JsonPath jsonPath;
    private ApiRequestSpecification apiRequestSpecification;
    private static final String api_config_properties = "config.properties";

    @Given("I want to know the number of Formula One races in {string}")
    public void i_want_to_know_the_number_of_Formula_One_races_in(String seasonNum) throws IOException, URISyntaxException {
        apiRequestSpecification = new ApiRequestSpecification();
        PropertiesUtility.loadProperties(api_config_properties);
        HashMap<String, String> pathParams = new HashMap<>();
        pathParams.put("season", seasonNum);

        response = given()
                    .log().all()
                    .spec(apiRequestSpecification.getRequestSpecification(pathParams))
                .when()
                    .get("{season}/circuits.json")
                .then()
                    .extract().response();
    }

    @When("I retrieve the circuit list for that season")
    public void i_retrieve_the_circuit_list_for_that_season() {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        //Verifying the content type
        String contentType = response.header("Content-Type");
        Assert.assertEquals(contentType, "application/json; charset=utf-8");
        jsonPath = new JsonPath(response.body().asString());
    }

    @Then("there should be {string} circuits in the list returned")
    public void there_should_be_circuits_in_the_list_returned(String numberOfCircuits) {
        String noOfCircuits = jsonPath.get("MRData.total");
        Assert.assertEquals(noOfCircuits, numberOfCircuits);
    }
}
