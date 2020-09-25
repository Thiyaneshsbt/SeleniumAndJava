Feature: this feature file is to explain Datatable with Header

  Scenario: Login scenarion with Header table
    Given Navigate to  login page
    Given enter the below credentials
   	|username|password|
   	|Admin | admin123|
   	And Click the login button
   	Then You should see the login page