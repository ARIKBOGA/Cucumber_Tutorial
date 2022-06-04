# Created by burakarikboga at 4.06.2022
@SmokeTest
@RegressionTest
Feature: Register Test

  Scenario Outline: Create An Account
    Given Navigate to Website
    And Click Sign in Button
    And type email "<email>"
    And Click On Create Account Button
    And Choose Title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type companyName "<companyName>"
    And type address "<address>"
    Examples:
      | email                 | firstname | lastname   | password | companyName | address           |
      | myemail42@yahoo.com   | Berlin    | Mainz      | pass1234 | T-Mobile    | Kreuzberg 42      |
      | youremail42@yahoo.com | London    | Liverpool  | passABCD | Vodafone    | Square 42         |
      | heremail42@yahoo.com  | Paris     | Strasbourg | pass9876 | Orange      | Champs-Elysees 42 |
