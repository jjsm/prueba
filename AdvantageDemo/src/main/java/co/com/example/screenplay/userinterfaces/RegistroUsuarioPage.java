package co.com.example.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPage {

    public static final Target BTN_PERFILUSUARIO = Target.the("Boton para ingresar perfil usuario ").located(By.xpath("//*[@id='menuUser']"));
    public static final Target BTN_REGISTRARUSUARIO = Target.the("Boton para iregistrar usuario ").located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));

    public static final Target SLT_COUNTRY = Target.the("campo para ingresar el pais ").located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/sec-view[1]/div[1]/select[1]"));

}
