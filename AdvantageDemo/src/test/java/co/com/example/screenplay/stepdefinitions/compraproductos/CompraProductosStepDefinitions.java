package co.com.example.screenplay.stepdefinitions.compraproductos;



import co.com.example.screenplay.exceptions.AssertionsErrors;
import co.com.example.screenplay.questions.GetText;
import co.com.example.screenplay.tasks.IngresarProductosAl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static co.com.example.screenplay.userinterfaces.IngresarCarritoPage.LBL_MENSAJE_COMPRA_EXITOSA;
import static co.com.example.screenplay.userinterfaces.IngresarCarritoPage.LBL_MENSAJE_COMPRA_NO_EXITOSA;
import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.MESSAGE_USUARIO_REGISTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class CompraProductosStepDefinitions {

    @When("^el usuario selecciona los productos para pagar$")
    public void elUsuarioSeleccionaLosProductos()  {
        theActorInTheSpotlight().attemptsTo(IngresarProductosAl.Carrito());
    }


    @Then("^el sistema le informa de su compra exitosamente$")
    public void elSistemaLeInformaDeSuCompraExitosamente(List<String> message)  {
        theActorInTheSpotlight().should(seeThat(GetText.ofTarget(LBL_MENSAJE_COMPRA_EXITOSA),
                equalTo(message.get(1))).orComplainWith(AssertionsErrors.class, LBL_MENSAJE_COMPRA_NO_EXITOSA));

    }



}
