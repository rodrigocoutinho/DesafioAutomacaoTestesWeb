package pageObjects;

import io.cucumber.java.After;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class LoginPage extends BasePage{


    @After(value = "acionarBotaoSubmitLogin")
    public void tearDown(){
        try {
            wait(3000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @FindBy(name = "email_create")
    private WebElement campoEmailCriarConta;

    @FindBy(name = "SubmitCreate")
    private WebElement botaoCriarConta;

    @FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li/text()='Invalid email address.']")
    public WebElement mensagemEmailInvalido;

    @FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li/text()='An account using this email address has already been registered. Please enter a valid password or request a new one.'")
    public WebElement mensagemEmailEmUso;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li/text()='Invalid password.']")
    public WebElement mensagemSenhaInvalida;


    @FindBy(name = "email")
    private WebElement campoEmailLogin;

    @FindBy(name = "passwd")
    private WebElement campoSenhaLogin;

    @FindBy(name = "SubmitLogin")
    private WebElement botaoSubmitLogin;


    public void informarCampoEmailCriarConta(String emailCriarConta){
        campoEmailCriarConta.sendKeys(emailCriarConta);
    }

    public void acionarBotaoCriarConta(){
        botaoCriarConta.click();
    }
    public void criarConta(String email){
        informarCampoEmailCriarConta(email);
        acionarBotaoCriarConta();
    }

    public void informarCampoEmailLogin(String email){
        campoEmailLogin.sendKeys(email);
    }

    public void informarCampoSenhaLogin(String senha){
        campoSenhaLogin.sendKeys(senha);
    }

    public void acionarBotaoSubmitLogin(){
        botaoSubmitLogin.click();
    }

    public void realizarLogin(String usuario, String senha){
        informarCampoEmailLogin(usuario);
        informarCampoSenhaLogin(senha);
        acionarBotaoSubmitLogin();
    }
}
