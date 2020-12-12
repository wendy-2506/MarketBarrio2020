package DAO;

import BEAN.ProdStock;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class ProductoStockDAO {
    public Vector<ProdStock> ListaItem(boolean sw, String str){
        Vector<ProdStock> item = new Vector<ProdStock>();
        dbBean con = new dbBean();
        String sql = "Select * from ProdStock";
        //busca productos segun su descripcion
        if(sw == true){
            sql = sql + " WHERE descripcion LIKE '"+ str +"%'";
        }
        
        try{
            ResultSet resultado = con.execSQL(sql);            
            while(resultado.next()){
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getInt(1));        
                producto.setDescripcion(resultado.getString(2));
                producto.setIdCategoria(resultado.getInt(3));
                producto.setIdMarca(resultado.getInt(4));
                producto.setPrecioUnit(resultado.getDouble(5));
                producto.setUnidMed(resultado.getString(5));
                producto.setEstado(resultado.getInt(5));
                item.addElement(producto);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }  
    
    public int procesaItem(Producto p, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO producto VALUES ('"+ p.getIdProducto()+"', '"+ p.getDescripcion() +"', '"+ p.getIdCategoria() +"', '"+ p.getIdMarca() +"', '"+  p.getPrecioUnit() +"', '"+ p.getUnidMed() +"', '"+ p.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql= "UPDATE producto set descripcion = '"+ p.getDescripcion() +"', idCategoria = '"+ p.getIdCategoria() +"', idMarca = '"+ p.getIdMarca() +"', precioUnit = '"+ p.getPrecioUnit() +"', unidMed = '"+ p.getUnidMed() +"', estado '"+ p.getEstado() +"' where idProducto = '"+ p.getIdProducto() +"'";
       }
       System.out.println("Observando el estado de la sentencia sql: "+sql);

       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
        con.close();
        }
        catch(SQLException e){
        }
          return resultado;
    }
}
