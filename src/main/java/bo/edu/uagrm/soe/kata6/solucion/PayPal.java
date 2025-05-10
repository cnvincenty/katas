package bo.edu.uagrm.soe.kata6.solucion;

public class PayPal implements PagoPayPal{

    @Override
    public void procesarPayPal(String correo, double monto) {
        System.out.println("Procesando por la cuenta: "+correo+", el monto de:" + monto);
    }

}
