package DAO;

import BEAN.Factura;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class FacturaDAO {
    public Vector<Factura> ListaItem(boolean sw, String str){
        Vector<Factura> item = new Vector<Factura>();
        dbBean con = new dbBean();
        String sql = "Select * from factura";
        if(sw == true){
            sql = sql + " WHERE numFac LIKE '"+ str +"%'";
        }
        
        try{
            ResultSet resultado = con.execSQL(sql);
            
            while(resultado.next()){
                Factura factura = new Factura();
                factura.setIdFactura(resultado.getInt(1));        
                factura.setIdSerie(resultado.getInt(2));
                factura.setNumFac(resultado.getString(3));
                factura.setIdVenta(resultado.getInt(4));
                item.addElement(factura);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Factura f, String bole){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(bole.equals("insert")){
            sql="INSERT INTO factura VALUES ('"+ f.getIdFactura()+"', '"+ f.getIdSerie() +"', '"+ f.getNumFac() +"', '"+ f.getIdVenta() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(bole.equals("update")){
            sql= "UPDATE boleta set idSerie = '"+ f.getIdSerie() +"', numFac = '"+ f.getNumFac() +"', idVenta = '"+ f.getIdVenta() +"' where idFactura = '"+ f.getIdFactura() +"'";
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