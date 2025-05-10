package bo.edu.uagrm.soe.kata6.problema;

public class Criptomoneda implements ProcesamientoPagos{

    @Override
    public void procesarTarjetaCredito(String numeroTarjeta, double monto) {
        throw new UnsupportedOperationException("No procesa con Tarjeta de credito");
    }

    @Override
    public void procesarPayPal(String correo, double monto) {
        throw new UnsupportedOperationException("No procesa con PayPal");
    }

    @Override
    public void procesarCriptomoneda(String billetera, double monto) {
        System.out.println("Procesando por la billetera: "+billetera+", el monto de:" + monto);
    }

}
