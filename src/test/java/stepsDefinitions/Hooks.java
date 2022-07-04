package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.LoginPage;

import java.io.IOException;

import static utils.Utils.*;

public class Hooks {
    @Before (value = "not @login")
    public void setUp(){
        acessarSistema();
        Na(LoginPage.class).realizarLogin("email2222@email.com", "12345678");
    }

    @Before(value = "@login")
    public void funcionalidadeLogin(){
        acessarSistema();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        capturarTela(scenario);
        driver.quit();    //fecha o navegador
    }
}
