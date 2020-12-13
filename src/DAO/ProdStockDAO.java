package DAO;

import BEAN.ProdStock;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
//busca productos segun su descripcion
public class ProdStockDAO {
    public Vector<ProdStock> ListaItem(boolean sw, String str){
        Vector<ProdStock> item = new Vector<ProdStock>();
        DbBean con = new DbBean();
        String sql = "Select * from ProdStock";
        
        if(sw == true){
            sql = sql + " WHERE idProducto LIKE '"+ str +"%'";
        }
        
        try{
            ResultSet resultado = con.execSQL(sql);            
            while(resultado.next()){
                ProdStock prod = new ProdStock();
                prod.setIdTienda(resultado.getInt(1));        
                prod.setIdProducto(resultado.getInt(2));
                prod.setStock(resultado.getInt(3));
                item.addElement(prod);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }  
    
    public int procesaItem(ProdStock p, String proc){
       int resultado=0;
       String sql= "";
       DbBean con=new DbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO ProdStock VALUES ('"+ p.getIdTienda()+"', '"+ p.getIdProducto() +"', '"+ p.getStock() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql= "UPDATE ProdStock set idTienda = '"+ p.getIdTienda() +"', stock = '"+ p.getStock() +"' where idProducto = '"+ p.getIdProducto() +"'";
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
