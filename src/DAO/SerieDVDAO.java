package DAO;

import BEAN.*;
import UTIL.dbBean;
import java.sql.SQLException;

public class SerieDVDAO {
  public int agregaItem(SerieDV sdv, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       
       if(proc.equals("insert")){
            sql="INSERT INTO SerieDV VALUES ('"+ sdv.getIdSerie() +"', '"+ sdv.getIdEmpReg() +"', '"+ sdv.getFechReg() +"', '"+ sdv.getIdTienda() +"',"
                    + " '"+ sdv.getNumInicio() +"', '"+ sdv.getNumFin() +"', '"+ sdv.getFechCierre() +"', '"+ sdv.getEstado() +"')";
            
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
