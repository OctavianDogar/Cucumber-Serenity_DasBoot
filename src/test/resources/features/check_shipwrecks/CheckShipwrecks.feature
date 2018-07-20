Feature: Search for shipwrecks
  In order to find out about shipwrecks
  As a human
  I want to be able to look up some info

  Scenario: Looking up info for shipwrecks
    Given the user is on the shipwrecks home page
    When the user looks up the records for shipwrecks
    Then they should see the definition 'A very deep German UBoat'

  Scenario: Looking up info for shipwrecks
    Given the user is on the shipwrecks home page
    When the user looks up the records for shipwrecks
    Then they should see the definition 'British merchant boat in the Red Sea'

  Scenario: Looking up info for 'U869'
    Given the user is on the shipwrecks home page
    When the user looks up the records for shipwrecks
    When the user looks up the records for 'U869'
    Then they should see the wreck condition 'FAIR'

  Scenario: Looking up info for 'Thistlegorm'
    Given the user is on the shipwrecks home page
    When the user looks up the records for shipwrecks
    When the user looks up the records for 'Thistlegorm'
    Then they should see the wreck condition 'GOOD'