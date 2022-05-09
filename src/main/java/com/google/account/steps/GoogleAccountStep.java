package com.google.account.steps;
import com.google.account.pageobjects.GoogleAccountPageObject;
import net.thucydides.core.annotations.Step;

public class GoogleAccountStep {
    GoogleAccountPageObject googleAccountPageObject = new GoogleAccountPageObject();

    @Step
    public void abrirNavegador() { googleAccountPageObject.open();}

    @Step
    public void ingresarUsuario(){
        googleAccountPageObject.ingresarUsuario();
    }

    @Step
    public void siguienteUsername(){
        googleAccountPageObject.siguienteUsername();
    }

    @Step
    public void ingresarPassword(){
        googleAccountPageObject.ingresarPassword();
    }

    @Step
    public void siguientePassword() {
        googleAccountPageObject.siguientePassword();
    }

    @Step
    public void validarIngreso() { googleAccountPageObject.validarIngreso(); }


}
