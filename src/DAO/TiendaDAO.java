package DAO;

import BEAN.Tienda;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class TiendaDAO {
    public Vector<Tienda> ListaItem(boolean sw, String str){
        Vector<Tienda> item = new Vector<Tienda>();
        dbBean con = new dbBean();
        String sql = "Select * from tienda";
        if(sw == true){
            sql = sql + " WHERE (descTienda LIKE '"+ str +"%') OR (direccion LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Tienda tienda = new Tienda();
                tienda.setIdTienda(resultado.getInt(1));
                tienda.setDescTienda(resultado.getString(2));
                tienda.setDireccion(resultado.getString(3));
                item.addElement(tienda);
            }    
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    
    public int procesaItem(Tienda p, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Tienda VALUES ('"+ p.getIdTienda() +"', '"+ p.getDescTienda() +"', '"+ p.getDireccion() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Tienda set descTienda = '"+ p.getDescTienda() +"', direccion = '"+ p.getDireccion() +"' where idTienda = '"+ p.getIdTienda() +"'";
       }
       System.out.println("Observando el estado de la sentencia sql: "+sql);

       try{
          resultado=con.updateSQL(sql);     //FALLA
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