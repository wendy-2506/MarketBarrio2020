package BEAN;
public class SerieDV {
    private int idSerie;
    private int idEmpReg;
    private String fechReg;
    private int idTienda;
    private int numInicio;
    private int numFin;
    private String fechCierre;
    private int estado;

    public SerieDV() {
    }

    public SerieDV(int idSerie, int idEmpReg, String fechReg, int idTienda, int numInicio, int numFin, String fechCierre, int estado) {
        this.idSerie = idSerie;
        this.idEmpReg = idEmpReg;
        this.fechReg = fechReg;
        this.idTienda = idTienda;
        this.numInicio = numInicio;
        this.numFin = numFin;
        this.fechCierre = fechCierre;
        this.estado = estado;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
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

    public int getNumInicio() {
        return numInicio;
    }

    public void setNumInicio(int numInicio) {
        this.numInicio = numInicio;
    }

    public int getNumFin() {
        return numFin;
    }

    public void setNumFin(int numFin) {
        this.numFin = numFin;
    }

    public String getFechCierre() {
        return fechCierre;
    }

    public void setFechCierre(String fechCierre) {
        this.fechCierre = fechCierre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
