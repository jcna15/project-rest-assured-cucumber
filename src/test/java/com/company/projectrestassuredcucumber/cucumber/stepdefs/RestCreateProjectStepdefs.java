package com.company.projectrestassuredcucumber.cucumber.stepdefs;

import com.company.projectrestassuredcucumber.cucumber.config.RedmineEndpoints;
import com.company.projectrestassuredcucumber.cucumber.entities.Entity;
import com.company.projectrestassuredcucumber.cucumber.entities.Project;
import io.cucumber.java.en.When;

import java.util.Map;
import java.util.Random;

public class RestCreateProjectStepdefs {
    private RestCommonStepDefs commonStepDefs;

    public RestCreateProjectStepdefs(RestCommonStepDefs commonStepDefs){
        this.commonStepDefs = commonStepDefs;
    }

    @When("System sends a request to create project services to Redmine")
    public void systemSendsARequestToCreateProjectServicesToRedmine(Map<String, String> projectData) {
        Integer randomNumber = (new Random()).nextInt(900000) + 100000;

        Project project = new Project();
        project.setName(projectData.get("name") + randomNumber);
        project.setIdentifier(projectData.get("identifier") + randomNumber);
        project.setDescription(projectData.get("description"));
        project.setIs_public(Boolean.parseBoolean(projectData.get("is_public")));

        Entity entity = new Entity(project);

        commonStepDefs.response = commonStepDefs.request
                .body(entity)
                .when()
                .post(RedmineEndpoints.ALL_REDMINE_PROJECT_JSON);


    }
}
