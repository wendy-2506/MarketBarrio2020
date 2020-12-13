package BEAN;
//OK CON BD
public class Cab_DocVenta {
    private int idVenta;
    private int idCliente;
    private int idEmpReg;
    private String fechVenta;
    private int idEmpMod;
    private String fechMod;
    private int idTipo;
    private int idTienda;
    private int estado;

    public Cab_DocVenta() {
    }

    public Cab_DocVenta(int idVenta, int idCliente, int idEmpReg, String fechVenta, int idEmpMod, String fechMod, int idTipo, int idTienda, int estado) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idEmpReg = idEmpReg;
        this.fechVenta = fechVenta;
        this.idEmpMod = idEmpMod;
        this.fechMod = fechMod;
        this.idTipo = idTipo;
        this.idTienda = idTienda;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpReg() {
        return idEmpReg;
    }

    public void setIdEmpReg(int idEmpReg) {
        this.idEmpReg = idEmpReg;
    }

    public String getFechVenta() {
        return fechVenta;
    }

    public void setFechVenta(String fechVenta) {
        this.fechVenta = fechVenta;
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

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}