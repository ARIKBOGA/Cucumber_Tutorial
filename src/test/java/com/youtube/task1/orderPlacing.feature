# Created by burakarikboga at 4.06.2022
  @RegressionTest
  @SmokeTest
Feature: Smart bear software order placing

  Scenario: Go to website and test Order Function
    Given navigate to website "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx"
    And Enter username: "Tester"
    And Enter password: "test"
    And Click on Login button
    And Click on Order
    And Select "FamilyAlbum" from product, set quantity to "2"
    And Click to "Calculate" button
    And Fill address Info with JavaFaker
    And Click on "visa" radio button
    And Generate card number using JavaFaker
    When Click on "Process"
    Then Verify success message "New order has been successfully added."