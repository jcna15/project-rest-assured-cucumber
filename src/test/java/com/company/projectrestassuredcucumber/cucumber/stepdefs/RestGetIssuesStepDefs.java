package com.company.projectrestassuredcucumber.cucumber.stepdefs;

import com.company.projectrestassuredcucumber.cucumber.config.RedmineEndpoints;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.Map;

public class RestGetIssuesStepDefs {

    private RestCommonStepDefs commonStepDefs;

    public RestGetIssuesStepDefs(RestCommonStepDefs commonStepDefs){
        this.commonStepDefs = commonStepDefs;
    }

    @When("System sends a request to list issues service from redmine json")
    public void systemSendsARequestToListIssuesServiceFromRedmineJson() {
        commonStepDefs.response = commonStepDefs.request
                .when()
                .get(RedmineEndpoints.ALL_REDMINE_ISSUES_JSON);
    }

    @When("System sends a request to get issues by ID service from redmine json")
    public void systemSendsARequestToGetIssuesByIDServiceFromRedmineJson(Map<String, String> issue) {
        commonStepDefs.response = commonStepDefs.request
                .pathParam("id",issue.get("id")).
                        when()
                .get(RedmineEndpoints.SINGLE_REDMINE_ISSUE_JSON);

    }

    @And("System should responses with response data")
    public void systemShouldResponsesWithResponseData(Map<String, String> expectedData) {
        JsonPath actualData = new JsonPath(commonStepDefs.response.getBody().asString());

        Assert.assertEquals(Integer.parseInt(expectedData.get("id")),actualData.getInt("issue.id"));
        Assert.assertEquals(expectedData.get("subject"),actualData.getString("issue.subject"));
        Assert.assertEquals(expectedData.get("description"),actualData.getString("issue.description"));
        Assert.assertEquals(expectedData.get("start_date"),actualData.getString("issue.start_date"));

    }
}
