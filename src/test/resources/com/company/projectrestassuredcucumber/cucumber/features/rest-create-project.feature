Feature: REST - Redmine REST Testing - Create Project
  As a user..
  I want to..

  @ApiRest
  Scenario: Create a project - JSON
    Given System is ready to sent request
    When System sends a request to create project services to Redmine
    |name|RedmineProject|
    |identifier|test10  |
    |description|Redmine Project from Cucumber-Rest Assured|
    |is_public  |false  |
    Then The response status should be 200