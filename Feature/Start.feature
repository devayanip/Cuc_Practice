Feature: Login Feature

  Scenario: Postive Scenario
    Given I have site
    When I provide correct username and password
    Then I am logged in
