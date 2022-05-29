package co.com.example.screenplay.stepdefinitions.registrarusuario;


import co.com.example.screenplay.interactions.NavigateTo;
import co.com.example.screenplay.tasks.RegistrarUsuarioEn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistrarUsuarioStepDefinitions {

    @Given("^El usuario quiere ingresar a la pagina$")
    public void elUsuarioQuiereIngresarALaPagina()  {
        theActorCalled("John").wasAbleTo(NavigateTo.Page());
    }

    @When("^necesita hacer una compra para registrarse$")
    public void necesitaHacerUnaCompraParaRegistrarse()  {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuarioEn.Formulario());
    }

    @Then("^el sistema termina de hacer su registro$")
    public void elSistemaTerminaDeHacerSuRegistro()  {
    }

}
