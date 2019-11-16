package negocio;

import java.io.Serializable;

/**
 * Esta es la clase abstracta para la creacion de objetos tipo cliente
 * @author Siviani
 * @version 1.3
 * 
 */
public class Cliente implements Serializable {
    public int id;
    public String nombre;
    public String apellido;
    public String direccion;
    public int telefono;
    /**
     * Constructor vacio de la clase cliente
     */
    public Cliente() {
    }
    /**
     * Constructor con parametros de la clase cliente
     * @param id
     * @param nombre
     * @param apellido
     * @param direccion
     * @param telefono 
     */
    
    public Cliente(int id, String nombre, String apellido, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    /**
     * Metodo para obtener el valor del atributo identidad
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo para definir el valor del atributo identidad
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metodo para obtener el valor del atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para definir el valor del atributo nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para obtener el valor del atributo apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Metodo para definir el valor del atributo apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Metodo para obtener el valor del atributo direccion
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo para definir el valor del atributo direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo para obtener el valor del atributo telefono
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     * Metodo para definir el valor del atributo telefono
     * @param telefono 
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }   
}