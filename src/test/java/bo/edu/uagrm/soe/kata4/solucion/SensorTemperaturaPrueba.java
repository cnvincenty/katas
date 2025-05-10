package bo.edu.uagrm.soe.kata4.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SensorTemperaturaPrueba {

    @Test
    void obtenerTemperatura(){
        SensorTemperatura sensorTemperatura = new SensorTemperatura();
        assertDoesNotThrow(sensorTemperatura::obtenerTemperatura);
        assertEquals(36.0, sensorTemperatura.obtenerTemperatura());
    }
}
