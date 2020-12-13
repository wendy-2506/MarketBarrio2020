package DAO;

import BEAN.Cab_Entrada;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class CabEntradaDAO {
    public Vector<CabEntradaDAO> ListaItem(boolean sw, String str){
        Vector<CabEntradaDAO> item = new Vector<CabEntradaDAO>();
        dbBean con = new dbBean();
        String sql = "Select * from Cab_Entrada";
        if(sw == true){
            sql = sql + " WHERE (id = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cab_Entrada CabEntrada = new Cab_Entrada();
                CabEntrada.setIdEmpReg(resultado.getInt(1));
                CabEntrada.setFechReg(resultado.getString(2));
                CabEntrada.setIdTienda(resultado.getInt(3));
                CabEntrada.setIdProveedor(resultado.getInt(4));
                CabEntrada.setIdEmpMod(resultado.getInt(5));
                CabEntrada.setFechMod(resultado.getString(6));
                CabEntrada.setEstado(resultado.getInt(7));
                item.addElement(CabEntrada);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public int procesaItem(Cab_Entrada ce, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Cab_Entrada VALUES ('"+ ce.getIdEntrada() +"', '"+ ce.getIdEmpReg() +"', '"+ ce.getFechReg() +"', '"+ ce.getIdTienda() +"', '"+ ce.getIdProveedor() +"', '"+ ce.getIdEmpMod() +"', '"+ ce.getFechMod() +"', '"+ ce.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Cab_Entrada set  IdEmpReg = '"+ ce.getIdEmpReg() +"', FechReg = '"+ ce.getFechReg() +"', IdTienda '"+ ce.getIdTienda() +"', IdProveedor '"+ ce.getIdProveedor() +"', idEmpMod '"+ ce.getIdEmpMod() +"', FechMod  '"+ ce.getFechMod() +"', Estado '"+ ce.getEstado() +"' , where idEntrada = '"+ ce.getIdEntrada() +"'";
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