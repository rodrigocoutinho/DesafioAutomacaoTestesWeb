package pageObjects;

import io.cucumber.java.After;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static utils.Utils.*;

public class CadastrarUsuarioPage extends BasePage{
    Actions acao = new Actions(driver);

    @After(value = "acionarBotaoSubmitAccount")
    public void setUp() throws Exception {
        try {
            wait(3000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @FindBy(name = "customer_firstname")
    private WebElement campoCustomerFirstName;

    @FindBy(name = "customer_lastname")
    private WebElement campoCustomerLastName;

    @FindBy(name = "passwd")
    private WebElement campoSenha;

    @FindBy(xpath = "//*[@id=\"days\"]/option[2]")
    private WebElement campoDays;

    @FindBy(name = "months")
    private WebElement campoMonths;

    @FindBy(name = "years")
    private WebElement campoYears;

    @FindBy(name = "firstname")
    private WebElement campoFirstName;

    @FindBy(name = "lastname")
    private WebElement campoLastName;

    @FindBy(name = "address1")
    private WebElement campoAddress1;

    @FindBy(name = "city")
    private WebElement campoCity;

    @FindBy(name = "postcode")
    private WebElement campoPostcode;

    @FindBy(name = "id_country")
    private WebElement campoIdCountry;

    @FindBy(name = "id_state")
    private WebElement campoidState;

    @FindBy(name = "phone_mobile")
    private WebElement campoPhoneMobile;

    @FindBy(name = "submitAccount")
    private WebElement botaoSubmitAccount;


    public void informarCampoCustomerFirstName(String customerFirstName){
        campoCustomerFirstName.sendKeys(customerFirstName);
    }

    public void informarCampoCustomerLastName(String customerLastName){
        campoCustomerLastName.sendKeys(customerLastName);
    }

    public void informarCampoSenha(String senha){
        campoSenha.sendKeys(senha);
    }

    public void informarCampoDays(){
        campoDays.click();
    }

    public void informarCampoMonths(String months){
        campoMonths.sendKeys(months);
    }

    public void informarCampoYears(){
        Select selectObject = new Select(campoYears);
        selectObject.selectByValue("2000");
    }

    public void informarCampoState(){
        Select selectObject = new Select(campoidState);
        selectObject.selectByValue("1");
    }

    public void informarCampoFirstName(String firsName){
        campoFirstName.sendKeys(firsName);
    }

    public void informarCampoLastName(String lastName){
        campoLastName.sendKeys(lastName);
    }

    public void informarCampoAddress1(String address){
        campoAddress1.sendKeys(address);
    }

    public void informarCampoCity(String city){
        campoCity.sendKeys(city);
    }

    public void informarCampoPostcode(String postCode){
        campoPostcode.sendKeys(postCode);
    }

    public void informarCampoIdCountry(String idCountry){
    campoIdCountry.sendKeys(idCountry);
    }

    public void informarCampoPhoneMobile(String fone){
        campoPhoneMobile.sendKeys(fone);
    }

    public void acionarBotaoSubmitAccount(){
        botaoSubmitAccount.click();
    }

}
