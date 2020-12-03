package BEAN;
public class ProdStock {
    private int idTienda;
    private int idProducto;
    private int stock;

    public ProdStock() {
    }

    public ProdStock(int idTienda, int idProducto, int stock) {
        this.idTienda = idTienda;
        this.idProducto = idProducto;
        this.stock = stock;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
    
}
