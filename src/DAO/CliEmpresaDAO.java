package DAO;

import BEAN.Cliente_Empresa;
import UTIL.dbBean;
import java.sql.*;
import java.util.Vector;
//hace la busqueda por razon social o ruc
public class CliEmpresaDAO {

    public Vector<Cliente_Empresa> ListaItem(boolean sw, String str){
        Vector<Cliente_Empresa> item = new Vector<Cliente_Empresa>();
        dbBean con = new dbBean();
        String sql = "Select * from Cliente_Empresa";
        if(sw == true){
            sql = sql + " WHERE (razon_Social LIKE '"+ str +"%') OR (ruc LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cliente_Empresa cliente = new Cliente_Empresa();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setRazon_Social(resultado.getString(2));
                cliente.setRepresentante(resultado.getString(3));
                cliente.setRuc(resultado.getString(4));
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
    public int procesaItem(Cliente_Empresa c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cliente_Empresa VALUES ('"+ c.getIdCliente() +"', '"+ c.getRazon_Social() +"', '"+ c.getRepresentante() +"', '"+ c.getRuc() +"')";
            System.out.println("EntroClienteEmpresaDAO:" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE cliente_Empresa set razon_Social = '"+ c.getRazon_Social() +"', representante = '"+ c.getRepresentante() +"', ruc = '"+ c.getRuc() +"' where idCliente = '"+ c.getIdCliente() +"'";
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
