package DAO;
//CORREGIR
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
                emp.setIdTipoEmp(resultado.getInt(4));
                emp.setIdEmpReg(resultado.getInt(5));
                emp.setFechReg(resultado.getString(6));
                emp.setIdEmpMod(resultado.getInt(7));
                emp.setFechMod(resultado.getString(8));
                emp.setUsr(resultado.getString(9));
                emp.setPw(resultado.getString(10));
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
            sql="INSERT INTO personal VALUES ('"+ p.getIdEmpleado() +"', '"+ p.getApellidos() +"', '"+ p.getNombres() +"', '"+  p.getNombres() +"', '"+  p.getNombres() +"', '"+  p.getNombres() +"', '"+ p.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE personal set apellidos = '"+ p.getApellidos() +"', nombres = '"+ p.getNombres() +"', estado = '"+ p.getEstado() +"' where id_personal = '"+ p.getIdEmpleado() +"'";
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