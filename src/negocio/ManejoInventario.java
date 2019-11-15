package negocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joemo
 */
public class ManejoInventario extends Pulpe {

    public ManejoInventario() {
    }

    //Pablo Díaz - se sobreescriben los métodos de la clase Pulpe
    @Override
    public void registrar() {
        this.AgregarInventario();
    }

    @Override
    public void ver() {
        this.MostrarInventario();
    }

    @Override
    public void modificar() {
        this.ModificarInventario();
    }
    @Override
    public void eliminar(){
        this.BorrarInventario();
    }

    /**
     *
     * Metodo que agrega productos al inventario
     *
     */
    public void AgregarInventario() {

        Inventario inventario = new Inventario();
        String resp, nombre, marca, presentacion;
        double precioUnitario, cantidad, totalValor;
        resp = JOptionPane.showInputDialog("Desea agregar un producto al inventario [si/no]");
        do {
            if (resp.equalsIgnoreCase("si")) {
                nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
                inventario.setNombre(nombre);
                marca = JOptionPane.showInputDialog("Digite la marca del producto");
                inventario.setMarca(marca);
                presentacion = JOptionPane.showInputDialog("Digite la presentacion del producto");
                inventario.setPresentacion(presentacion);
                precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio unitario del producto"));
                inventario.setPrecioUnitario(precioUnitario);
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de productos a ingresar"));
                inventario.setCantidad(cantidad);
                totalValor = (cantidad * precioUnitario);
                inventario.setTotalValor(totalValor);
                ManejoDato.InventarioD.add(inventario);

            } else if ((!resp.equalsIgnoreCase("si")) || (!resp.equalsIgnoreCase("no"))) {
                JOptionPane.showMessageDialog(null, "Por favor digite una respuesta valida");
            }
            resp = JOptionPane.showInputDialog("Desea agregar otro producto al inventario [si/no]");
        } while (resp.equalsIgnoreCase("si"));
    }

    /**
     *
     * @param InventarioD
     */
    public void MostrarInventario() {
        String temp = "";
        for (Inventario inventario : ManejoDato.InventarioD) {
            temp = temp + "\n Nombre: " + inventario.getNombre()
                    + "\n Marca: " + inventario.getMarca()
                    + "\n Presenation: " + inventario.getPresentacion()
                    + "\n Cantidad: " + inventario.getCantidad()
                    + "\n Precio unitario: " + inventario.getPrecioUnitario()
                    + "\n Total valor en mercancia: " + inventario.getTotalValor()
                    + "\n----------------------------";
        }
        JOptionPane.showMessageDialog(null, temp);

    }

    public void BorrarInventario() {
        String nombret, marca, presentacion;
        int index;
        nombret = JOptionPane.showInputDialog("Digite el nombre del producto a borrar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a borrar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a borrar");
        for (Inventario inventario : ManejoDato.InventarioD) {
            if (nombret.equalsIgnoreCase(inventario.getNombre()) & (marca.equalsIgnoreCase(inventario.getMarca())) & (presentacion.equalsIgnoreCase(inventario.getPresentacion())));
            index = ManejoDato.InventarioD.lastIndexOf(inventario.getNombre());
            ManejoDato.InventarioD.remove(index);
        }

    }

    public void ModificarInventario() {
        String resp, nombre, marca, presentacion;
        double precioUnitario, cantidad, totalVatlor;
        nombre = JOptionPane.showInputDialog("Digite el nombre del producto a borrar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a borrar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a borrar");
        for (Inventario inventario : ManejoDato.InventarioD) {
            if (nombre.equalsIgnoreCase(inventario.getNombre()) & (marca.equalsIgnoreCase(inventario.getMarca())) & (presentacion.equalsIgnoreCase(inventario.getPresentacion())));

            nombre = JOptionPane.showInputDialog("Digite el nuevo nombre del producto");
            inventario.setNombre(nombre);
            marca = JOptionPane.showInputDialog("Digite la nueva marca del producto");
            inventario.setMarca(marca);
            presentacion = JOptionPane.showInputDialog("Digite la nueva presentacion del producto");
            inventario.setPresentacion(presentacion);
            precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo precio unitario del producto"));
            inventario.setPrecioUnitario(precioUnitario);
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la nueva cantidad de producto a ingresar"));
            inventario.setCantidad(cantidad);
            totalVatlor = (cantidad * precioUnitario);
            inventario.setTotalValor(totalVatlor);
        }
    }

}
