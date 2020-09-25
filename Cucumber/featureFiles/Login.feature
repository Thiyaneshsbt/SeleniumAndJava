Feature: feature is test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigate to the home page
    Then You should see Logout button
    