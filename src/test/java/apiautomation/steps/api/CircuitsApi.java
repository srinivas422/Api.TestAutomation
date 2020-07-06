package apiautomation.steps.api;

import apiautomation.ApiRequestSpecification;
import io.restassured.response.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CircuitsApi {
    private ApiRequestSpecification apiRequestSpecification;

    public Response getFormulaOneApiResponse(String seasonNum) throws IOException, URISyntaxException {
        apiRequestSpecification = new ApiRequestSpecification();
        HashMap<String, String> pathParams = new HashMap<>();
        pathParams.put("season", seasonNum);

        return given()
                .log().all()
                .spec(apiRequestSpecification.getRequestSpecification(pathParams))
                .when()
                .get("{season}/circuits.json")
                .then()
                .extract().response();
    }
}
