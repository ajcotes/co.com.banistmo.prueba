package co.com.banistmo.prueba.Stepdefinitions;

import co.com.banistmo.prueba.questions.Answers;
import co.com.banistmo.prueba.task.CartTask;
import co.com.banistmo.prueba.task.EliminatorLibero;
import co.com.banistmo.prueba.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class stepdefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }
    //OPEN NAVEGADOR

    @Given("^Que el usuario ingresa a la pagina$")
    public void queElUsuarioIngresaALaPagina() throws Exception {
        OnStage.theActorCalled("Usuario").wasAbleTo(OpenUp.thePage());
    }


    @When("^Selecciona los productos$")
    public void seleccionaLosProductos() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CartTask.Click());
    }

    @Then("^Verifica y realiza acciones en el carrito$")
    public void verificaYRealizaAccionesEnElCarrito() throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(    EliminatorLibero.Eliminar()
               );
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answers.toThe("400")));

    }

}
