package bo.edu.uagrm.soe.kata5.problema;

public class Altavoz implements DispositivoInteligente{

    @Override
    public void encender() {
        System.out.println("Enceder altavoz");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar altavoz");
    }

    @Override
    public void conectarWiFi(String ssdi) {
        throw new UnsupportedOperationException("Altavoz no obtenida");
    }

    @Override
    public void reproducirMusica(String tema) {
        System.out.println("Altavoz reproduciendo sonido con el tema: " + tema);
    }

}
