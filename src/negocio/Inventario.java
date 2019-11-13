package negocio;

/**
 *
 * @author Pahblo
 */
//declaración de atributos
public class Inventario {

    private String nombre, marca, presentacion;
    private double precioUnitario, cantidad, totalValor;

    //Constructores
    public Inventario() {
    }

    ;
    public Inventario(String nombre) {
        this.nombre = nombre;
    }

    public Inventario(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public Inventario(String nombre, String marca, double precioUnitario) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
    }

    public Inventario(String nombre, String marca, double precioUnitario, double cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Inventario(String nombre, String marca, double precioUnitario, double cantidad, double totalValor) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.totalValor = totalValor;
    }

    public Inventario(String nombre, String marca, double precioUnitario, double cantidad, double totalValor, String presentacion) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.totalValor = totalValor;
        this.presentacion = presentacion;
    }

    //Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(double totalValor) {
        this.totalValor = totalValor;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

}
