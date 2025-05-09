package bo.edu.uagrm.soe.kata2.problema;

public class ImpresoraBasica implements Impresora{

    @Override
    public void imprimir() {
       System.out.println("Imprimir documento");
    }

    @Override
    public void escanear() {
       throw new UnsupportedOperationException("Impresora no permite escanear");
    }

    @Override
    public void enviarFax() {
       throw new UnsupportedOperationException("Impresora no permite enviar fax");
    }

}
