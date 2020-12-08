package BEAN;
//OK CON BD
public class Cab_Entrada {
    private int idEntrada;
    private int idEmpReg;
    private String fechReg;
    private int idTienda;
    private int idProveedor;
    private int idEmpMod;
    private String fechMod;
    private int estado;

    public Cab_Entrada() {
    }

    public Cab_Entrada(int idEntrada, int idEmpReg, String fechReg, int idTienda, int idProveedor, int idEmpMod, String fechMod, int estado) {
        this.idEntrada = idEntrada;
        this.idEmpReg = idEmpReg;
        this.fechReg = fechReg;
        this.idTienda = idTienda;
        this.idProveedor = idProveedor;
        this.idEmpMod = idEmpMod;
        this.fechMod = fechMod;
        this.estado = estado;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
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

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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