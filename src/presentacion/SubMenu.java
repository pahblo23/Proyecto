package presentacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Inventario;
import negocio.ManejoCliente;
import negocio.ManejoInventario;
import negocio.Pulpe;

public class SubMenu extends Menu {

    ArrayList<Inventario> Inventario;
    public enum OpcionesMenu {
            INVENTARIO,
            VENTAS,
            CLIENTES,
            PEDIDOS
        };

    public SubMenu() {

    }

    public void mostrarSubMenu(OpcionesMenu opcion) {
        while (!salir) {
            try {
                
                 Pulpe iPulperia  = new Pulpe();
                
                switch(opcion){
                    case INVENTARIO:
                        iPulperia = new ManejoInventario();
                            break;
                    case VENTAS:
                        
                        break;
                        
                    case CLIENTES:
                        iPulperia=new ManejoCliente();
                        break;
                            
                    default:
                        iPulperia = new Pulpe();
                        break;
                }
                    
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "\nPor favor "
                        + "digite el número de la sección a la que desea acceder:"
                        + "\n1. Ver Registros"
                        + "\n2. Agregar Registro"
                        + "\n3. Modificar Registro"
                        + "\n4. Eliminar Registro"
                        + "\n5. Salir"));

                switch (op) {
                    case 1://ver registros

                        iPulperia.ver();

                        break;
                    case 2://agregar registros

                        iPulperia.registrar();

                        break;
                    case 3://modificar registros
                        break;
                    case 4://eliminar registros
                        break;
                    case 5:
                        String resp;
                        resp = JOptionPane.showInputDialog("Esta seguro que desea abandonar esta sección (S/N)? ");
                        if ("S".equalsIgnoreCase(resp)) {
                            salir = true;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "\nDebe elegir una de las 5 Opciones mostradas:\n");//aquí podemos meter un excepción
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número");

            }

        }
    }

//    void mostrarSubMenu(ArrayList<Inventario> AgregarInventario) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
