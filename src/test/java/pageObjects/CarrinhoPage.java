package pageObjects;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoPage {

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        try {
            wait(3000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FindBy(linkText = "Proceed to checkout")
    WebElement botaoProceedToCheckout;

    @FindBy(name = "processAddress")
    WebElement botaoProcessAddress;

    @FindBy(name = "cgv")
    WebElement campoTermo;

    @FindBy(name = "processCarrier")
    WebElement botaoProcessCarrier;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    WebElement botaoPayCard;


    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    WebElement botaoConfirmOrder;


    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
    WebElement orderComplete;

    public void acionarBotaoProceedToCheckout(){
        botaoProceedToCheckout.click();

    }

    public void acionarBotaoProcessAddress(){
        botaoProcessAddress.click();
    }

    public void informarCampoTermo(){
        campoTermo.click();

    }

    public void acionarBotaoProcessCarrier(){
        botaoProcessCarrier.click();
    }

    public void acionarBotaoPayCard(){
        botaoPayCard.click();
    }

    public void acionarBotaoConfirmOrder(){
        botaoConfirmOrder.click();
    }

    public boolean orderComplete(){
        return orderComplete.isDisplayed();
    }

}
