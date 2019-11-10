package negocio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joemo
 */
public class ManejoInventario {
    List<Inventario> InventarioD= new ArrayList<>();
    /**
     * 
     * @param InventarioD
     * @return
     */
    public  ArrayList<Inventario> AgregarInventario(ArrayList<Inventario> InventarioD) {

        Inventario inventario = new Inventario();
        String resp, nombre, marca, presentacion;
        double precioUnitario, cantidad, totalVatlor;
        resp = JOptionPane.showInputDialog("Desea agregar un producto al inventario [si/no]");
        do {
            if (resp.equalsIgnoreCase("si")) {
                nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
                inventario.setNombre(nombre);
                marca = JOptionPane.showInputDialog("Digite la marca del producto");
                inventario.setMarca(marca);
                presentacion= JOptionPane.showInputDialog("Digite la presentacion del producto");
                inventario.setPresentacion(presentacion);
                precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio unitario del producto"));
                inventario.setPrecioUnitario(precioUnitario);
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de productoa ingresar"));
                inventario.setCantidad(cantidad);
                totalVatlor = (cantidad * precioUnitario);
                inventario.setTotalValor(totalVatlor);
                InventarioD.add(inventario);

            } else if ((resp.equalsIgnoreCase("si")) || (resp.equalsIgnoreCase("no"))) {
                JOptionPane.showMessageDialog(null, "Por favor digite una respuesta valida");
            }
            resp = JOptionPane.showInputDialog("Desea agregar otro producto al inventario [si/no]");
        } while (resp.equalsIgnoreCase("si"));
        return InventarioD;
    }

    /**
     *
     * @param InventarioD
     */
    public void MostrarInventario(ArrayList<Inventario> InventarioD) {
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
    
}