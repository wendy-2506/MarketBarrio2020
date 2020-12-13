package DAO;

import BEAN.Cab_Entrada;
import BEAN.Det_Entrada;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class DetEntradaDAO {
    public Vector<Det_Entrada> ListaItem(boolean sw, String str){
        Vector<Det_Entrada> item = new Vector<Det_Entrada>();
        DbBean con = new DbBean();
        String sql = "Select * from Det_Entrada";
        if(sw == true){
            sql = sql + " WHERE (id = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Det_Entrada DetEntrada = new Det_Entrada();
                DetEntrada.setIdEntrada(resultado.getInt(1));
                DetEntrada.setIdProducto(resultado.getInt(2));
                DetEntrada.setPrecio(resultado.getDouble(3));
                DetEntrada.setCantidad(resultado.getInt(4));
            
                item.addElement(DetEntrada);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public int procesaItem(Det_Entrada de, String proc){
       int resultado=0;
       String sql= "";
       DbBean con=new DbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Cab_Entrada VALUES ('"+ de.getIdEntrada() +"', '"+ de.getIdProducto() +"', '"+ de.getPrecio() +"', '"+ de.getCantidad() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Det_Entrada set  IdProducto = '"+ de.getIdProducto() +"', precio = '"+ de.getPrecio() +"', Cantidad '"+ de.getCantidad() +"' , where idEntrada = '"+ de.getIdEntrada() +"'";
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