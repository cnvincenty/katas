package bo.edu.uagrm.soe.kata6.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class TarjetaCreditoPrueba {

    @Test
    void tarjetaCreditoPuede() {
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        assertDoesNotThrow(() ->  tarjetaCredito.procesarTarjetaCredito("1234-1234-1234-1234", 1000.0));
    }
}
