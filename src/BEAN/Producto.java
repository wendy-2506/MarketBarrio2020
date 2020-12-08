package BEAN;

public class Producto {
    private int idProducto;
    private String descripcion;
    private int idCategoria;
    private int idMarca;
    private double precioUnit;
    private String unidMed;
    private int estado;

    public Producto() {
    }

    public Producto(int idProducto, String descripcion, int idCategoria, int idMarca, double precioUnit, String unidMed, int estado) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.idCategoria = idCategoria;
        this.idMarca = idMarca;
        this.precioUnit = precioUnit;
        this.unidMed = unidMed;
        this.estado = estado;
    }    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public String getUnidMed() {
        return unidMed;
    }

    public void setUnidMed(String unidMed) {
        this.unidMed = unidMed;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }    
    
}