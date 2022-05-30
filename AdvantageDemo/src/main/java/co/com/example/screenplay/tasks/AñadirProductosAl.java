package co.com.example.screenplay.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.example.screenplay.userinterfaces.AñadirCarritoPage.*;

public class AñadirProductosAl implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_POPULAR_ITEM),
                Click.on(LBL_PRODUCTO),
                Click.on(LBL_CHANGE_COLOR)
        );
/*
        color
        //body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[2]

        cantidad
        //body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[2]/e-sec-plus-minus[1]/div[1]/div[3]
        //body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[2]/e-sec-plus-minus[1]/div[1]/div[3]
        //body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[2]/e-sec-plus-minus[1]/div[1]/div[3]

        //button[contains(text(),'ADD TO CART')]

        mosuse over
                //a[@id='shoppingCartLink']

        //button[@id='checkOutPopUp']



    //button[@id='next_btn']


          input      name="safepay_username  mMjs606 Jjsm606
        input name= safepay_password

        //button[@id='pay_now_btn_SAFEPAY']
*/
    }
    public static Performable Carrito() {
        return Tasks.instrumented(AñadirProductosAl.class);    }

}
