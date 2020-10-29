package com.banistmo.stepdefinitions;

import com.banistmo.tasks.SearchServicesAndProduct;
import com.banistmo.tasks.Segment;
import com.banistmo.userinterfaces.BanistmoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchServicesAndProductStepDefinition {
    private BanistmoHomePage banistmoHomePage;

    @Given("Karen is looking for a services and products")
    public void karenIsLookingForAServicesAndProducts() {
        theActorCalled("Karen").attemptsTo(
                Open.browserOn(banistmoHomePage),
                SearchServicesAndProduct.at()
        );
    }
    @When("^Karen enters the Banikisd segment$")
    public void addItToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(
        Segment.at()
        );
    }

    @Then("^Karen should validate the product and service rates$")
    public void validateProduct() {

    }




}
