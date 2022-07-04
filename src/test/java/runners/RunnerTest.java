package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"},
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
//       tags = "@comprar", // Executa somente o cenário especifico.
        snippets = CucumberOptions.SnippetType.CAMELCASE, //Cria os metodos em camelcase, conforme boas praticas
        monochrome = true,
        dryRun = false   // se true, gera estrutura dos métodos que estão faltando e não executa os tests propriamente
)

public class RunnerTest {
}
