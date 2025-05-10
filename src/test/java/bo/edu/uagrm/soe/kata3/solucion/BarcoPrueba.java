package bo.edu.uagrm.soe.kata3.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class BarcoPrueba {

    @Test
    void barcoPuede() {
        Barco barco = new Barco();
        assertDoesNotThrow(barco::navegar);
    }
}
