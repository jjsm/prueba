package co.com.example.screenplay.util;

import org.awaitility.Awaitility;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class utilidadTiempo {

	private static Boolean allMessagesProcessed = true;

    public static void esperar(int tiempo) {
            Awaitility.await().forever().pollInterval(tiempo, TimeUnit.SECONDS).until(condicionExitosa());
    }



    public static Callable<Boolean> condicionExitosa() {
            return new Callable<Boolean>() {
                    public Boolean call() throws Exception {
                            return allMessagesProcessed;

                    }
            };
    }

    private utilidadTiempo() {

    }
	
}
