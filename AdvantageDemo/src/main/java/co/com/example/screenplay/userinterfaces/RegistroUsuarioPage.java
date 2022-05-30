package co.com.example.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPage {

    public static final Target BTN_PERFILUSUARIO = Target.the("Boton para ingresar perfil usuario ").located(By.id("menuUserLink"));
    public static final Target BTN_REGISTRARUSUARIO = Target.the("Boton para iregistrar usuario ").located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));

    public static final Target SLT_COUNTRY = Target.the("campo para ingresar el pais ").located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/sec-view[1]/div[1]/select[1]"));

    public static final String TXT_USERNAME ="usernameRegisterPage";
    public static final String  TXT_EMAIL= "emailRegisterPage";
    public static final String  TXT_PASWORD= "passwordRegisterPage";
    public static final String  TXT_CONFIRM_PASSWORD ="confirm_passwordRegisterPage";
    public static final String  TXT_FISRT_NAME ="first_nameRegisterPage";
    public static final String TXT_LAST_NAME ="last_nameRegisterPage";
    public static final String TXT_PHONE_NUMBER = "phone_numberRegisterPage";
    public static final String TXT_CITY = "cityRegisterPage";
    public static final String TXT_ADDRES  = "addressRegisterPage";
    public static final String TXT_STATE ="state_/_province_/_regionRegisterPage";
    public static final String TXT_POSTAL_CODE = "postal_codeRegisterPage";
    public static final String RBT_AGREE = "i_agree";

    public static final String BTN_REGISTRAR= "register_btnundefined";
    public static final Target  MESSAGE_USUARIO_REGISTRADO= Target.the("nombre de usuario registrado").located(By.xpath("//header/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
    public static final String MESSAGE_USUARIO_NO_REGISTRADO="Usuario no registrado correctamente";
    public static final String MESSAGE_USUARIO_NO_INGRESADO= "No se ingreso correctamente";
    public static final String  TXT_USERNAMELOGIN = "username";
    public static final String  TXT_PASSWORDLOGIN= "password";
    public static final String  BTN_LOGIN ="sign_in_btnundefined";


}
