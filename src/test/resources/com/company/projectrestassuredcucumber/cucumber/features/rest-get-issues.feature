Feature: REST - Redmine REST Testing - Get Issue
  As a user..
  I want to..

  @ApiRest
  Scenario: Get issue by list - JSON
    Given System is ready to send request
    When System sends a request to list issues service from redmine json
    Then The response status should be 200

  @ApiRest
  Scenario: Get Issue by ID - JSON
    Given System is ready to send request
    When System sends a request to get issues by ID service from redmine json
    |id|2|
    Then The response status should be 200
    And System should responses with response data
      |id|2|
      |subject|Mi segundo Issue con Rest-Assured y Endpoints|
      |description|MMi segundo Issue con Rest-Assured y Endpoints|
      |start_date|2020-04-25                                     |