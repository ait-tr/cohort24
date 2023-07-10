Feature: HomePage

  @navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome Browser
    When  User opens ilCarro HomePage
    Then User verifies HomePage title
    And User quites browser