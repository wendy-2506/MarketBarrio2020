package BEAN;
//OK CON BD
public class Cliente {
    private int idCliente;
    private int idTipoCli;
    private int idEmpReg;
    private String fechReg;
    private int idEmpMod;    
    private String fechMod;
    private String correo_elect;
    private String telefono;
    private String direccion;        
    private int estado;

    public Cliente() {
    }

    public Cliente(int idCliente, int idTipoCli, int idEmpReg, String fechReg, int idEmpMod, String fechMod, String correo_elect, String telefono, String direccion, int estado) {
        this.idCliente = idCliente;
        this.idTipoCli = idTipoCli;
        this.idEmpReg = idEmpReg;
        this.fechReg = fechReg;
        this.idEmpMod = idEmpMod;
        this.fechMod = fechMod;
        this.correo_elect = correo_elect;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoCli() {
        return idTipoCli;
    }

    public void setIdTipoCli(int idTipoCli) {
        this.idTipoCli = idTipoCli;
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

    public String getCorreo_elect() {
        return correo_elect;
    }

    public void setCorreo_elect(String correo_elect) {
        this.correo_elect = correo_elect;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }           
    
}