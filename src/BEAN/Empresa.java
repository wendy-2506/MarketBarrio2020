package BEAN;

public class Empresa {
    private int idCliente;
    private String ruc;
    private String nombreEmpresa;
    private String representante;

    public Empresa() {
    }

    public Empresa(int idCliente, String ruc, String nombreEmpresa, String representante) {
        this.idCliente = idCliente;
        this.ruc = ruc;
        this.nombreEmpresa = nombreEmpresa;
        this.representante = representante;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }    
    
}