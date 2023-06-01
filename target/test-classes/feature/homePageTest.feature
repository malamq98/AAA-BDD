@homePage
Feature: Home Page Test

  @smoke
  Scenario: validate login page
    Given user clicks on log in button
    When user inserts username <' '>
    And user inserts password<' '>
    Then user is in myaccount page

  @smoke
  Scenario: validate HotelsTab
    Given user clicks on hotels Tab
    When valiate the title <'Book your hotel stay with us and save'>
    And user insert the location on destination field <' '>
    Then user select number of room from rooms field <' '>
    And user will select check in date<' '>
    And user will select check out date <' '>
    And user will select number of adults <' '>
    And user will select number of children <' '>
    Then user will click search button

  @smoke
  Scenario: validate Flights Tab
    Given user clicks on flights tab
    Then validate title <'Book your flight with us'>
    When user selects one-way
    Then user inserts location in Flying-from flied <' '>
    And user inserts location in Going - to filed <' '>
    And user selects departind date from Departing filed <' '>
    And user selects number of adults <' '>
    And user selects number of children <' '>
    Then user click search button
