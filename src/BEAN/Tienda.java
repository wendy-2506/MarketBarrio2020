package BEAN;

public class Tienda {
    private int idTienda;
    private String descTienda;
    private String direccion;

    public Tienda() {
    }

    public Tienda(int idTienda, String descTienda, String direccion) {
        this.idTienda = idTienda;
        this.descTienda = descTienda;
        this.direccion = direccion;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getDescTienda() {
        return descTienda;
    }

    public void setDescTienda(String descTienda) {
        this.descTienda = descTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
}