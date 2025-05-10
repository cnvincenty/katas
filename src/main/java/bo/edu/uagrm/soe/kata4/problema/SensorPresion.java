package bo.edu.uagrm.soe.kata4.problema;

public class SensorPresion implements Sensor{

    @Override
    public double obtenerTemperatura() {
        throw new UnsupportedOperationException("No obtiene temperatura");
    }

    @Override
    public double obtenerPresion() {
        return 120.0;
    }

    @Override
    public double obtenerHumedad() {
        throw new UnsupportedOperationException("No obtiene humedad");
    }

}
