Feature: Data table without header in Login Table

  Scenario: Login scenario
    Given You are in login page
   	Given You enter the below credentials
   	|Admin | admin123|
   	And Click the login button
   	Then You should see the login window