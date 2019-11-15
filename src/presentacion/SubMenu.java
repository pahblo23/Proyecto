package presentacion;

import javax.swing.JOptionPane;
import negocio.ManejoCliente;
import negocio.ManejoInventario;
import negocio.Pulpe;

public class SubMenu extends Menu {

    public enum OpcionesMenu {//enum para las opciones del menu principal
            INVENTARIO,
            VENTAS,
            CLIENTES,
            PEDIDOS
        };

    public SubMenu() {

    }

    public void mostrarSubMenu(OpcionesMenu opcion) {
        Pulpe iPulperia  = new Pulpe();
        
        while (!salir) {
            try {
                
                switch(opcion){
                /*este switch maneja la opción seleccionada en el 
                menú principal y crea una instancia de la clase correspondiente*/
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

                switch (op) {//switch q define la acción a ejecutar en el submenú
                    case 1://ver registros
                        iPulperia.ver();
                        break;
                    case 2://agregar registros
                        iPulperia.registrar();
                        break;
                    case 3://modificar registros
                        iPulperia.modificar();
                        break;
                    case 4://eliminar registros
                        iPulperia.eliminar();
                        break;
                    case 5:
                        String resp;
                        resp = JOptionPane.showInputDialog("Esta seguro que desea abandonar esta sección (S/N)? ");
                        if ("S".equalsIgnoreCase(resp)) {
                            salir = true;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "\nDebe elegir una de las 5 Opciones mostradas:\n");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número");

            }

        }
    }

}
