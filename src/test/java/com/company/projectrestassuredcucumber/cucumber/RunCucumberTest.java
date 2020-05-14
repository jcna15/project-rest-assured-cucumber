package com.company.projectrestassuredcucumber.cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/json-reports/Cucumber.json",
        "junit:target/cucumber-reports/junit-reports/Cucumber.xml"},
        tags = {"@ApiRest"},
        glue = {"com.company.projectrestassuredcucumber.cucumber"},
        features = {"src/test/resources/com/company/projectrestassuredcucumber/cucumber/features"},
        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumberTest {

}
