package bo.edu.uagrm.soe.kata6.solucion;

public class TarjetaCredito implements PagoTarjetaCredito{

    @Override
    public void procesarTarjetaCredito(String numeroTarjeta, double monto) {
        System.out.println("Procesando tarjeta Nro: "+numeroTarjeta+", el monto de:" + monto);
    }

}
