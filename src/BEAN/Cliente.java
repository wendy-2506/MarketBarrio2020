package BEAN;

public class Cliente {
    private int idCliente;
    private int idTipoCliente;
    private String telefono;
    private String direccion;
    private int idEmpReg;
    private String fechReg;
    private int idEmpMod;    
    private String fechMod;
    private int estado;

    public Cliente() {
    }

    public Cliente(int idCliente, int idTipoCliente, String telefono, String direccion, int idEmpReg, String fechReg, int idEmpMod, String fechMod, int estado) {
        this.idCliente = idCliente;
        this.idTipoCliente = idTipoCliente;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idEmpReg = idEmpReg;
        this.fechReg = fechReg;
        this.idEmpMod = idEmpMod;
        this.fechMod = fechMod;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }        
    
}