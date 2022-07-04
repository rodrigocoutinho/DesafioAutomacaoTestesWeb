package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import org.junit.Assert;
import pageObjects.ResultadosPage;
import pageObjects.TelaInicialPage;

import static utils.Utils.Na;

public class BuscarProdutoSteps {

    @Quando("informo no campo de busca {string}")
    public void informoNoCampoDeBusca(String pesquisa) {
        Na(TelaInicialPage.class).informarCampoPesquisa(pesquisa);
    }
    @Quando("aciono botao pesquisar")
    public void acionoBotaoPesquisar() {
        Na(TelaInicialPage.class).acionarBotaoPesquisar();
    }
    @Entao("o sistema exibe os resultados")
    public void oSistemaExibeOsResultados() {
        Assert.assertTrue(Na(ResultadosPage.class).mostrarQtdResultados());
    }
}
