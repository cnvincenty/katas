package bo.edu.uagrm.soe.kata4.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SensorPresionPrueba {

    @Test
    void obtenerPresion(){
        SensorPresion sensorPresion = new SensorPresion();
        assertDoesNotThrow(sensorPresion::obtenerPresion);
        assertEquals(120.0, sensorPresion.obtenerPresion());
    }
}
