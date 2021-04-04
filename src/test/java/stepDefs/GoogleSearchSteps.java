package stepDefs;

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

    @When("google web page page title verification")
    public void verifyPageTitleGoogle() {
        googleSearchPage.verifyPageTitlegoogle();
    }

    @Then("google web page load is done")
    public void verifyPageLoadGoogle() {
        googleSearchPage.verifyPageLoadgoogle();
    }

    @When("I perform a search using a keyword (.*)")
    public void performGoogleSearch(String keyword) {
        googleSearchPage.performGoogleSearch(keyword);
    }

    @Then("I close google web page")
    public void closeBrowser() {
        googleSearchPage.closeBrowserGoogle();
    }
}
