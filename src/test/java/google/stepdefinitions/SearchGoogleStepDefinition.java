package google.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.GoogleSteps;

public class SearchGoogleStepDefinition {

    @Steps
    private GoogleSteps googleSteps;

    @Given("I want search")
    public void i_need_search(){
        googleSteps.open();
    }

    @When("^I write a text (.*)$")
    public void write_search(String search){
        googleSteps.fill_search(search);
    }

    @Then("I press enter")
    public void search(){
        googleSteps.search();
    }
}
