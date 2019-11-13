package presentacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import negocio.Inventario;
import negocio.ManejoInventario;

public class Menu {

    protected boolean salir = false;
    protected static int op;
    protected static menu m;

    enum menu {
        INVENTARIO,
        VENTAS,
        CLIENTES,
        PEDIDOS
    };

    public Menu() {
    }

    public static int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    /**
     *
     * Metodo para mostrar el menu principal
     *
     */
    //método para invocar el menú 
    public void mostrarMenu() {
        JOptionPane.showMessageDialog(null, "  ***Sistema de administración de "
                + "Pulpería ***", "Bienvenido", INFORMATION_MESSAGE);

        while (!salir) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite la opcion a elegir\n"
                        + "\n1. Inventario"
                        + "\n2. Ventas"
                        + "\n3. Clientes"
                        + "\n4. Pedidos"
                        + "\n5. Salir", "Menú Principal", 0));

                switch (op) {
                    case 1://se llama al menú de inventario
                        m = menu.INVENTARIO;
//                      ManejoInventario inventario=new ManejoInventario();
//                      ArrayList<Inventario> InventarioD = null;
                        SubMenu menuInventario = new SubMenu();
                        menuInventario.mostrarSubMenu();
                        break;
                    case 2://se llama al menú ventas
                        m = menu.VENTAS;
                        SubMenu menuVentas = new SubMenu();
                        menuVentas.mostrarSubMenu();
                        break;
                    case 3://se llama al menú clientes
                        m = menu.CLIENTES;
                        SubMenu menuClientes = new SubMenu();
                        menuClientes.mostrarSubMenu();
                        break;
                    case 4://se llama al menú pedidos
                        m = menu.PEDIDOS;
                        SubMenu menuPedidos = new SubMenu();
                        menuPedidos.mostrarSubMenu();
                        break;
                    case 5:
                        String resp;
                        //valida si realmente desea salir del actual menú
                        resp = JOptionPane.showInputDialog("Esta seguro que desea abandonar esta sección (S/N)? ");
                        if ("S".equalsIgnoreCase(resp)) {
                            JOptionPane.showMessageDialog(null, "Gracias por visitar la pulperia!");
                            salir = true;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Debe elegir una de las 5 Opciones mostradas");

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número");

            }

        }

    }

    public static menu getM() {
        return m;
    }

    public static void setM(menu m) {
        Menu.m = m;
    }
}
