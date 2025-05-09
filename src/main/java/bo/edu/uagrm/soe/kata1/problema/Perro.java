package bo.edu.uagrm.soe.kata1.problema;

public class Perro implements Animal{

    @Override
    public void volar() {
        throw new UnsupportedOperationException("El perro no puede volar");
    }

    @Override
    public void nadar() {
        System.out.println("El perro esta nadando");
    }

    @Override
    public void correr() {
        System.out.println("El perro esta corriendo");
    }

}
