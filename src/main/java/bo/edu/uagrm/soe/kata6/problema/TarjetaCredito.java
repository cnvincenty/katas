package bo.edu.uagrm.soe.kata6.problema;

public class TarjetaCredito implements ProcesamientoPagos{

    @Override
    public void procesarTarjetaCredito(String numeroTarjeta, double monto) {
        System.out.println("Procesando tarjeta Nro: "+numeroTarjeta+", el monto de:" + monto);
    }

    @Override
    public void procesarPayPal(String correo, double monto) {
        throw new UnsupportedOperationException("No procesa con PayPal");
    }

    @Override
    public void procesarCriptomoneda(String billetera, double monto) {
        throw new UnsupportedOperationException("No procesa con Cripto moneda");
    }

}
