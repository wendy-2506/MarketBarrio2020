package BEAN;
//OK CON BD
public class Det_DocVenta {
    private int idVenta;
    private int idProducto;
    private double precio;
    private int cantidad;

    public Det_DocVenta() {
    }

    public Det_DocVenta(int idVenta, int idProducto, double precio, int cantidad) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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
