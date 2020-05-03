package com.company.projectrestassuredcucumber.cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestGetIssuesStepdefs {

    private static RequestSpecification request;
    private static Response response;

    @Given("System is ready to send request")
    public void systemIsReadyToSendRequest() {
        request = given()
                .contentType("application/json");
    }

    @When("System sends a request to list issues service from redmine json")
    public void systemSendsARequestToListIssuesServiceFromRedmineJson() {
        response = request.when()
                .log()
                .all()
                .get("http://CESAR-PC:81/redmine/issues.json");
    }

    @Then("The response status should be {int}")
    public void theResponseStatusShouldBe(int arg0) {
        response.then()
                .log()
                .all()
                .statusCode(arg0);
    }
}
