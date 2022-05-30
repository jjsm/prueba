package co.com.example.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.BTN_PERFILUSUARIO;
import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.BTN_SIGNOUT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class SalirDel implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(BTN_PERFILUSUARIO, isClickable()).forNoMoreThan(30).seconds(),
            Click.on(BTN_PERFILUSUARIO),
            WaitUntil.the(BTN_SIGNOUT, isClickable()).forNoMoreThan(30).seconds(),
            Click.on(BTN_SIGNOUT)
    );
    }
    public static Performable Perfil() {
        return Tasks.instrumented(SalirDel.class);    }

}
