Feature: REST - Redmine REST Testing - Get Issue
  As a user..
  I want to..

  @ApiRest
  Scenario: Get issue by list - JSON
    Given System is ready to send request
    When System sends a request to list issues service from redmine json
    Then The response status should be 200