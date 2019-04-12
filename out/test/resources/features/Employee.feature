# Login feature review the behavior in thie feature
Feature: Employee

  Scenario: Employee List page is displayed
    Given 'Employee List' page is loaded
    And clickAddEmployee
    And add 'Employee' data
   # And setCredentials
  Scenario:Update
    And edit 'Employee' data
  Scenario: Delete
   And clickDeleteBtn
   And clickRefresh
