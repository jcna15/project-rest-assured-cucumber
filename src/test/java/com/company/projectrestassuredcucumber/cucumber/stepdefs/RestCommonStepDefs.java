package com.company.projectrestassuredcucumber.cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestCommonStepDefs {
    protected RequestSpecification request;
    protected Response response;

    @Given("System is ready to sent request")
    public void systemIsReadyToSendRequest(){
        request = given();
    }

    @Then("The response status should be {int}")
    public void theResponseStatusShouldBe(int code) {

        response.then()
                .statusCode(code);
    }
}
