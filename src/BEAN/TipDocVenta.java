package BEAN;
public class TipDocVenta {
    private int idTipo;
    private String descrip;

    public TipDocVenta() {
    }

    public TipDocVenta(int idTipo, String descrip) {
        this.idTipo = idTipo;
        this.descrip = descrip;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
