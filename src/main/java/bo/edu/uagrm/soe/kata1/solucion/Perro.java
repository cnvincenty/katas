package bo.edu.uagrm.soe.kata1.solucion;

public class Perro implements Nadando, Corriendo{

    @Override
    public void correr() {
        System.out.println("El perro esta nadando");
    }

    @Override
    public void nadar() {
        System.out.println("El perro esta corriendo");
    }

}
