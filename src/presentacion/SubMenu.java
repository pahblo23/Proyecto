package presentacion;

import javax.swing.JOptionPane;

public class SubMenu extends Menu {

    public SubMenu() {
    }

    public void mostrarSubMenu() {
        while (!salir) {
            try {
            op=Integer.parseInt(JOptionPane.showInputDialog(null, "\nPor favor "
                    + "digite el número de la sección a la que desea acceder:"
                    + "\n1. Ver Registros"
                    + "\n2. Agregar Registro"
                    + "\n3. Modificar Registro"
                    + "\n4. Eliminar Registro"
                    + "\n5. Salir"));
             
                switch (op) {
                    case 1://ver registros
                        break;
                    case 2://agregar registros
                        break;
                    case 3://modificar registros
                        break;
                    case 4://eliminar registros
                        break;
                    case 5:
                        String resp;
                        resp = JOptionPane.showInputDialog("Esta seguro que desea abandonar esta sección (S/N)? ");
                        if (("S".equals(resp)||("s".equals(resp)))) {
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

}
