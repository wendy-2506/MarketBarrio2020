package BEAN;
//OK CON BD
public class Cliente_Persona {
    private int idCliente;
    private String apell;
    private String nomb;
    private String dni;

    public Cliente_Persona() {
    }

    public Cliente_Persona(int idCliente, String apell, String nomb, String dni) {
        this.idCliente = idCliente;
        this.apell = apell;
        this.nomb = nomb;
        this.dni = dni;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }      
    
}