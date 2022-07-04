package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Before;
import org.openqa.selenium.By;
import pageObjects.LoginPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class LoginSteps {

    @After(value = "oSistemaExibeAMensagemUsuarioInvalido")
    public void tearDown() throws Exception {

    }

    //Login inválido
    @Quando("eu informar o usuario invalido {string}")
    public void euInformarOUsuarioInvalido(String emailLogin) {
        Na(LoginPage.class).informarCampoEmailLogin(emailLogin);
    }
    @Quando("informar a senha invalida {string}")
    public void informarASenhaInvalida(String senhaLogin) {
        Na(LoginPage.class).informarCampoSenhaLogin(senhaLogin);
    }
    @Quando("clicar no botao login invalido")
    public void clicarNoBotaoLoginInvalido() {
        Na(LoginPage.class).acionarBotaoSubmitLogin();
    }
    @Entao("o sistema exibe a mensagem usuario invalido")
    public void oSistemaExibeAMensagemUsuarioInvalido() throws InterruptedException {
        assertTrue(driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger")).isDisplayed());
    }

    // Login válido

    @Quando("eu informar o usuario {string}")
    public void euInformarOUsuario(String emailLogin) {
        Na(LoginPage.class).informarCampoEmailLogin(emailLogin);
    }
    @Quando("informar a senha {string}")
    public void informarASenha(String senhaLogin) {
        Na(LoginPage.class).informarCampoSenhaLogin(senhaLogin);
    }
    @Quando("clicar no botao login")
    public void clicarNoBotaoLogin() {
        Na(LoginPage.class).acionarBotaoSubmitLogin();
    }
    @Entao("o sistema exibe o usuario logado")
    public void oSistemaExibeOUsuarioLogado() {

        assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).isDisplayed());
    }
}
