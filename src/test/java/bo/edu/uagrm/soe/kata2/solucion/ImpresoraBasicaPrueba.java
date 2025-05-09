package bo.edu.uagrm.soe.kata2.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class ImpresoraBasicaPrueba {

    @Test
    void ImpresoraBasicaPuede(){
        ImpresoraBasica impresoraBasica = new ImpresoraBasica();
        assertDoesNotThrow(impresoraBasica::imprimir);
    }
}
