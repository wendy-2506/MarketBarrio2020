package DAO;

import BEAN.*;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Det_DocVentaDAO {
     public Vector<Det_DocVenta> ListaItem(boolean sw, String str){
        Vector<Det_DocVenta> item = new Vector<Det_DocVenta>();
        DbBean con = new DbBean();
        String sql = "Select * from det_venta";
        if(sw == true){
            sql = sql + " WHERE (id_venta = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Det_DocVenta detVenta = new Det_DocVenta();
                detVenta.setIdVenta(resultado.getInt(1));
                detVenta.setIdProducto(resultado.getInt(2));
                detVenta.setPrecio(resultado.getDouble(3));
                detVenta.setCantidad(resultado.getInt(4));
                item.addElement(detVenta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public int agregaItem(Det_DocVenta dv, String proc){
       int resultado=0;
       String sql= "";
       DbBean con=new DbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO det_docVenta VALUES ("+ dv.getIdVenta() +", "+ dv.getIdProducto()+", "+ dv.getPrecio()+", "+ dv.getCantidad() +")";
            System.out.println("Sentencia enviada a SQL: "+sql);
       }
       
       //       if(proc.equals("update")){
//            sql="UPDATE det_venta set id_producto  = '"+ dv.getId_producto() +"', precio = '"+ dv.getPrecio() +"', cantidad = '"+ dv.getCantidad() +"' where id_venta = '"+ dv.getId_venta() +"'";
//       }
//       System.out.println("Observando el estado de la sentencia sql: "+sql);
       
       //    public void borraDeta(String idVe){
//       int resultado=0;
//       String sql= "";
//       DbBean con=new DbBean();
//       sql="delete from det_venta  WHERE (id_venta = "+ idVe +")";
//       System.out.println("Del dv "+sql);
//       try{
//          resultado=con.updateSQL(sql);
//        }
//        catch(java.sql.SQLException e){e.printStackTrace();
//        }
//        try{
//            con.close();
//        }catch(SQLException e){
//        }
//        
//    }


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
