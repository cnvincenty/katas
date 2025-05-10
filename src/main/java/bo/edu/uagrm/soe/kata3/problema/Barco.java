package bo.edu.uagrm.soe.kata3.problema;

public class Barco implements Vehiculo{

    @Override
    public void conducir() {
        throw new UnsupportedOperationException("No puede conducir");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("No puede volar");
    }

    @Override
    public void navegar() {
        System.out.println("Puede navegar");
    }

}
