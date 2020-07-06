package com;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

public class ApiRequestSpecification {

    private RequestSpecification requestSpecification;
    private String baseUri;

    public RequestSpecification getRequestSpecification(HashMap<String, String> pathParams) {
        baseUri = PropertiesUtility.getProperties("baseUri");
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setContentType(ContentType.JSON)
                .addPathParams(pathParams)
                .build();

        return requestSpecification;
    }

}

