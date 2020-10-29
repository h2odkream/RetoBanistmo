package com.banistmo.tasks;

import com.banistmo.interactions.ChangeTab;
import com.banistmo.interactions.WaitingtTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userinterfaces.BanistmoHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SearchServicesAndProduct implements Task {

    public SearchServicesAndProduct(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitingtTime.oneMoment(300),
                WaitUntil.the(SERVICES_AND_PRODUCTS, isPresent()),
                Click.on(SERVICES_AND_PRODUCTS)
        );
    }

    public static SearchServicesAndProduct at( ) {
        return instrumented(SearchServicesAndProduct.class);
    }
}
