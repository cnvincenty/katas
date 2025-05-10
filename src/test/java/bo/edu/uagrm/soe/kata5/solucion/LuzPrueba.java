package bo.edu.uagrm.soe.kata5.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class LuzPrueba {

    @Test
    void luzPuede() {
        Luz luz = new Luz();
        assertDoesNotThrow(luz::encender);
        assertDoesNotThrow(luz::apagar);
    }

    @Test
    void luzWifiPuede() {
        Luz luz = new Luz();
        assertDoesNotThrow(() -> {
            luz.encender();
            luz.conectarWiFi("RedCasa");
            luz.apagar();
        });
    }
}
