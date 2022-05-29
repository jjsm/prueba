package co.com.example.screenplay.stepdefinitions.registrarusuario;


import co.com.example.screenplay.exceptions.AssertionsErrors;
import co.com.example.screenplay.interactions.NavigateTo;
import co.com.example.screenplay.models.Usuario;
import co.com.example.screenplay.questions.GetText;
import co.com.example.screenplay.tasks.RegistrarUsuarioEn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import java.util.List;

import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.MESSAGE_USUARIO_REGISTRADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class RegistrarUsuarioStepDefinitions {

    @Given("^El usuario quiere ingresar a la pagina$")
    public void elUsuarioQuiereIngresarALaPagina()  {
        theActorCalled("John").wasAbleTo(NavigateTo.Page());
    }

    @When("^necesita hacer una compra para registrarse$")
    public void necesitaHacerUnaCompraParaRegistrarse(List<Usuario> usuario)  {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuarioEn.Formulario(usuario));
    }

    @Then("^el sistema termina de hacer su registro$")
    public void elSistemaTerminaDeHacerSuRegistro(List<String> message)  {
        theActorInTheSpotlight().should(seeThat(GetText.ofTarget(MESSAGE_USUARIO_REGISTRADO),
                equalTo(message.get(1))).orComplainWith(AssertionsErrors.class, "Usuario no registrado correctamente"));

    }

}
