package com.google.accounts.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.google.accounts.features/GoogleAccount.feature",
                 glue =  "com.google.accounts.stepdefinitions",
                 snippets = CucumberOptions.SnippetType.CAMELCASE)

public class GoogleAccountRunner {
}
