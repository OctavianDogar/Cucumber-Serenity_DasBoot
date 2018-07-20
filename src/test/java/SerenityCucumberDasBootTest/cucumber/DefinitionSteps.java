package SerenityCucumberDasBootTest.cucumber;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import SerenityCucumberDasBootTest.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the shipwrecks home page")
    public void givenTheUserIsOnTheShipwrecksHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the records for shipwrecks")
    public void whenTheUserLooksUpTheDefinitionOf() {
        endUser.starts_search();
    }


    @When("the user looks up the records for 'Thistlegorm'")
    public void whenTheyLookUpTheRecordsForThistlegorm(){
        endUser.search_thistlegorm();
    }

    /////////////////////////

    @Then("they should see the definition '(.*UBoat)'")
    public void they_should_see_the_definition_A_very_deep_German_UBoat(String def) throws Throwable {
        endUser.should_see_definition(def);

    }

    @Then("they should see the definition '(British .* Sea)'")
    public void they_should_see_the_definition_British_merchant_boat_in_the_Red_Sea(String def) throws Throwable {
        endUser.should_see_definition(def);

    }

    @When("the user looks up the records for 'U869'")
    public void the_user_looks_up_the_records_for_U869() throws Throwable {
        endUser.search_u869();
    }

    @Then("they should see the wreck condition '(F.*)'")
    public void they_should_see_the_wreck_condition_FAIR(String cond) throws Throwable {
        endUser.should_see_definition(cond);
    }

    @Then("they should see the wreck condition '(G.*)'")
    public void they_should_see_the_wreck_condition_GOOD(String cond) throws Throwable {
        endUser.should_see_definition(cond);

    }


}
