package co.com.example.screenplay.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AñadirProductosAl implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static Performable Carrito() {
        return Tasks.instrumented(AñadirProductosAl.class);    }

}
