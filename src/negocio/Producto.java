/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Pahblo
 */
public class Producto {
    private String nombre,marca;
    private double precio,impuesto;
    
    public Producto(){};
    public Producto(String nombre){};
    public Producto(String nombre, String marca){};
    public Producto(String nombre, String marca, double precio){};
    public Producto(String nombre, String marca, double precio, double impuesto){};
    
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    public void Vender(Producto prod){
         prod=prod;
    };
}
