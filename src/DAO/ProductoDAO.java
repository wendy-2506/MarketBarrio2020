package DAO;

import BEAN.Producto;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ProductoDAO {
    public Vector<Producto> ListaItem(boolean sw, String str){
        Vector<Producto> item = new Vector<Producto>();
        dbBean con = new dbBean();
        String sql = "Select * from producto";
        //busca productos segun su descripcion
        if(sw == true){
            sql = sql + " WHERE descripcion LIKE '"+ str +"%'";
        }
        
        try{
            ResultSet resultado = con.execSQL(sql);            
            while(resultado.next()){
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getInt(1));        
                producto.setDecripcion(resultado.getString(2));
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
    
//    public int procesaItem(Producto p, String proc){
//       int resultado=0;
//       String sql= "";
//       dbBean con=new dbBean();
//       if(proc.equals("insert")){
//            sql="INSERT INTO producto VALUES ('"+ p.getId_producto()+"', '"+ p.getDescripcion() +"', '"+ p.getTipo() +"', '"+ p.getPrecio() +"', '"+ p.getEstado() +"')";
//            System.out.println("uuuuuuu" + sql);
//       }
//       if(proc.equals("update")){
//            sql= "UPDATE producto set descripcion = '"+ p.getDescripcion() +"', tipo = '"+ p.getTipo() +"', precio = '"+ p.getPrecio() +"', estado '"+ p.getEstado() +"' where id_producto = '"+ p.getId_producto() +"'";
//       }
//       System.out.println("Observando el estado de la sentencia sql: "+sql);
//
//       try{
//          resultado=con.updateSQL(sql);
//        }
//        catch(java.sql.SQLException e){e.printStackTrace();
//        }
//        try{
//        con.close();
//        }
//        catch(SQLException e){
//        }
//          return resultado;
//      }

}