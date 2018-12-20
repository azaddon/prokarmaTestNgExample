#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login

  Scenario: successful login with valid credential
  Description:this feature is to test login functionality
  
    Given user is on home page
    
    When user enters username and password
    
    And clicks on go button
   
    Then he can visit practice page
    
    And message is displayed

  Scenario: successful logout
    
    When user logout from application
    Then he cannot visit practice homepage