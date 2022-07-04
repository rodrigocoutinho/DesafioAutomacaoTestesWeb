package pageObjects;

public class TelaInicialPage extends BasePage{
    public void pesquisarProduto(String itemParaPesquisar){
        informarCampoPesquisa(itemParaPesquisar);
        acionarBotaoPesquisar();

    }
}
