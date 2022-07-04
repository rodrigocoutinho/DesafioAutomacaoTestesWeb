package stepsDefinitions;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pageObjects.BasePage;
import pageObjects.CarrinhoPage;
import pageObjects.ResultadosPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class ComprarSteps {

    Actions acao = new Actions(driver);
    @Quando("informo no campo de busca compra {string}")
    public void informoNoCampoDeBuscaCompra(String pesquisa) {
        Na(ResultadosPage.class).informarCampoPesquisa(pesquisa);
        Na(ResultadosPage.class).acionarBotaoPesquisar();
    }
    @Quando("posiciono mouse no item")
    public void posicionoMouseNoItem() {
        //acao.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))).click().build().perform();
        Na(ResultadosPage.class).selecionarItem();
    }
    @Quando("aciono botao Add to cart")
    public void acionoBotaoAddToCart() {
        Na(ResultadosPage.class).acionarBotaoAddCard();
    }
    @Quando("aciono botao Proceed to checkout")
    public void acionoBotaoProceedToCheckout() {
        Na(ResultadosPage.class).acionarBotaoProceedToCheckout();
        Na(ResultadosPage.class).acionarBotaoProceedToCheckout();

    }
    @Quando("aciono botao ProcessAddress")
    public void acionoBotaoProcessAddress() {
        Na(CarrinhoPage.class).acionarBotaoProcessAddress();
    }
    @Quando("clico no campo aceitar termo")
    public void clicoNoCampoAceitarTermo() {
        Na(CarrinhoPage.class).informarCampoTermo();

    }
    @Quando("aciono botao Process carrier")
    public void acionoBotaoProcessCarrier() {
        Na(CarrinhoPage.class).acionarBotaoProcessCarrier();

    }
    @Quando("aciono botao Pay card")
    public void acionoBotaoPayCard() {
        Na(CarrinhoPage.class).acionarBotaoPayCard();
    }
    @Quando("aciono botao Confirm order")
    public void acionoBotaoConfirmOrder() {
        Na(CarrinhoPage.class).acionarBotaoConfirmOrder();

    }
    @Então("e exibida mensagem de order complete")
    public void eExibidaMensagemDeOrderComplete() {
        assertTrue(Na(CarrinhoPage.class).orderComplete());

    }
}
