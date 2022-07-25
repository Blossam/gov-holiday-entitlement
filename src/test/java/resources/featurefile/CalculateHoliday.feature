
Feature: Calculate holiday entitlement

  As user I want to logging into Government Holiday website

  Scenario: Calculate holiday entitlement

    Given I am on homepage
    And I click on Accept additional cookies
    When I click on start button
    And I verify the title as "Is the holiday entitlement based on:"
    And I click on "hours worked per week"
    Then I click on Continue button
    Then I verify the work out holiday title as "Do you want to work out holiday:"
    And I select option as "for a full leave year"
    Then I click on Continue button for next page
    Then I verify the title number of hours per week "Number of hours worked per week?"
    Then I enter hours worked per week "37.5"
    And I click on Continue to go next page
    Then I verify the title number of days worked "Number of days worked per week?"
    Then I enter number of days "5"
    And I click on Continue to see the result
    Then I verify the information title and result "Information based on your answers"
    And I verify the entitlement "The statutory entitlement is 210 hours holiday."








