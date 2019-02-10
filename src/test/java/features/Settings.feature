Feature: Settings

  Scenario: All the elements are displayed

    Given User accepts app conditions and allows access to location
    When User goes to ‘Settings’
    Then All the elements are displayed

  Scenario: Disable tracking checkbox is selected by default

    Given User accepts app conditions and allows access to location
    When User goes to ‘Settings’
    Then Keep map on toggle is turned off