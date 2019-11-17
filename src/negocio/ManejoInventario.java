package negocio;

import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 * Clase para el manejo de inventario
 * @author jose Morales
 * @version 1.6
 * @see Pulpe
 */
public class ManejoInventario extends Pulpe implements Serializable {

    /**
     * Constructor de manejo de inventario
     */
    public ManejoInventario() {
    }

    /**
     * Pablo Diaz Se sobreescribe el metodo registrar de la clase Pulpe
     * @see Pulpe
     */
    @Override
    public void registrar() {
        this.AgregarInventario();
    }

    /**
     * Pablo Diaz Se sobreescribe el metodo ver de la clase Pulpe
     * @see Pulpe
     */
    @Override
    public void ver() {
        this.MostrarInventario();
    }

    /**
     * Pablo Diaz Se sobreescribe el metodo modificar de la clase Pulpe
     * @see Pulpe
     */
    @Override
    public void modificar() {
        this.ModificarInventario();
    }

    /**
     * Pablo Diaz Se sobreescribe el metodo eliminar de la clase Pulpe
     * @see Pulpe
     */
    @Override
    public void eliminar() {
        this.BorrarInventario();
    }

    /**
     * Metodo para agregar productos al inventario
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
     * Muestra los datos cargados a Inventario
     * Metodo para mostar el inventario
     * @see ManejoDato
     */
    public void MostrarInventario() {
        
        String temp = "";
        for (Inventario inventario : ManejoDato.InventarioD) {
            temp = temp + "\n Nombre: " + inventario.getNombre()
                    + "\n Marca: " + inventario.getMarca()
                    + "\n Presentación: " + inventario.getPresentacion()
                    + "\n Cantidad: " + inventario.getCantidad()
                    + "\n Precio unitario: " + inventario.getPrecioUnitario()
                    + "\n Total valor en mercancia: " + inventario.getTotalValor()
                    + "\n----------------------------";
        }
        JOptionPane.showMessageDialog(null, temp);

    }

    /**
     * Metodo para borrar artículos del inventario segun nombre, marca y
     * presentacion
     * @see ManejoDato
     */
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

    /**
     * Metodo para modificar articulos del inventario segun nombre, marca y
     * presentacion
     * @see ManejoDato
     */
    public void ModificarInventario() {
        String resp, nombre, marca, presentacion;
        double precioUnitario, cantidad, totalVatlor;
        nombre = JOptionPane.showInputDialog("Digite el nombre del producto a modificar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a modificar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a modificar");
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
