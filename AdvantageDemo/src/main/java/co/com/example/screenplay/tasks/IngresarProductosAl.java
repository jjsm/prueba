package co.com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.example.screenplay.userinterfaces.IngresarCarritoPage.*;
import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.BTN_PERFILUSUARIO;
import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.SLT_COUNTRY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IngresarProductosAl implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_POPULAR_ITEM),
                Click.on(LBL_PRODUCTO),
                Click.on(LBL_CHANGE_COLOR),
                Click.on(Button.withNameOrId(BTN_ADD_CART)),
                WaitUntil.the(BTN_CART, isClickable()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CART),
                Click.on(Button.withNameOrId(BTN_CHECKOUT_CART)),
                WaitUntil.the(Button.withNameOrId(BTN_SIGUIENTE_DETALLE), isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(Button.withNameOrId(BTN_SIGUIENTE_DETALLE)),
                WaitUntil.the(InputField.withNameOrId(TXT_USER_SAFEPAY), isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("mMjs606").into(InputField.withNameOrId(TXT_USER_SAFEPAY)),
                Enter.theValue("Jjsm606").into(InputField.withNameOrId(TXT_PASSWORD_SAFEPAY)),
                Click.on(Button.withNameOrId(BTN_PAY_SAFEPAY))
        );

    }
    public static Performable Carrito() {
        return Tasks.instrumented(IngresarProductosAl.class);    }

}
