@OrangeHRM
Feature: Login functinality of Orange HRM Application

  Scenario: user login into orange HRM application
    Given user is on orange login page
    When user validate login functionality

  Scenario: validate Home functionality
    Given user validate the home page url

  Scenario Outline: Validate the PIM functionality
    Given user click on pim link
    When user click on add employee
    And user enter "<firstname>" ,"<lastName>", "<middleName>" and capture the "<employeeId>"
    And user click on save button
    And user enter "<Country>" and select "<gender>"
    And user click on save button
    And user click on employee list button
    And user enter the employee id
    And user click on search button
    And user delete employee and confirm delete

    Examples: 
      | firstname | lastName | middleName | employeeId | Country | Country | gender |

  Scenario: validate logout functionality
    Given user logout from application
