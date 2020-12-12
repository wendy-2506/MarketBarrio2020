package DAO;

import BEAN.Proveedor;
import UTIL.dbBean;
import java.sql.*;
import java.util.Vector;

public class ProveedorDAO {

    public Vector<Proveedor> ListaItem(boolean sw, String str){
        Vector<Proveedor> item = new Vector<Proveedor>();
        dbBean con = new dbBean();
        String sql = "Select * from Proveedor";
        if(sw == true){
            sql = sql + " WHERE (razon_Soc LIKE '"+ str +"%') OR (nomb_repre LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(resultado.getInt(1));
                proveedor.setRazon_Soc(resultado.getString(2));
                proveedor.setRuc(resultado.getString(3));
                proveedor.setNomb_repre(resultado.getString(4));
                proveedor.setDireccion(resultado.getString(5));
                proveedor.setTelefono(resultado.getString(6));
                item.addElement(proveedor);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Proveedor p, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO proveedor VALUES ('"+ p.getIdProveedor() +"', '"+ p.getRazon_Soc() +"', '"+ p.getRuc() +"', '"+ p.getNomb_repre() + "', '"+ p.getDireccion() + "', '"+ p.getTelefono() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE proveedor set razon_Soc = '"+ p.getRazon_Soc() +"', ruc = '"+ p.getRuc() +"', nomb_repre = '"+ p.getNomb_repre() + "', direccion = '"+ p.getDireccion() + "', telefono = '"+ p.getTelefono() + "' where idProveedor = '"+ p.getIdProveedor() +"'";
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
