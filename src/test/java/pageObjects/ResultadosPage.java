package pageObjects;

import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class ResultadosPage extends BasePage{
    Actions acao = new Actions(driver);

    @Before(value = "acionarBotaoProceedToCheckout")
    public void setUp() throws Exception {
        try {
            wait(3000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement qtdResultados;

    @FindBy(id = "add_to_cart")
    private WebElement botaoAddCar;


    @FindBy(linkText = "Proceed to checkout")
    private WebElement botaoProceedToCheckout;


    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    private WebElement item;

    public boolean mostrarQtdResultados(){
        return qtdResultados.isDisplayed();
    }

    public void acionarBotaoAddCard(){

        botaoAddCar.click();
    }

    public void acionarBotaoProceedToCheckout(){
        botaoProceedToCheckout.click();
    }

    public void selecionarItem(){
        //acao.moveToElement(item).click().perform();
        item.click();
    }
}
