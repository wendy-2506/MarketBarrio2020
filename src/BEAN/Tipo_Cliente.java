package BEAN;
//OK CON BD
public class Tipo_Cliente {
    private int idTipoCli;
    private String descripcion;

    public Tipo_Cliente() {
    }

    public Tipo_Cliente(int idTipoCli, String descripcion) {
        this.idTipoCli = idTipoCli;
        this.descripcion = descripcion;
    }

    public int getIdTipoCli() {
        return idTipoCli;
    }

    public void setIdTipoCli(int idTipoCli) {
        this.idTipoCli = idTipoCli;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
    
}