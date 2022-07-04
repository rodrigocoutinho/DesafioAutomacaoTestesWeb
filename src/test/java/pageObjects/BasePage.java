package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(linkText = "Sign in")
    private WebElement botaoSignIn;

    @FindBy(linkText = "Cart")
    private WebElement botaoCarrinho;

    @FindBy(name = "search_query")
    private WebElement campoPesquisa;

    @FindBy(name = "submit_search")
    private WebElement botaoPesquisar;

    public void acionarBotaoSignIn(){
        botaoSignIn.click();

    }

    public void acionarBotaoPesquisar(){
        botaoPesquisar.click();
    }

    public void informarCampoPesquisa(String itemPesquisa){
        campoPesquisa.sendKeys(itemPesquisa);
    }

}
