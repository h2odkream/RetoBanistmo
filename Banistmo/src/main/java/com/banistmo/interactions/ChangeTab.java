package com.banistmo.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ChangeTab implements Interaction {

	private WebDriver driver = null;

	@Override
	public <T extends Actor> void performAs(T elActor) {
		elActor.attemptsTo(	WaitUntil.angularRequestsHaveFinished()	);
		driver = Serenity.getWebdriverManager().getCurrentDriver();

		String pestanhaPrincipal = driver.getWindowHandle();
		ChangeNextTab(pestanhaPrincipal);
	}

	public static ChangeTab ofDepositFees() {
		return Tasks.instrumented(ChangeTab.class);
	}

	
	private void ChangeNextTab(String removeTab) {
		Set<String> nextTab	= driver.getWindowHandles();
		//nextTab.remove(removeTab);
		driver.switchTo().window(nextTab.iterator().next());
	}

}
