@countdown
Feature: To test the google search functionality

  Scenario Outline: Navigate to google search page

    Given I have navigated to google search page
    When google web page page title verification
    Then google web page load is done
    When I perform a search using a keyword <Keyword>
    Then I close google web page

    Examples:
    |Keyword|
    |Batman begins|