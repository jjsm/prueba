package co.com.example.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarCarritoPage {

    public static final Target LBL_POPULAR_ITEM = Target.the("opcion para seleccionar item populares").located(By.xpath("//a[contains(text(),'POPULAR ITEMS')]"));
    public static final Target  LBL_PRODUCTO = Target.the("opcion para seleccionar item a comprar").located(By.xpath("//label[@id='details_21']"));

    public static final Target  LBL_CHANGE_COLOR = Target.the("opcion para seleccionar item a comprar").located(By.xpath("//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[2]"));

}
