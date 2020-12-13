package DAO;

import BEAN.Categoria;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class CategoriaDAO {
    public Vector<Categoria> ListaItem(boolean sw, String str){
        Vector<Categoria> item = new Vector<Categoria>();
        DbBean con = new DbBean();
        String sql = "Select * from categoria";
        if(sw == true){
            sql = sql + " WHERE descrip LIKE '"+ str +"%'";
        }

        
        try{
            ResultSet resultado = con.execSQL(sql);
            
            while(resultado.next()){
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(resultado.getInt(1));        
                categoria.setDescrip(resultado.getString(2));
                item.addElement(categoria);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Categoria c, String cate){
       int resultado=0;
       String sql= "";
       DbBean con=new DbBean();
       if(cate.equals("insert")){
            sql="INSERT INTO categoria VALUES ('"+ c.getIdCategoria()+"', '"+ c.getDescrip();
            System.out.println("uuuuuuu" + sql);
       }
       if(cate.equals("update")){
            sql= "UPDATE categoria set descrip = '"+ c.getDescrip()+"' where idProducto = '"+ c.getIdCategoria() +"'";
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