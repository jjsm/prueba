package co.com.example.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/1registrarusuario.feature",
        glue = "co.com.example.screenplay.stepdefinitions")
public class RegistrarUsuarioRunner {
}
