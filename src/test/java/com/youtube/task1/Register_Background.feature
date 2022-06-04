# Created by burakarikboga at 4.06.2022
Feature: Register Test

  Background:
    Given Navigate to Website
    And Click Sign in Button
    And type email "omeroz@gmail.com"
    And Click On Create Account Button

  Scenario: Person 1
    And type firstname "omer" and lastname "faruk"

  Scenario: Person 2
    And type companyName "IBM"
    And type address "New York Times 34"

  Scenario Outline: Create An Account
    And Choose Title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type companyName "<companyName>"
    And type address "<address>"
    Examples:
      | firstname | lastname   | password | companyName | address           |
      | Berlin    | Mainz      | pass1234 | T-Mobile    | Kreuzberg 42      |
      | London    | Liverpool  | passABCD | Vodafone    | Square 42         |
      | Paris     | Strasbourg | pass9876 | Orange      | Champs-Elysees 42 |