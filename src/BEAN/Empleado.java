package BEAN;

public class Empleado {
    private int idEmpleado;
    private String apellidos;
    private String nombres;
    private int idTipoEmp;
    private int idEmpReg;
    private String fechReg;
    private int idEmpMod;
    private String fechMod;
    private String usr;
    private String pw;
    private int estado;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String apellidos, String nombres, int idTipoEmp, int idEmpReg, String fechReg, int idEmpMod, String fechMod, String usr, String pw, int estado) {
        this.idEmpleado = idEmpleado;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.idTipoEmp = idTipoEmp;
        this.idEmpReg = idEmpReg;
        this.fechReg = fechReg;
        this.idEmpMod = idEmpMod;
        this.fechMod = fechMod;
        this.usr = usr;
        this.pw = pw;
        this.estado = estado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getIdTipoEmp() {
        return idTipoEmp;
    }

    public void setIdTipoEmp(int idTipoEmp) {
        this.idTipoEmp = idTipoEmp;
    }

    public int getIdEmpReg() {
        return idEmpReg;
    }

    public void setIdEmpReg(int idEmpReg) {
        this.idEmpReg = idEmpReg;
    }

    public String getFechReg() {
        return fechReg;
    }

    public void setFechReg(String fechReg) {
        this.fechReg = fechReg;
    }

    public int getIdEmpMod() {
        return idEmpMod;
    }

    public void setIdEmpMod(int idEmpMod) {
        this.idEmpMod = idEmpMod;
    }

    public String getFechMod() {
        return fechMod;
    }

    public void setFechMod(String fechMod) {
        this.fechMod = fechMod;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }       
            
}