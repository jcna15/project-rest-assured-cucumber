package com.company.projectrestassuredcucumber.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/cucumber-pretty/Cucumber.json",
        "junit:target/cucumber-reports/cucumber-pretty/Cucumber.xml"},
        tags = {"@ApiRest"},
        glue = {"com.company.projectrestassuredcucumber.cucumber"},
        features = {"src/test/java/com/company/projectrestassuredcucumber/cucumber/features"}
)
public class RunCucumberTest {

}
