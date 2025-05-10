package bo.edu.uagrm.soe.kata4.problema;

public class SensorTemperatura implements Sensor{

    @Override
    public double obtenerTemperatura() {
        return 36.0;
    }

    @Override
    public double obtenerPresion() {
        throw new UnsupportedOperationException("No obtiene presion");
    }

    @Override
    public double obtenerHumedad() {
        throw new UnsupportedOperationException("No obtiene humendad");
    }

}
