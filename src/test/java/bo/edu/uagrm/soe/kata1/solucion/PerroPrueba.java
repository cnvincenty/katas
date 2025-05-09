package bo.edu.uagrm.soe.kata1.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class PerroPrueba {

    @Test
    void perroPuede() {
        Perro perro = new Perro();
        assertDoesNotThrow(perro::nadar);
        assertDoesNotThrow(perro::correr);
    }
}
