package bo.edu.uagrm.soe.kata3.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class AvionPrueba {

    @Test
    void avionPuede() {
        Avion avion = new Avion();
        assertDoesNotThrow(avion::volar);
    }
}
