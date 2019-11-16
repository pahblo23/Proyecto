package negocio;

/**
 * Clase de producto
 *
 * @author Pahblo
 * @version 1.4
 */
public class Producto {

    private String nombre, marca;
    private double precio, impuesto;

    /**
     * Constructor vacio de la clase producto
     */
    public Producto() {
    }

    ;
    /**
     * Constructor de la clase producto
     * @param nombre 
     */
    public Producto(String nombre) {
    }

    ;
    /**
     * Constructor de la clase producto
     * @param nombre
     * @param marca 
     */
    public Producto(String nombre, String marca) {
    }

    ;
    /**
     * Constructor de la clase producto
     * @param nombre
     * @param marca
     * @param precio 
     */
    public Producto(String nombre, String marca, double precio) {
    }

    ;
    /**
     * Constructor de la clase producto
     * @param nombre
     * @param marca
     * @param precio
     * @param impuesto 
     */
    public Producto(String nombre, String marca, double precio, double impuesto) {
    }

    ;
    
    /**
     * Metodo para obtener el valor del atributo nombre 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para definir el valor del atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor del atributo marca
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo para definir el valos del atributo marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para obtener el valor del atributo precio
     *
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo para definir el valor del atributo precio
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para obtener el valor del atributo impuesto
     *
     * @return impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * Metodo para definir el valor del atributo impuesto
     *
     * @param impuesto
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Metodo para vender producto
     *
     * @param prod
     */
    public void Vender(Producto prod) {
        prod = prod;
    }
;
}
