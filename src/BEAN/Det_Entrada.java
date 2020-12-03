package BEAN;

public class Det_Entrada {
    private int idEntrada;
    private int idProducto;
    private double precio;
    private int cantidad;

    public Det_Entrada() {
    }

    public Det_Entrada(int idEntrada, int idProducto, double precio, int cantidad) {
        this.idEntrada = idEntrada;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }      
            
}