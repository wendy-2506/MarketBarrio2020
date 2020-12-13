package DAO;

import BEAN.Cliente;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
//busca a un cliente por correo, telefono o direccion
public class ClienteDAO {
    public Vector<Cliente> ListaItem(boolean sw, String str){
        Vector<Cliente> item = new Vector<Cliente>();
        dbBean con = new dbBean();
        String sql = "Select * from Cliente";
        if(sw == true){
            sql = sql + " WHERE (correo_elect LIKE '"+ str +"%') OR (direccion LIKE '"+ str +"%') OR (telefono LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cliente clie = new Cliente();
                clie.setIdCliente(resultado.getInt(1));
                clie.setIdTipoCli(resultado.getInt(2));
                clie.setIdEmpReg(resultado.getInt(3));
                clie.setFechReg(resultado.getString(4));
                clie.setIdEmpMod(resultado.getInt(5));
                clie.setFechMod(resultado.getString(6));
                clie.setCorreo_elect(resultado.getString(7));
                clie.setTelefono(resultado.getString(8));
                clie.setDireccion(resultado.getString(9));
                clie.setEstado(resultado.getInt(10));
                item.addElement(clie);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Cliente c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cliente VALUES ('"+ c.getIdCliente() +"', '"+ c.getIdTipoCli() +"', '"+ c.getIdEmpReg() +"', '"+ c.getFechReg() +"', '"+ c.getIdEmpMod() +"', '"+ c.getFechMod() +"', '"+ c.getCorreo_elect() +"', '"+ c.getTelefono() +"', '"+ c.getDireccion() +"', '"+ c.getEstado() +"')";
            System.out.println("Entro ClienteDAO:" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE cliente set idTipoCli = '"+ c.getIdTipoCli() +"', idEmpReg = '"+ c.getIdEmpReg() +"', fechReg = '"+ c.getFechReg() +"', idEmpMod = '"+ c.getIdEmpMod() +"', fechMod = '"+ c.getFechMod() +"', correo_electr = '"+ c.getCorreo_elect() +"', telefono = '"+ c.getTelefono() +"', direccion = '"+ c.getDireccion() +"', estado = '"+ c.getEstado() +"' where idCliente = '"+ c.getIdCliente() +"'";
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
