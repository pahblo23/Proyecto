/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class ManejoVenta extends Pulpe {
     public ManejoVenta() {
    }

    //Pablo Díaz - se sobreescriben los métodos de la clase Pulpe
    @Override
    public void registrar() {
        this.AgregarVenta();
    }

    @Override
    public void ver() {
        this.MostrarVenta();
    }

    @Override
    public void modificar() {
        this.ModificarVenta();
    }
    @Override
    public void eliminar(){
        this.BorrarVenta();
    }

    /**
     *
     * Metodo que agrega productos al inventario
     *
     */
    public void AgregarVenta() {

        Venta venta = new Venta();
        String resp, nombre, marca, presentacion;
        double precioUnitario, cantidad, totalValor;
        resp = JOptionPane.showInputDialog("Desea agregar una venta [si/no]");
        do {
            if (resp.equalsIgnoreCase("si")) {
                nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
                venta.setNombre(nombre);
                marca = JOptionPane.showInputDialog("Digite la marca del producto");
                venta.setMarca(marca);
                presentacion = JOptionPane.showInputDialog("Digite la presentacion del producto");
                venta.setPresentacion(presentacion);
                precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio unitario del producto"));
                venta.setPrecioUnitario(precioUnitario);
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de productos a ingresar"));
                venta.setCantidad(cantidad);
                totalValor = (cantidad * precioUnitario);
                venta.setTotalValor(totalValor);
                ManejoDato.VentaD.add(venta);

            } else if ((!resp.equalsIgnoreCase("si")) || (!resp.equalsIgnoreCase("no"))) {
                JOptionPane.showMessageDialog(null, "Por favor digite una respuesta valida");
            }
            resp = JOptionPane.showInputDialog("Desea agregar otro producto a la venta [si/no]");
        } while (resp.equalsIgnoreCase("si"));
    }

    /**
     *
     * @param VentaD
     */
    public void MostrarVenta() {
        String temp = "";
        for (Venta venta : ManejoDato.VentaD) {
            temp = temp + "\n Nombre: " + venta.getNombre()
                    + "\n Marca: " + venta.getMarca()
                    + "\n Presenation: " + venta.getPresentacion()
                    + "\n Cantidad: " + venta.getCantidad()
                    + "\n Precio unitario: " + venta.getPrecioUnitario()
                    + "\n Total valor en mercancia: " + venta.getTotalValor()
                    + "\n----------------------------";
        }
        JOptionPane.showMessageDialog(null, temp);

    }

    public void BorrarVenta() {
        String nombret, marca, presentacion;
        int index;
        nombret = JOptionPane.showInputDialog("Digite el nombre del producto a borrar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a borrar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a borrar");
        for (Venta venta : ManejoDato.VentaD) {
            if (nombret.equalsIgnoreCase(venta.getNombre()) & (marca.equalsIgnoreCase(venta.getMarca())) & (presentacion.equalsIgnoreCase(venta.getPresentacion())));
            index = ManejoDato.VentaD.lastIndexOf(venta.getNombre());
            ManejoDato.VentaD.remove(index);
        }

    }

    public void ModificarVenta() {
        String resp, nombre, marca, presentacion;
        double precioUnitario, cantidad, totalVatlor;
        nombre = JOptionPane.showInputDialog("Digite el nombre del producto a borrar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a borrar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a borrar");
        for (Venta venta : ManejoDato.VentaD) {
            if (nombre.equalsIgnoreCase(venta.getNombre()) & (marca.equalsIgnoreCase(venta.getMarca())) & (presentacion.equalsIgnoreCase(venta.getPresentacion())));

            nombre = JOptionPane.showInputDialog("Digite el nuevo nombre del producto");
            venta.setNombre(nombre);
            marca = JOptionPane.showInputDialog("Digite la nueva marca del producto");
            venta.setMarca(marca);
            presentacion = JOptionPane.showInputDialog("Digite la nueva presentacion del producto");
            venta.setPresentacion(presentacion);
            precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo precio unitario del producto"));
            venta.setPrecioUnitario(precioUnitario);
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la nueva cantidad de producto a ingresar"));
            venta.setCantidad(cantidad);
            totalVatlor = (cantidad * precioUnitario);
            venta.setTotalValor(totalVatlor);
        }
    }
    
}
