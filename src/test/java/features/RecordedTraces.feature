Feature: Recorded traces

  Scenario: There are no recorded traces

    Given User accepts app conditions and allows access to location
    When User goes to Recorded Traces
    Then User can see information that there are no recorded traces