
Feature: New user
  User should be able to create a new user unless that user has already exist. 
  Scenario:  Create a new user and check if that user has created.
    Given User is Home Page
    When User click on Register Link
    Then User Navigate to Register page
    When User insert personal info into Register page
    And User press on Register button
    Then User check if the new name is displayed on Dashboard


