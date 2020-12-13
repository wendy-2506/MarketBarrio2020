   package DAO;

import BEAN.*;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class CabDocVentaDAO {
    public Vector<Cab_DocVenta> ListaDocV(boolean sw, String str){
        Vector<Cab_DocVenta> item = new Vector<Cab_DocVenta>();
        dbBean con = new dbBean();
        String sql = "Select * from cab_venta";
        if(sw == true){
            sql = sql + " WHERE (id_cliente = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cab_DocVenta cabVenta = new Cab_DocVenta();
                cabVenta.setIdVenta(resultado.getInt(1));
                cabVenta.setIdCliente(resultado.getInt(2));
                cabVenta.setIdEmpReg(resultado.getInt(3));
                cabVenta.setFechVenta(resultado.getString(4));
                cabVenta.setIdEmpMod(resultado.getInt(5));
                cabVenta.setFechMod(resultado.getString(6));
                cabVenta.setIdTipo(resultado.getInt(7));
                cabVenta.setIdTienda(resultado.getInt(8));
                cabVenta.setEstado(resultado.getInt(9));
                item.addElement(cabVenta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
     public int agregaItem(Cab_DocVenta cv, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cab_docVenta VALUES ('"+ cv.getIdVenta() +"', '"+ cv.getIdCliente() +"', '"+ cv.getIdEmpReg()+"', '"+ cv.getFechVenta()+"',"
                    + " '"+ cv.getIdEmpMod()+"', '"+ cv.getFechMod()+"', '"+ cv.getIdTipo()+"', '"+ cv.getIdTienda()+"', '"+ cv.getEstado() +"')";
            
            System.out.println("Sentencia Enviada a Sql: "+sql);
       } 
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
