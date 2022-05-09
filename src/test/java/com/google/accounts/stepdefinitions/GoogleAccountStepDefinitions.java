package com.google.accounts.stepdefinitions;
import com.google.account.steps.GoogleAccountStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class GoogleAccountStepDefinitions {

    @Steps
    GoogleAccountStep googleAccountStep;
    @Given("user is in the Gmail page")
    public void userIsInTheGmailPage() {
        googleAccountStep.abrirNavegador();
    }
    @When("the user add his credentials and click buttom continue")
    public void theUserAddHisCredentialsAndClickButtomContinue() {
        googleAccountStep.ingresarUsuario();
        googleAccountStep.siguienteUsername();
        googleAccountStep.ingresarPassword();
        googleAccountStep.siguientePassword();
    }
    @Then("user can see his mail")
    public void userCanSeeHisMail() {
        googleAccountStep.validarIngreso();
    }
}
