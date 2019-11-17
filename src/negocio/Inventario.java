package negocio;

/**
 * Clase de inventario
 *
 * @author Jose
 * @version 1.4
 */
public class Inventario {

    private String nombre, marca, presentacion;
    private double precioUnitario, cantidad, totalValor;

    /**
     * Constructor vacio de la clase cliente
     */
    public Inventario() {

    }

    ;
    /**
     * Constructor con parametro nombre
     * @param nombre 
     */
    public Inventario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con parametros nombre,marca
     *
     * @param nombre
     * @param marca
     */
    public Inventario(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    /**
     * Constructor con parametros nombre, marca, precioUnitario
     *
     * @param nombre
     * @param marca
     * @param precioUnitario
     */
    public Inventario(String nombre, String marca, double precioUnitario) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
    }

    /**
     * Constructor con parametros nombre, marca, precioUnitario, cantidad
     *
     * @param nombre
     * @param marca
     * @param precioUnitario
     * @param cantidad
     */
    public Inventario(String nombre, String marca, double precioUnitario, double cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    /**
     * Constructor con parametros nombre, marca, precioUnitario, cantidad,
     * totalValor
     *
     * @param nombre
     * @param marca
     * @param precioUnitario
     * @param cantidad
     * @param totalValor
     */
    public Inventario(String nombre, String marca, double precioUnitario, double cantidad, double totalValor) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.totalValor = totalValor;
    }

    /**
     * Constructor con parametros nombre, marca, precioUnitario, cantidad,
     * totalValor, presentacion
     *
     * @param nombre
     * @param marca
     * @param precioUnitario
     * @param cantidad
     * @param totalValor
     * @param presentacion
     */
    public Inventario(String nombre, String marca, double precioUnitario, double cantidad, double totalValor, String presentacion) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.totalValor = totalValor;
        this.presentacion = presentacion;
    }

    /**
     * Metodo para obtener el valor del atributo nombre
     *
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
     * Metodo para definir el valor del atributo marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para obtener el valor del atributo
     *
     * @return precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Metodo para definir el valor del atributo precioUnitario
     *
     * @param precioUnitario
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Metodo para obtener el valor del atributo cantidad
     *
     * @return cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Metodo para definir el valor del atributo cantidad
     *
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo para obtener el valor del atributo totalValor
     *
     * @return totalValor
     */
    public double getTotalValor() {
        return totalValor;
    }

    /**
     * Metodo para definir el valor del atributo totalValor
     *
     * @param totalValor
     */
    public void setTotalValor(double totalValor) {
        this.totalValor = totalValor;
    }

    /**
     * Metodo para obtener el valor del atributo presentacion
     *
     * @return presentacion
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * Metodo para definir el valor del atributo presentacion
     *
     * @param presentacion
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

}
