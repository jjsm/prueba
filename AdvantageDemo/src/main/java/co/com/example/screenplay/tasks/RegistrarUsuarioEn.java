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
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_USERNAME)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_EMAIL)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_PASWORD)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_CONFIRM_PASSWORD)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_FISRT_NAME)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_LAST_NAME)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_PHONE_NUMBER)),
            Click.on(SLT_COUNTRY),
            SelectFromOptions.byVisibleText("Colombia").from(SLT_COUNTRY),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_CITY)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_ADDRES)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_STATE)),
            Enter.theValue("sangir").into(InputField.withNameOrId(TXT_POSTAL_CODE)),
            Click.on(InputField.withNameOrId(RBT_AGREE)),
            Click.on(InputField.withNameOrId(BTN_REGISTRAR))
    );
    }

    public static Performable Formulario() {
        return Tasks.instrumented(RegistrarUsuarioEn.class);
    }
}
