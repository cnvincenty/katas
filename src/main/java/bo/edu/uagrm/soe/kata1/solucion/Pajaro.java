package bo.edu.uagrm.soe.kata1.solucion;

public class Pajaro implements Volando, Corriendo{

    @Override
    public void correr() {
        System.out.println("El pajaro esta corriendo");
    }

    @Override
    public void volar() {
        System.out.println("El pajaro esta volando");
    }

}
