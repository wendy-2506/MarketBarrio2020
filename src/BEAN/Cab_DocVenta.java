package BEAN;
public class Cab_DocVenta {
    private int idVenta;
    private int idCliente;
    private String fechVenta;
    private int idEmpReg;
    private int idTipo;
    private int idTienda;
    private int idEmpMod;
    private String fechMod;
    private int estado;

    public Cab_DocVenta() {
    }

    public Cab_DocVenta(int idVenta, int idCliente, String fechVenta, int idEmpReg, int idTipo, int idTienda, int idEmpMod, String fechMod, int estado) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fechVenta = fechVenta;
        this.idEmpReg = idEmpReg;
        this.idTipo = idTipo;
        this.idTienda = idTienda;
        this.idEmpMod = idEmpMod;
        this.fechMod = fechMod;
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

    public String getFechVenta() {
        return fechVenta;
    }

    public void setFechVenta(String fechVenta) {
        this.fechVenta = fechVenta;
    }

    public int getIdEmpReg() {
        return idEmpReg;
    }

    public void setIdEmpReg(int idEmpReg) {
        this.idEmpReg = idEmpReg;
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
