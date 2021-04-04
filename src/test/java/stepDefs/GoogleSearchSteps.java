package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleSearchPage;

public class GoogleSearchSteps {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("I have navigated to google search page")
    public void openWebpageGoogle() {
        googleSearchPage.openWebpagegoogle();
    }

    @And("I perform google web page page title verification")
    public void verifyPageTitleGoogle() {
        googleSearchPage.verifyPageTitlegoogle();
    }

    @And("I verify google web page load is done")
    public void verifyPageLoadGoogle() {
        googleSearchPage.verifyPageLoadgoogle();
    }

    @And("I verify search fields and buttons displayed correctly")
    public void verifySearchFieldAndButtons() {
        googleSearchPage.verifyGooglePage();
    }

    @When("I enter a keyword (.*) in the search box")
    public void enterKeyword(String keyword) {
        googleSearchPage.enterKeyword(keyword);
    }

    @When("I click on the Google Search button")
    public void clickSubmit() {
        googleSearchPage.clickSubmit();
    }

    @When("I verify the search results (.*)")
    public void verifySearchResults(String expectedResult) {
        googleSearchPage.verifySearchResults(expectedResult);
    }

    @Then("I close google web page")
    public void closeBrowser() {
        googleSearchPage.closeBrowserGoogle();
    }
}
