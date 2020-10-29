package com.banistmo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"com.banistmo.stepdefinitions"},
        features = {"src/test/resources/com/banistmo/features/search_services_and_products.feature"},

        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class SearchServicesAndProductRunner {

}
