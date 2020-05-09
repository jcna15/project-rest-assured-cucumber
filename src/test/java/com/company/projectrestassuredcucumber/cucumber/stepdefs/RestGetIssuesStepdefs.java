package com.company.projectrestassuredcucumber.cucumber.stepdefs;

import com.company.projectrestassuredcucumber.cucumber.config.RedmineEndpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestGetIssuesStepdefs {

    private static RequestSpecification request;
    private static Response response;

    @Given("System is ready to send request")
    public void systemIsReadyToSendRequest() {
        request = given();
    }

    @When("System sends a request to list issues service from redmine json")
    public void systemSendsARequestToListIssuesServiceFromRedmineJson() {
        response = request.when()
                .get(RedmineEndpoints.ALL_REDMINE_ISSUES_JSON);
    }

    @Then("The response status should be {int}")
    public void theResponseStatusShouldBe(int arg0) {
        response.then()
                .statusCode(arg0);
    }
}
