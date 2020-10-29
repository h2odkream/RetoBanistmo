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

public class Segment implements Task {

    public Segment(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BANIKIDS),
                Click.on(CHARGES_AND_FARES),
                Scroll.to(DOWNLOAD_PDF),
                Click.on(DOWNLOAD_PDF),
                WaitingtTime.oneMoment(300),
                ChangeTab.ofDepositFees()

        );
    }

    public static Segment at( ) {
        return instrumented(Segment.class);
    }
}
