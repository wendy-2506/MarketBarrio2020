package DAO;

import BEAN.Cliente_Persona;
import UTIL.DbBean;
import java.sql.*;
import java.util.Vector;
//busca a la persona por nombre y apellido
public class CliPersonaDAO {

    public Vector<Cliente_Persona> ListaItem(boolean sw, String str){
        Vector<Cliente_Persona> item = new Vector<Cliente_Persona>();
        DbBean con = new DbBean();
        String sql = "Select * from cliente_Persona";
        if(sw == true){
            sql = sql + " WHERE (apell LIKE '"+ str +"%') OR (nomb LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cliente_Persona cliente = new Cliente_Persona();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setApell(resultado.getString(2));
                cliente.setNomb(resultado.getString(3));
                cliente.setDni(resultado.getString(4));
                item.addElement(cliente);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    
    public int procesaItem(Cliente_Persona c, String proc){
       int resultado=0;
       String sql= "";
       DbBean con=new DbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cliente_Persona VALUES ('"+ c.getIdCliente() +"', '"+ c.getApell() +"', '"+ c.getNomb() +"', '"+ c.getDni() +"')";
            System.out.println("EntroCleitenPersonaDAO:" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE cliente_Persona set apell = '"+ c.getApell() +"', nomb = '"+ c.getNomb() +"', dni = '"+ c.getDni() +"' where idCliente = '"+ c.getIdCliente() +"'";
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
