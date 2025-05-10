package bo.edu.uagrm.soe.kata6.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class PayPalPrueba {

    @Test
    void payPalPuede() {
        PayPal payPal = new PayPal();
        assertDoesNotThrow(() ->  payPal.procesarPayPal("usuario@correo.com", 1000.0));
    }
}
