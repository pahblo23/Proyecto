package negocio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joemo
 */
public class ManejoInventario extends Pulpe {

    public ManejoInventario() {
    }

    List<Inventario> InventarioD = new ArrayList<>();

    //Pablo Díaz - se sobreescriben los métodos de la clase Pulpe
    @Override
    public void registrar() {
        this.AgregarInventario();
    }

    @Override
    public void ver() {
        this.MostrarInventario();
    }

    /**
     *
     * @param InventarioD
     * @return
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
                InventarioD.add(inventario);

            } else if ((!resp.equalsIgnoreCase("si")) || (!resp.equalsIgnoreCase("no"))) {
                JOptionPane.showMessageDialog(null, "Por favor digite una respuesta valida");
            }
            resp = JOptionPane.showInputDialog("Desea agregar otro producto al inventario [si/no]");
        } while (resp.equalsIgnoreCase("si"));
//        return InventarioD;
    }

    /**
     *
     * @param InventarioD
     */
    public void MostrarInventario() {
        String temp = "";
        for (Inventario inventario : InventarioD) {
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

    public static ArrayList<Inventario> BorrarInventario(ArrayList<Inventario> InventarioD) {
        String nombret, marca, presentacion;
        int index;
        nombret = JOptionPane.showInputDialog("Digite el nombre del producto a borrar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a borrar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a borrar");
        for (Inventario inventario : InventarioD) {
            if (nombret.equalsIgnoreCase(inventario.getNombre()) & (marca.equalsIgnoreCase(inventario.getMarca())) & (presentacion.equalsIgnoreCase(inventario.getPresentacion())));
            index = InventarioD.lastIndexOf(inventario.getNombre());
            InventarioD.remove(index);
        }
        return InventarioD;
    }

    public static ArrayList<Inventario> ModificararInventario(ArrayList<Inventario> InventarioD) {
        String resp, nombret, marca, presentacion;
        double precioUnitario, cantidad, totalVatlor;
        nombret = JOptionPane.showInputDialog("Digite el nombre del producto a borrar");
        marca = JOptionPane.showInputDialog("Digite la marca del producto a borrar");
        presentacion = JOptionPane.showInputDialog("Digite presentacion del producto a borrar");
        for (Inventario inventario : InventarioD) {
            if (nombret.equalsIgnoreCase(inventario.getNombre()) & (marca.equalsIgnoreCase(inventario.getMarca())) & (presentacion.equalsIgnoreCase(inventario.getPresentacion())));

            nombret = JOptionPane.showInputDialog("Digite el nuevo nombre del producto");
            inventario.setNombre(nombret);
            marca = JOptionPane.showInputDialog("Digite la nueva marca del producto");
            inventario.setMarca(marca);
            presentacion = JOptionPane.showInputDialog("Digite la nueva presentacion del producto");
            inventario.setPresentacion(presentacion);
            precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo precio unitario del producto"));
            inventario.setPrecioUnitario(precioUnitario);
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la nueva cantidad de productoa ingresar"));
            inventario.setCantidad(cantidad);
            totalVatlor = (cantidad * precioUnitario);
            inventario.setTotalValor(totalVatlor);
        }
        return InventarioD;
    }

}
