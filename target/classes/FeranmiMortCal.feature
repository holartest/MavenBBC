#Author: feranmi
Feature: BBC Mortgage Calculator

  Scenario Outline: As a user I want to calculate mortgage when I enter correct details
    Given I am on BBC Homes Homepage
    And I click Moving Homes
    And I click Property
    When I click Mortgage Calculator link
    And Mortgage I type "<Mortgage>" into Mortgage required field
    And Repayment I type "<Repayment>" into Repayment Period
    And Interest Rate I type into "<InterestRate>" Interest rate field
    And I click the calculate link
    Then I see monthly payment details
    And I click th clear button
    And I closse the browser

    Examples: 
      | Mortgage | Repayment | InterestRate |
      |   500000 |        25 |           12 |
      |   300000 |        30 |           20 |
      |   800000 |        13 |           10 |
      |   350000 |        15 |            8 |
