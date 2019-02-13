
Feature: Demo tours login functionality checking
  

   Scenario: Demo tours login functionality with valid credentials
    Given Open the browser and pass the application url
    When Enter the valid user id and password
    Then Signout option should be visitable in the next page
