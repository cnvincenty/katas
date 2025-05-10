package bo.edu.uagrm.soe.kata6.problema;

public interface ProcesamientoPagos {

    void procesarTarjetaCredito(String numeroTarjeta, double monto);

    void procesarPayPal(String correo, double monto);

    void procesarCriptomoneda(String billetera, double monto);
}
