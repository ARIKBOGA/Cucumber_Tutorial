@RegressionTest
Feature: Contact Us Test

  Scenario: Go to website and test Contact Us Page
    Given navigate to website
    And click on contact us button
    And select subject heading
    And type email
    And type order reference
    And type a message
    When click on submit button
    Then verify success message