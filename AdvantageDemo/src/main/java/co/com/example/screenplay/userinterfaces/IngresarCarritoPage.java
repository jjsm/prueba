package co.com.example.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarCarritoPage {

    public static final Target LBL_POPULAR_ITEM = Target.the("opcion para seleccionar item populares").located(By.xpath("//a[contains(text(),'POPULAR ITEMS')]"));
    public static final Target  LBL_PRODUCTO = Target.the("opcion para seleccionar item a comprar").located(By.id("details_21"));

    public static final Target  LBL_CHANGE_COLOR = Target.the("opcion para seleccionar color").located(By.xpath("//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[2]"));
    public static final String TXT_CANTIDAD = "quantity";
    public static final String  BTN_ADD_CART= "save_to_cart";

    public static final Target BTN_CART = Target.the("opcion para añadir al carrito").located(By.id("shoppingCartLink"));

    public static final String BTN_CHECKOUT_CART= "checkOutPopUp";
    public static final String BTN_SIGUIENTE_DETALLE = "next_btn";
    public static final String  TXT_USER_SAFEPAY="safepay_username";
    public static final String  TXT_PASSWORD_SAFEPAY ="safepay_password";
    public static final String BTN_PAY_SAFEPAY="pay_now_btn_SAFEPAY";
}
