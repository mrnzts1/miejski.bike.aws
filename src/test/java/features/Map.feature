Feature: Map

#  PORTRAIT
  Scenario: User does not accept app conditions

    Given User does not accept app conditions
    Then App is closed

  Scenario: Accepting app conditions and allowing access to location

    Given User accepts app conditions and allows access to location
    Then Map and all elements on the map are displayed

  Scenario: Checking if all positions il legend are displayed

    Given User accepts app conditions and allows access to location
    When User clicks legend button
    Then All positions in legend are displayed

  Scenario: Checking if recording works properly

    Given User accepts app conditions and allows access to location
    When User clicks start recording button


# LANDSCAPE

#  Scenario: Accepting app conditions and allowing access to location - landscape
#
#    Given User accepts app conditions and allows access to location - landscape
#    Then Map and all elements on the map are displayed
#
#  Scenario: Checking if all positions il legend are displayed - landscape
#
#    Given User accepts app conditions and allows access to location - landscape
#    When User clicks legend button
#    Then All positions in legend are displayed
#
#  Scenario: Checking if recording works properly - landscape
#
#    Given User accepts app conditions and allows access to location - landscape
#    When User clicks start recording button
