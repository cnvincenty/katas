package bo.edu.uagrm.soe.kata4.solucion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SensorHumedadPrueba {

    @Test
    void obtenerHumedad(){
        SensorHumedad sensorHumedad = new SensorHumedad();
        assertDoesNotThrow(sensorHumedad::obtenerHumedad);
        assertEquals(80.0, sensorHumedad.obtenerHumedad());
    }
}
