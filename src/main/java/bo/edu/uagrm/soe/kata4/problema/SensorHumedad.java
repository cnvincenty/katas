package bo.edu.uagrm.soe.kata4.problema;

public class SensorHumedad implements Sensor{

    @Override
    public double obtenerTemperatura() {
        throw new UnsupportedOperationException("No obtiene temperatura");
    }

    @Override
    public double obtenerPresion() {
        throw new UnsupportedOperationException("No obtiene presion");
    }

    @Override
    public double obtenerHumedad() {
        return 80.0;
    }

}
