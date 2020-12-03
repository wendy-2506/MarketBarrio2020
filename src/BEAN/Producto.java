package BEAN;

public class Producto {
    private int idProducto;
    private String decripcion;
    private int idCategoria;
    private int idMarca;
    private double precioUnit;
    private double unidMed;
    private int estado;

    public Producto() {
    }

    public Producto(int idProducto, String decripcion, int idCategoria, int idMarca, double precioUnit, double unidMed, int estado) {
        this.idProducto = idProducto;
        this.decripcion = decripcion;
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

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
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

    public double getUnidadMed() {
        return unidMed;
    }

    public void setUnidadMed(double unidadMed) {
        this.unidMed = unidadMed;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}