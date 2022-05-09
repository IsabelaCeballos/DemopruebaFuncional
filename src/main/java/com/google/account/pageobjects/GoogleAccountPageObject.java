package com.google.account.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;

@DefaultUrl("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin")

public class GoogleAccountPageObject extends PageObject{

        By txtIngresarUsuario = By.id("identifierId");
        By btnSiguienteUser = By.xpath("//*[@id=\"identifierNext\"]/div/button");
        By txtPassword = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
        By btnSiguientePassword = By.xpath("//*[@id=\"passwordNext\"]/div/button");

        By validacionIngreso = By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]");
        public void ingresarUsuario(){
            getDriver().findElement(txtIngresarUsuario).sendKeys("isaydaniceballosjurado@gmail.com");
        }
        public void siguienteUsername(){
            getDriver().findElement(btnSiguienteUser).click();
        }
        public void ingresarPassword(){
            getDriver().findElement(txtPassword).sendKeys("isaydani0511");
        }
        public void  siguientePassword(){
            getDriver().findElement(btnSiguientePassword).click();
        }
        public void validarIngreso(){
            String texto = getDriver().findElement(validacionIngreso).getText();
            assertEquals(texto,"Hangouts");
        }

}
