
@tag
Feature: LoginTest feature
  I want to use this template for my feature file

 
  Scenario: Successful login with valid credentials
    Given User is on homepage
    When I put email and password and click signin
    Then User logs in successfully
 
   Scenario: Successful logout
    When I click signout
    Then User lands on homepage
 