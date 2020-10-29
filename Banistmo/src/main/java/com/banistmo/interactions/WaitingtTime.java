package com.banistmo.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitingtTime implements Interaction {

    private int waitinTime;

    public WaitingtTime(int waitinTime) {
        super();
        this.waitinTime = waitinTime;
    }

    /**
     * It pauses for time.
     * @param waitinTime in milliseconds
     * @return
     */
    public static WaitingtTime oneMoment(int waitinTime) {
        return instrumented(WaitingtTime.class, waitinTime);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(waitinTime);
    }

}
