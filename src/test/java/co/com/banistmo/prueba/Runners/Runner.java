package co.com.banistmo.prueba.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//run  que corre la clase
@RunWith(CucumberWithSerenity.class)

//parametros en donde esta ubicado el archivo cucumber, escenarios y epicas y eso,
// y la ubicacion donde se guardaran
@CucumberOptions (
        features = "src/test/resources/features/banistmo.feature",
       tags = "@Escenario",
       glue = "co/com/banistmo/prueba/Stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Runner {
}
