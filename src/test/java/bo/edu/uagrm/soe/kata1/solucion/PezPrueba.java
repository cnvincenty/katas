package bo.edu.uagrm.soe.kata1.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class PezPrueba {

    @Test
    void pezPuede() {
        Pez pez = new Pez();
        assertDoesNotThrow(pez::nadar);
    }
}
