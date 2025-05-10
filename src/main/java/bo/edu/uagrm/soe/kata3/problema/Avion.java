package bo.edu.uagrm.soe.kata3.problema;

public class Avion implements Vehiculo{

    @Override
    public void conducir() {
        throw new UnsupportedOperationException("No puede conducir");
    }

    @Override
    public void volar() {
        System.out.println("Puede volar");
    }

    @Override
    public void navegar() {
        throw new UnsupportedOperationException("No puede navegar");
    }

}
