package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class CadastrarUsuarioSteps {

    @After(value = "acionoBotaoCreateAnAcount")
    public void setUp() throws Exception {
        try {
            wait(3000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Quando("informar no campo Email address create acount {string}")
    public void informarNoCampoEmailAddressCreateAcount(String emailConta){
        Na(LoginPage.class).informarCampoEmailCriarConta(emailConta);
    }

    @Quando("aciono botao Create an account")
    public void acionoBotaoCreateAnAccount() {
        Na(LoginPage.class).acionarBotaoCriarConta();
    }

    @Quando("informar no campo lastname {string}")
    public void informarNoCampoLastname(String lastname)  {

        Na(CadastrarUsuarioPage.class).informarCampoCustomerLastName(lastname);
    }
    @Quando("informar no campo firstname {string}")
    public void informarNoCampoFirstname(String firstname) {
        Na(CadastrarUsuarioPage.class).informarCampoCustomerFirstName(firstname);
    }
    @Quando("informar no campo password {string}")
    public void informarNoCampoPassword(String senha) {
        Na(CadastrarUsuarioPage.class).informarCampoSenha(senha);
    }

    @Quando("informar no campo dia de nascimento")
    public void informarNoCampoDiaDeNascimento() {
        Na(CadastrarUsuarioPage.class).informarCampoDays();
    }
    @Quando("informar no campo mes de nascimento {string}")
    public void informarNoCampoMesDeNascimento(String months) {
        Na(CadastrarUsuarioPage.class).informarCampoMonths(months);
    }
    @Quando("informar no campo ano de nascimento")
    public void informarNoCampoAnoDeNascimento() {
        Na(CadastrarUsuarioPage.class).informarCampoYears();
    }

    @Quando("informar no campo address1 {string}")
    public void informarNoCampoAddress1(String address) {
        Na(CadastrarUsuarioPage.class).informarCampoAddress1(address);
    }
    @Quando("informar no campo city {string}")
    public void informarNoCampoCity(String city) {
        Na(CadastrarUsuarioPage.class).informarCampoCity(city);
    }
    @Quando("informar no campo zip {string}")
    public void informarNoCampoZip(String zipcode) {
        Na(CadastrarUsuarioPage.class).informarCampoPostcode(zipcode);
    }
    @Quando("informar no campo country {string}")
    public void informarNoCampoCountry(String idcountry) {
        Na(CadastrarUsuarioPage.class).informarCampoIdCountry(idcountry);
    }

    @Quando("informar no campo state")
    public void informarNoCampoState() {
        Na(CadastrarUsuarioPage.class).informarCampoState();
    }

    @Quando("informar no campo mobile phone {string}")
    public void informarNoCampoMobilePhone(String fone) {
        Na(CadastrarUsuarioPage.class).informarCampoPhoneMobile(fone);
    }
    @Quando("acionar o botao salvar")
    public void acionarOBotaoSalvar() {
        Na(CadastrarUsuarioPage.class).acionarBotaoSubmitAccount();

    }
    @Entao("o sistema cadastra o usuario {string}")
    public void oSistemaCadastraOUsuario(String string) {
        boolean boasvindas = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).isDisplayed();
        assertTrue(boasvindas);

    }


// Email inválido

    @Quando("informo no campo Email address {string}")
    public void informoNoCampoEmailAddress(String email) {
        Na(LoginPage.class).informarCampoEmailCriarConta(email);
    }
    @Quando("aciono botao Create an account invalido")
    public void acionoBotaoCreateAnAccountInvalido() {
        Na(LoginPage.class).acionarBotaoCriarConta();
    }
    @Entao("o sistema exibe mensagem de erro")
    public void oSistemaExibeMensagemDeErro() {
        assertTrue(Na(LoginPage.class).mensagemSenhaInvalida.isDisplayed());
    }
}
