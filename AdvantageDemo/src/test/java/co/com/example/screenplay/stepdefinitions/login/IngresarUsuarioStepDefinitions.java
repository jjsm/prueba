package co.com.example.screenplay.stepdefinitions.login;


import co.com.example.screenplay.exceptions.AssertionsErrors;
import co.com.example.screenplay.models.Usuario;
import co.com.example.screenplay.questions.GetText;
import co.com.example.screenplay.tasks.IngresarUsuarioAl;
import co.com.example.screenplay.tasks.SalirDel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static co.com.example.screenplay.userinterfaces.IngresarCarritoPage.MESSAGE_USUARIO_NO_EXITOSO;
import static co.com.example.screenplay.userinterfaces.IngresarCarritoPage.MESSAGE_USUARIO_NO_INGRESADO_EXITOSO;
import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.MESSAGE_USUARIO_NO_INGRESADO;
import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.MESSAGE_USUARIO_REGISTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class IngresarUsuarioStepDefinitions {

    @When("^necesita hacer una compra y debe ingresar con sus credenciales$")
    public void necesitaHacerUnaCompraYDebeIngresarConSusCredenciales(List<Usuario> usuario)  {
        theActorInTheSpotlight().attemptsTo(IngresarUsuarioAl.Perfil(usuario));
    }
    @And("^salir del sistema$")
    public void salirdelsistema() {
        theActorInTheSpotlight().attemptsTo(SalirDel.Perfil());
    }

    @Then("^el sistema valida el ingreso exitoso$")
    public void elSistemaValidaElIngresoExitoso(List<String> message)  {
        theActorInTheSpotlight().should(seeThat(GetText.ofTarget(MESSAGE_USUARIO_REGISTRADO),
                equalTo(message.get(1))).orComplainWith(AssertionsErrors.class, MESSAGE_USUARIO_NO_INGRESADO));

    }

    @Then("el sistema valida el ingreso no exitoso$")
    public void elSistemaValidaelIngresoNoExitoso(List<String> message) {
        theActorInTheSpotlight().should(seeThat(GetText.ofTarget(MESSAGE_USUARIO_NO_EXITOSO),
                equalTo(message.get(1))).orComplainWith(AssertionsErrors.class, MESSAGE_USUARIO_NO_INGRESADO_EXITOSO));

    }


}
