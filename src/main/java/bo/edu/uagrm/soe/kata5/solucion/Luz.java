package bo.edu.uagrm.soe.kata5.solucion;

public class Luz implements ControlDeEnergia, ConexionWiFi{

    @Override
    public void conectarWiFi(String ssdi) {
        System.out.println("Luz encendida, cuando se conectado a: "+ ssdi);
    }

    @Override
    public void encender() {
        System.out.println("Enceder luz");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar luz");
    }

}
