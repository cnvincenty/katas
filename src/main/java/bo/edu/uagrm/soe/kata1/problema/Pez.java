package bo.edu.uagrm.soe.kata1.problema;

public class Pez implements Animal{

    @Override
    public void volar() {
        throw new UnsupportedOperationException("El pez no puede volar");
    }

    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }

    @Override
    public void correr() {
        throw new UnsupportedOperationException("El pez no puede correr");
    }

}
