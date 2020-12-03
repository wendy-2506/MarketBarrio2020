package BEAN;
public class Marca {
    private int idMarca;
    private String descMarc;

    public Marca() {
    }

    public Marca(int idMarca, String descMarc) {
        this.idMarca = idMarca;
        this.descMarc = descMarc;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescMarc() {
        return descMarc;
    }

    public void setDescMarc(String descMarc) {
        this.descMarc = descMarc;
    }
    
    
}
