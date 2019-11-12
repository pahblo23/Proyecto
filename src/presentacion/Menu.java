package presentacion;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import negocio.ManejoCliente;

public class Menu {
    boolean salir = false;
    int op;
    public Menu() {
    }
    //método para invocar el menú 
    public void mostrarMenu() {
        JOptionPane.showMessageDialog(null, "  ***Sistema de administración de "
                + "Pulpería ***", "Bienvenido", INFORMATION_MESSAGE);
        while (!salir) {
        try { 
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"\nDigite la opcion a elegir\n"
                    
                    + "\n1. Inventario"
                    + "\n2. Ventas"
                    + "\n3. Clientes"
                    + "\n4. Pedidos"
                    + "\n5. Salir","Menú Principal",0));
            
               
                switch (op) {
                    case 1://se llama al menú de inventario
                        
                        SubMenu menuInventario=new SubMenu();
                        menuInventario.mostrarSubMenu(); 
                        break;
                    case 2://se llama al menú ventas
                       
                        SubMenu menuVentas =new SubMenu();
                        menuVentas.mostrarSubMenu();
                        break;
                    case 3://se llama al menú clientes
                        SubMenu menuClientes= new SubMenu();
                        menuClientes.mostrarSubMenu();
                        
                        break;
                    case 4://se llama al menú pedidos
                        SubMenu menuPedidos= new SubMenu();
                        menuPedidos.mostrarSubMenu();
                       
                        break;
                    case 5:
                         String resp;
                         //valida si realmente desea salir del actual menú
                         resp = JOptionPane.showInputDialog("Esta seguro que desea abandonar esta sección (S/N)? ");
                            if (("S".equals(resp)||("s".equals(resp)))) {
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
}
