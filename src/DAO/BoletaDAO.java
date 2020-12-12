package DAO;

import BEAN.Boleta;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class BoletaDAO {
    public Vector<Boleta> ListaItem(boolean sw, String str){
        Vector<Boleta> item = new Vector<Boleta>();
        dbBean con = new dbBean();
        String sql = "Select * from boleta";
        if(sw == true){
            sql = sql + " WHERE descripcion LIKE '"+ str +"%'";
        }

        
        try{
            ResultSet resultado = con.execSQL(sql);
            
            while(resultado.next()){
                Boleta boleta = new Boleta();
                boleta.setIdBoleta(resultado.getInt(1));        
                boleta.setIdSerie(resultado.getInt(2));
                boleta.setNumBol(resultado.getString(3));
                boleta.setIdVenta(resultado.getInt(4));
                item.addElement(boleta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Boleta b, String bole){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(bole.equals("insert")){
            sql="INSERT INTO boleta VALUES ('"+ b.getIdBoleta()+"', '"+ b.getIdSerie() +"', '"+ b.getNumBol() +"', '"+ b.getIdVenta() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(bole.equals("update")){
            sql= "UPDATE boleta set idSerie = '"+ b.getIdSerie() +"', NumBol = '"+ b.getNumBol() +"', idVenta = '"+ b.getIdVenta() +"' where id_producto = '"+ b.getIdBoleta() +"'";
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