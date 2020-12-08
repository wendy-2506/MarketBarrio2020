package BEAN;
//OK CON BD
public class Cliente_Empresa {
    private int idCliente;
    private String razon_Social;
    private String representante;
    private String ruc;

    public Cliente_Empresa() {
    }

    public Cliente_Empresa(int idCliente, String razon_Social, String representante, String ruc) {
        this.idCliente = idCliente;
        this.razon_Social = razon_Social;
        this.representante = representante;
        this.ruc = ruc;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazon_Social() {
        return razon_Social;
    }

    public void setRazon_Social(String razon_Social) {
        this.razon_Social = razon_Social;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }  
    
}