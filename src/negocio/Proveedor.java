package negocio;

/**
 *
 * @author Marcela Florez
 */
public class Proveedor {

    private String nombre, agente;
    private int telefono;

    public Proveedor() {
    }

    ;
    public Proveedor(String nombreE) {
        this.nombre = nombreE;
    }

    public Proveedor(String nombreE, String agente) {
        this.nombre = nombreE;
        this.agente = agente;
    }

    public Proveedor(String nombreE, String agente, int telefono) {
        this.agente = agente;
        this.nombre = nombreE;
        this.telefono = telefono;
    }

    //setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreE) {
        this.nombre = nombreE;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
