Feature: Cogmentto CRM Application

  Scenario: validate the login functionality
    Given User open Url in "chrome" broswer
    When user enter the username and password
      | prafulp1010@gmail.com | Pr@ful0812 |
    Then user click on login button

  Scenario: validate home page Functionality
    When user is on home page and validate title
    And user validate url

  Scenario Outline: validate contact page functionality
    When user click on contact link
    And user click on create button
    Then user enter firstname , last name and select status
    And user click on save button

    Examples: 
      | Raju   | Patil  | inactive   |
      | Amruta | jadhav | active     |
      | Amruta | Patil  | terminated |
      | Amruta | Patil  | On hold    |

  Scenario: validate company page functionality
    When user click on company link
    And user click on company page create button
    Then user enter name, website,  address and email
      | name | website      | address | email            |
      | HSBC | www.hsbc.com | Pune    | contact@hsbc.com |
    And user click on save button

  Scenario: validate Deals page functionality
    When user click on deals link
    And user click on deals page create button
    Then user enter title and user select date as 15 and month and year as "March 2025" and time as "08:45"
    And user click on save button
