package BEAN;
//OK CON BD
public class Proveedor {
    private int idProveedor;
    private String razon_Soc;
    private String ruc ;
    private String nomb_repre ;
    private String direccion ;
    private String telefono ;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razon_Soc, String ruc, String nomb_repre, String direccion, String telefono) {
        this.idProveedor = idProveedor;
        this.razon_Soc = razon_Soc;
        this.ruc = ruc;
        this.nomb_repre = nomb_repre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazon_Soc() {
        return razon_Soc;
    }

    public void setRazon_Soc(String razon_Soc) {
        this.razon_Soc = razon_Soc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNomb_repre() {
        return nomb_repre;
    }

    public void setNomb_repre(String nomb_repre) {
        this.nomb_repre = nomb_repre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   
    
}