package co.com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

import static co.com.example.screenplay.userinterfaces.IngresarCarritoPage.*;

public class IngresarProductosAl implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_POPULAR_ITEM),
                Click.on(LBL_PRODUCTO),
                Click.on(LBL_CHANGE_COLOR),
                Enter.theValue("3").into(InputField.withNameOrId(TXT_CANTIDAD)),
                Click.on(Button.withNameOrId(BTN_ADD_CART)),
                MoveMouse.to(BTN_CART),
                Click.on(Button.withNameOrId(BTN_CHECKOUT_CART)),
                Click.on(Button.withNameOrId(BTN_SIGUIENTE_DETALLE)),
                Enter.theValue("mMjs606").into(Button.withNameOrId(TXT_USER_SAFEPAY)),
                Enter.theValue("Jjsm606").into(TXT_PASSWORD_SAFEPAY),
                Click.on(Button.withNameOrId(BTN_PAY_SAFEPAY))
        );

    }
    public static Performable Carrito() {
        return Tasks.instrumented(IngresarProductosAl.class);    }

}
