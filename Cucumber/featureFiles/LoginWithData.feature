Feature: Login feature with data

  Scenario: Login scenarion
    Given user is on the login page
   	When user is enters valid credentials "Admin" and "admin123"
   	And Click login button
   	Then You should see the Home page