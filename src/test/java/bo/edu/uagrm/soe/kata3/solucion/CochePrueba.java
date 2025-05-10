package bo.edu.uagrm.soe.kata3.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class CochePrueba {

    @Test
    void cochePuede() {
        Coche coche = new Coche();
        assertDoesNotThrow(coche::conducir);
    }
}
