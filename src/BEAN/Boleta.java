package BEAN;
//Gabriel Guzman here
public class Boleta {
    private int idBoleta;
    private int idSerie;
    private String numBol;
    private int idVenta;

    public Boleta() {
    }

    public Boleta(int idBoleta, int idSerie, String numBol, int idVenta) {
        this.idBoleta = idBoleta;
        this.idSerie = idSerie;
        this.numBol = numBol;
        this.idVenta = idVenta;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getNumBol() {
        return numBol;
    }

    public void setNumBol(String numBol) {
        this.numBol = numBol;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
        
}