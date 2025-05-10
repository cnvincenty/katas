package bo.edu.uagrm.soe.kata5.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class AltavozPrueba {

    @Test
    void altavozPuede() {
        Altavoz altavoz = new Altavoz();
        assertDoesNotThrow(altavoz::encender);
        assertDoesNotThrow(altavoz::apagar);
    }

    @Test
    void altavozReproducirPuede() {
        Altavoz altavoz = new Altavoz();
        assertDoesNotThrow(() -> altavoz.reproducirMusica("CodigoLimpio.mp4"));
    }
}
