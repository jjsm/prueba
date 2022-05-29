package co.com.example.screenplay.stepdefinitions.login;


import co.com.example.screenplay.exceptions.AssertionsErrors;
import co.com.example.screenplay.models.Usuario;
import co.com.example.screenplay.questions.GetText;
import co.com.example.screenplay.tasks.IngresarUsuarioAl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.MESSAGE_USUARIO_REGISTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class IngresarUsuarioStepDefinitions {

    @When("^necesita hacer una compra y debe ingresar con sus credenciales$")
    public void necesitaHacerUnaCompraYDebeIngresarConSusCredenciales(List<Usuario> usuario)  {
        theActorInTheSpotlight().attemptsTo(IngresarUsuarioAl.Perfil(usuario));
    }

    @Then("^el sistema valida el ingreso exitoso$")
    public void elSistemaValidaElIngresoExitoso(List<String> message)  {
        theActorInTheSpotlight().should(seeThat(GetText.ofTarget(MESSAGE_USUARIO_REGISTRADO),
                equalTo(message.get(1))).orComplainWith(AssertionsErrors.class, "No se ingreso correctamente"));

    }

}
