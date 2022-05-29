package co.com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;
import util.utilidadTiempo;

import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class RegistrarUsuarioEn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        utilidadTiempo.esperar(2);
        actor.attemptsTo(
            MoveMouse.to(BTN_PERFILUSUARIO),
            Click.on(BTN_PERFILUSUARIO),
             WaitUntil.the(BTN_REGISTRARUSUARIO, isClickable()).forNoMoreThan(20).seconds(),
            MoveMouse.to(BTN_REGISTRARUSUARIO),
            Click.on(BTN_REGISTRARUSUARIO),
            Enter.theValue("sangir").into(InputField.withNameOrId("usernameRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("emailRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("passwordRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("confirm_passwordRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("first_nameRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("last_nameRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("phone_numberRegisterPage")),
            Click.on(SLT_COUNTRY),
            WaitUntil.the(SLT_COUNTRY, isNotEmpty()).forNoMoreThan(30).seconds(),
            SelectFromOptions.byVisibleText("Colombia").from(SLT_COUNTRY),
            Enter.theValue("sangir").into(InputField.withNameOrId("cityRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("addressRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("state_/_province_/_regionRegisterPage")),
            Enter.theValue("sangir").into(InputField.withNameOrId("postal_codeRegisterPage")),
            Click.on(InputField.withNameOrId("i_agree"))
    );
    }

    public static Performable Formulario() {
        return Tasks.instrumented(RegistrarUsuarioEn.class);
    }
}
