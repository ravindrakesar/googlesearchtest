@countdown
Feature: To test the google search functionality

  Scenario Outline: Navigate to google search page

    Given I have navigated to google search page
    And I perform google web page page title verification
    And I verify google web page load is done
    When I perform a search using a keyword <Keyword>
    When I verify the search results <ExpectedResult>
    Then I close google web page

    Examples:
    |Keyword                  |ExpectedResult|
    |Batman begins            |Batman Begins - Wikipedia|
    |Tenet                    |Tenet (film) - Wikipedia |