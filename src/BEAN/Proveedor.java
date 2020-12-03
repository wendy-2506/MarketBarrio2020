package BEAN;

public class Proveedor {
    private int idProveedor;
    private String nombProveedor;
    private String direccion;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombProveedor, String direccion) {
        this.idProveedor = idProveedor;
        this.nombProveedor = nombProveedor;
        this.direccion = direccion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombProveedor() {
        return nombProveedor;
    }

    public void setNombProveedor(String nombProveedor) {
        this.nombProveedor = nombProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }   
    
}