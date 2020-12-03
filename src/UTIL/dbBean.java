package UTIL;
import java.sql.*;
public class dbBean {
  //Conexión: a través del ODBC
    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=MARKETBARRIO";
    String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection dbCon;
    private String Login="sa";
    private String password="123456789";


  public dbBean(){
       connect();
       }

    public boolean connect() {
        try {
            Class.forName(this.dbDriver);
        } catch(java.lang.ClassNotFoundException e) {
            System.out.println("Error en class");
            return false;
        }
        try {
            dbCon = DriverManager.getConnection(this.dbURL, this.Login, this.password);
        } catch(SQLException ex) {
            System.out.println("No se puede conectar al servidor");
            return false;
        }
        return true;
     }


  public void close() throws SQLException{
        dbCon.close();
       }

   public ResultSet execSQL(String sql) throws SQLException{
        Statement s = dbCon.createStatement();
        ResultSet r = s.executeQuery(sql);
        return (r == null) ? null : r;    
  }


  public int updateSQL(String sql) throws SQLException{
        Statement s = dbCon.createStatement();
        int r = s.executeUpdate(sql);
        return (r == 0) ? 0 : r;
  }

}
