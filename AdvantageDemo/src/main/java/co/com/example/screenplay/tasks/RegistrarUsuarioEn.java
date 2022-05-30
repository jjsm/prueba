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
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.example.screenplay.util.utilidadTiempo;

import java.util.List;

import static co.com.example.screenplay.userinterfaces.RegistroUsuarioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class RegistrarUsuarioEn implements Task {

    List<Usuario> usuario;

    protected RegistrarUsuarioEn(List<Usuario> usuario){
        this.usuario=usuario;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
            WaitUntil.the(BTN_PERFILUSUARIO, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BTN_PERFILUSUARIO),
             WaitUntil.the(BTN_REGISTRARUSUARIO, isClickable()).forNoMoreThan(20).seconds(),
            MoveMouse.to(BTN_REGISTRARUSUARIO),
            Click.on(BTN_REGISTRARUSUARIO),
            Enter.theValue(usuario.get(0).getUsername()).into(InputField.withNameOrId(TXT_USERNAME)),
            Enter.theValue(usuario.get(0).getEmail()).into(InputField.withNameOrId(TXT_EMAIL)),
            Enter.theValue(usuario.get(0).getPassword()).into(InputField.withNameOrId(TXT_PASWORD)),
            Enter.theValue(usuario.get(0).getConfirm_password()).into(InputField.withNameOrId(TXT_CONFIRM_PASSWORD)),
            Enter.theValue(usuario.get(0).getFirst_name()).into(InputField.withNameOrId(TXT_FISRT_NAME)),
            Enter.theValue(usuario.get(0).getFirst_name()).into(InputField.withNameOrId(TXT_LAST_NAME)),
            Enter.theValue(usuario.get(0).getPhone_number()).into(InputField.withNameOrId(TXT_PHONE_NUMBER)),
            Click.on(SLT_COUNTRY),
            SelectFromOptions.byVisibleText("Colombia").from(SLT_COUNTRY),
            Enter.theValue(usuario.get(0).getCity()).into(InputField.withNameOrId(TXT_CITY)),
            Enter.theValue(usuario.get(0).getAddress()).into(InputField.withNameOrId(TXT_ADDRES)),
            Enter.theValue(usuario.get(0).getState()).into(InputField.withNameOrId(TXT_STATE)),
            Enter.theValue(usuario.get(0).getPostal_code()).into(InputField.withNameOrId(TXT_POSTAL_CODE)),
            Click.on(InputField.withNameOrId(RBT_AGREE)),
            Click.on(Button.withNameOrId(BTN_REGISTRAR)),
            WaitUntil.the(MESSAGE_USUARIO_REGISTRADO, isClickable()).forNoMoreThan(20).seconds()
    );
    }

    public static Performable Formulario(List<Usuario> usuario) {
        return Instrumented.instanceOf(RegistrarUsuarioEn.class).withProperties(usuario);
    }
}
