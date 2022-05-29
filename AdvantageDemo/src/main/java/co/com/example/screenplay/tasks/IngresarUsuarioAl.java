package co.com.example.screenplay.tasks;


import co.com.example.screenplay.models.Usuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class IngresarUsuarioAl implements Task {
    List<Usuario> usuario;

    protected IngresarUsuarioAl(List<Usuario> usuario){
        this.usuario=usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PERFILUSUARIO, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_PERFILUSUARIO),
                Enter.theValue(usuario.get(0).getUsername()).into(InputField.withNameOrId(TXT_USERNAMELOGIN)),
                Enter.theValue(usuario.get(0).getPassword()).into(InputField.withNameOrId(TXT_PASSWORDLOGIN)),
                Click.on(Button.withNameOrId(BTN_LOGIN))
        );

    }
    public static Performable Perfil(List<Usuario> usuario) {
        return Instrumented.instanceOf(IngresarUsuarioAl.class).withProperties(usuario);
    }

}
