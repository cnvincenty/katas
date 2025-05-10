package bo.edu.uagrm.soe.kata3.problema;

public class Coche implements Vehiculo{

    @Override
    public void conducir() {
        System.out.println("Puede conducir");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("No puede volar");
    }

    @Override
    public void navegar() {
        throw new UnsupportedOperationException("No puede navegar");
    }

}
