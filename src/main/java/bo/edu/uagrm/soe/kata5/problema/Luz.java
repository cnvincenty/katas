package bo.edu.uagrm.soe.kata5.problema;

public class Luz implements DispositivoInteligente{

    @Override
    public void encender() {
        System.out.println("Enceder luz");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar luz");
    }

    @Override
    public void conectarWiFi(String ssdi) {
        System.out.println("Luz encendida, cuando conectado a: "+ ssdi);
    }

    @Override
    public void reproducirMusica(String tema) {
        throw new UnsupportedOperationException("Luz no obtenida");
    }

}
