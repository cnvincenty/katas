package bo.edu.uagrm.soe.kata6.solucion;

public class Criptomoneda implements PagoCriptomoneda{

    @Override
    public void procesarCriptomoneda(String billetera, double monto) {
        System.out.println("Procesando por la billetera: "+billetera+", el monto de:" + monto);
    }

}
