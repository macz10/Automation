# Login feature review the behavior in thie feature
Feature: Employee

  Scenario: Employee List page is displayed
    Given 'Employee List' page is loaded
    And clickAddEmployee
    And add 'Employee' data
    And verify "abc dato input" is displayed in 'Employee' page
   # And setCredentials
  Scenario:Update
    Given 'Employee List' page is loaded
    And edit 'Employee' data

  Scenario: Delete
    Given 'Employee List' page is loaded
    And clickDeleteBtn
    And clickRefresh
