package DAO;

import BEAN.Empleado;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class EmpleadoDAO {
    public Vector<Empleado> ListaItem(boolean sw, String str){
        Vector<Empleado> item = new Vector<Empleado>();
        dbBean con = new dbBean();
        String sql = "Select * from empleado";
        if(sw == true){
            sql = sql + " WHERE (apellidos LIKE '"+ str +"%') OR (nombres LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Empleado emp = new Empleado();
                emp.setIdEmpleado(resultado.getInt(1));
                emp.setApellidos(resultado.getString(2));
                emp.setNombres(resultado.getString(3));
                emp.setIdEmpReg(resultado.getInt(4));
                emp.setFechReg(resultado.getString(5));
                emp.setIdEmpMod(resultado.getInt(6));
                emp.setFechMod(resultado.getString(7));
                emp.setUsr(resultado.getString(8));
                emp.setPw(resultado.getString(9));
                emp.setIdTipoEmp(resultado.getInt(10));
                emp.setEstado(resultado.getInt(11));
                item.addElement(emp);
            }    
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Empleado p, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO Empleado VALUES ('"+ p.getIdEmpleado() +"', '"+ p.getApellidos() +"', '"+ p.getNombres() +"', '"+  p.getIdEmpReg() +"', '"+  p.getFechReg() +"', '"+  p.getIdEmpMod() +"', '"+ p.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE Empleado set apellidos = '"+ p.getApellidos() +"', nombres = '"+ p.getNombres() +"', estado = '"+ p.getEstado() +"' where id_personal = '"+ p.getIdEmpleado() +"'";
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