package negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcela Florez
 */
public class ManejoProveedor extends Pulpe {

    public ManejoProveedor() {

    }

    //Pablo Díaz - se sobreescriben los métodos de la clase Pulpe
    @Override
    public void registrar() {
        this.agregarProveedor();
    }

    @Override
    public void ver() {
        this.MostrarProveedor();
    }

    @Override
    public void modificar() {
        this.modificarProveedor();
    }

    @Override
    public void eliminar() {
        this.eliminarProveedor();
    }

    public void MostrarProveedor() {
        String temp = "";

        for (int i = 0; i < ManejoDato.Proveedores.size(); i++) {
            temp = temp + "Proveedor" + (i + 1) + "  "
                    + "\n Nombre: " + ManejoDato.Proveedores.get(i).getNombre() + "  "
                    + "\n agente: " + ManejoDato.Proveedores.get(i).getAgente() + "  "
                    + "\n Telefono: " + ManejoDato.Proveedores.get(i).getTelefono()
                    + "\n----------------------------";
        }
        JOptionPane.showMessageDialog(null, temp);

    }

    public void agregarProveedor() {
        int telefono = 0;
        for (int i = 0; i < 1; i++) {
            telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono de la empresa"));
            if (!ManejoDato.Proveedores.isEmpty()) {
                for (Proveedor Proveedore : ManejoDato.Proveedores) {
                    if (ManejoDato.Proveedores.get(i).getTelefono() == telefono) {
                        JOptionPane.showMessageDialog(null, "El numero de telefono ya existe, ingrese otra");
                        i--;
                    }
                }
            }
        }
        String nombreE = JOptionPane.showInputDialog("Ingrese el nombre de la empresa");

        String agente = JOptionPane.showInputDialog("Ingrese el nombre del agente");

        Proveedor Primer = new Proveedor(nombreE, agente, telefono);
        ManejoDato.Proveedores.add(Primer);
        JOptionPane.showMessageDialog(null, "Se agregó exitosamente el Proveedor");

    }

    public void modificarProveedor() {
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono de la empresa que desea modificar"));
        for (int i = 0; i < ManejoDato.Proveedores.size(); i++) {
            if (ManejoDato.Proveedores.get(i).getTelefono() == telefono) {
                Proveedor Primer = new Proveedor();
                Primer = encontrarP(telefono);
                int telefonoC = (int) Primer.getTelefono();
                String nombreE = JOptionPane.showInputDialog("Ingrese el nombre de la empresa", Primer.getNombre());
                String agente = JOptionPane.showInputDialog("Ingrese el nombre de la empresa", Primer.getAgente());
                Proveedor modiProveedor = new Proveedor(nombreE, agente,telefonoC);
                for (int j = 0; j < ManejoDato.Proveedores.size(); j++) {
                    if (Primer.getTelefono() == ManejoDato.Proveedores.get(j).getTelefono()) {
                        ManejoDato.Proveedores.get(j).setNombre(modiProveedor.getNombre());
                        ManejoDato.Proveedores.get(j).setAgente(modiProveedor.getAgente());

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "EL numero de telefono de la empresa no existe");

            }

        }

    }

    public void eliminarProveedor() {
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese EL numero de telefono de la empresa a eliminar"));
        for (int i = 0; i < ManejoDato.Proveedores.size(); i++) {
            if (telefono == ManejoDato.Proveedores.get(i).getTelefono()) {
                ManejoDato.Proveedores.remove(i);
                JOptionPane.showMessageDialog(null, "Se eiminó el Proveedor");
            } else {
                JOptionPane.showMessageDialog(null, "El Proveedor no existe");

            }

        }

    }

    public negocio.Proveedor encontrarP(int telefonoC) {
        for (int i = 0; i < ManejoDato.Proveedores.size(); i++) {
            if (telefonoC == ManejoDato.Proveedores.get(i).getTelefono()) {
                return ManejoDato.Proveedores.get(i);
            }
        }
        return new negocio.Proveedor();
    }

}
