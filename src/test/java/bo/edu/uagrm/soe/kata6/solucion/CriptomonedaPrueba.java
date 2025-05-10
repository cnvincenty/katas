package bo.edu.uagrm.soe.kata6.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class CriptomonedaPrueba {

    @Test
    void payPalPuede() {
        Criptomoneda criptomoneda = new Criptomoneda();
        assertDoesNotThrow(() ->  criptomoneda.procesarCriptomoneda("0x000aaa", 1000.0));
    }
}
