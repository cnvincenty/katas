package bo.edu.uagrm.soe.kata1.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class PajaroPrueba {

    @Test
    void pajaroPuede() {
        Pajaro pajaro = new Pajaro();
        assertDoesNotThrow(pajaro::volar);
        assertDoesNotThrow(pajaro::correr);
    }
}
