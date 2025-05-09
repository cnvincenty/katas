package bo.edu.uagrm.soe.kata1.problema;

public class Pajaro implements Animal {

    @Override
    public void volar() {
        System.out.println("El pajaro esta volando");
    }

    @Override
    public void nadar() {
        throw new UnsupportedOperationException("El pajaro no puede nadar");
    }

    @Override
    public void correr() {
        System.out.println("El pajaro esta corriendo");
    }

}
