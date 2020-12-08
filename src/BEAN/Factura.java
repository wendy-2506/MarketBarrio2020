package BEAN;
//OK CON BD
public class Factura {
    private int idFactura;
    private int idSerie;
    private int numFac;
    private int idVenta;

    public Factura() {
    }

    public Factura(int idFactura, int idSerie, int numFac, int idVenta) {
        this.idFactura = idFactura;
        this.idSerie = idSerie;
        this.numFac = numFac;
        this.idVenta = idVenta;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getNumFac() {
        return numFac;
    }

    public void setNumFac(int numFac) {
        this.numFac = numFac;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
}