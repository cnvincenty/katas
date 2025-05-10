package bo.edu.uagrm.soe.kata5.solucion;

public class Altavoz implements ControlDeEnergia, ReproductorMusica{

    @Override
    public void reproducirMusica(String tema) {
        System.out.println("Altavoz reproduciendo sonido con el tema: "+tema);
    }

    @Override
    public void encender() {
        System.out.println("Enceder altavoz");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar altavoz");
    }

}
