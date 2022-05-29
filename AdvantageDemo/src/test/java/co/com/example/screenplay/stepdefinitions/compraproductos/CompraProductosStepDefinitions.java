package co.com.example.screenplay.stepdefinitions.compraproductos;



import co.com.example.screenplay.tasks.AñadirProductosAl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CompraProductosStepDefinitions {

    @When("^el usuario selecciona los productos$")
    public void elUsuarioSeleccionaLosProductos()  {
        theActorInTheSpotlight().attemptsTo(AñadirProductosAl.Carrito());
    }

    @And("^realiza el pago$")
    public void realizaElPago()  {
    }

    @Then("^el sistema le informa de su compra exitosamente$")
    public void elSistemaLeInformaDeSuCompraExitosamente()  {
    }



}
