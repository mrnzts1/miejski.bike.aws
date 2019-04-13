Feature: AboutUs view

  Scenario: Checking if all team is displayed

    Given User accepts app conditions and allows access to location
    When User goes to About Us view
    Then All team is displayed