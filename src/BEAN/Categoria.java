package BEAN;

public class Categoria {
    private int idCategoria;
    private String descrip;

    public Categoria() {
    }

    public Categoria(int idCategoria, String descrip) {
        this.idCategoria = idCategoria;
        this.descrip = descrip;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
        
}