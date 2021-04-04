@countdown
Feature: To test the google search functionality

  Scenario: Navigate to google home page and verify fields
    Given I have navigated to google search page
    And I verify search fields and buttons displayed correctly
    Then I close google web page

  Scenario Outline: Navigate to google home page and search a keyword
    Given I have navigated to google search page
    And  I perform google web page page title verification
    And  I verify google web page load is done
    When I enter a keyword <Keyword> in the search box
    When I click on the Google Search button
    When I verify the search results <ExpectedResult>
    Then I close google web page

    Examples:
      | Keyword       | ExpectedResult            |
      | Batman begins | Batman Begins - Wikipedia |
      | Tenet         | Tenet (film) - Wikipedia  |





