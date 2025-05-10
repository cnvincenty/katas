package bo.edu.uagrm.soe.kata6.problema;

public class PayPal implements ProcesamientoPagos{

    @Override
    public void procesarTarjetaCredito(String numeroTarjeta, double monto) {
        throw new UnsupportedOperationException("No procesa con Tarjeta de credito");
    }

    @Override
    public void procesarPayPal(String correo, double monto) {
        System.out.println("Procesando por la cuenta: "+correo+", el monto de:" + monto);
    }

    @Override
    public void procesarCriptomoneda(String billetera, double monto) {
        throw new UnsupportedOperationException("No procesa con Cripto moneda");
    }

}
