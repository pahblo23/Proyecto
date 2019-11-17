package negocio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static negocio.ManejoDato.listadoClientes;

/**
 * Clase de manejo de clientes
 *
 * @author Siviani
 * @version 1.4
 */

public class ManejoCliente extends Pulpe implements Serializable{


    /**
     * Constructor para manejar clientes
     */
    public ManejoCliente() {
    }

    /**
     * Metodo se sobre escribe de la interfaz y se usa para ver la lista
     * clientes Este metodo crea la lista de clientes
     *
     * @see ManejoDato
     */
    public void verTodosClientes() {
        String concatena = "";
        for (int i = 0; i < ManejoDato.listadoClientes.size(); i++) {
            concatena = concatena + "Cliente" + (i + 1) + "      "
                    + "ID " + ManejoDato.listadoClientes.get(i).getId() + "      "
                    + "Nombre " + ManejoDato.listadoClientes.get(i).getNombre() + "      "
                    + "Apellido " + ManejoDato.listadoClientes.get(i).getApellido() + "      "
                    + "Direccion " + ManejoDato.listadoClientes.get(i).getDireccion() + "      "
                    + "Telefono " + ManejoDato.listadoClientes.get(i).getTelefono() + "\n";
//            System.out.print("**********************************");
        }
        JOptionPane.showMessageDialog(null, concatena);
    }

    /**
     * Metodo para agregar objetos de tipo cliente a la lista de clientes
     *
     * @see ManejoDato
     */
    public void agregarCliente() {
        int id = 0;
        for (int i = 0; i < 1; i++) {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id de la persona"));
            if (!ManejoDato.listadoClientes.isEmpty()) {
                for (int j = 0; j < ManejoDato.listadoClientes.size(); j++) {
                    if (ManejoDato.listadoClientes.get(j).getId() == id) {
                        JOptionPane.showMessageDialog(null, "Id ya existe, ingrese otra");
                        i--;
                    }
                }
            }
        }
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de teléfono"));
        // cargar mis valores anteriores a mi objeto
        Cliente cliente1 = new Cliente(id, nombre, apellido, direccion, telefono);
        ManejoDato.listadoClientes.add(cliente1);
        JOptionPane.showMessageDialog(null, "El Cliente fue Agregado");
    }

    /**
     * Metodo para hacer modificaciones a la lista de clientes utilizando el
     * numero de identidad
     *
     * @see ManejoDato
     */
    public void modificarCliente() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id de la persona que desea modificar"));
        for (int j = 0; j < ManejoDato.listadoClientes.size(); j++) {
            if (ManejoDato.listadoClientes.get(j).getId() == id) {
                Cliente cliente1 = new Cliente();
                cliente1 = buscarClientes(id);
                int cedula = cliente1.getId();
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre", cliente1.getNombre());
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido", cliente1.getApellido());
                String direccion = JOptionPane.showInputDialog("Ingrese la direccion", cliente1.getDireccion());
                int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefon", cliente1.getTelefono()));
                Cliente clienteModificado = new Cliente(cedula, nombre, apellido, direccion, telefono);
                for (int i = 0; i < ManejoDato.listadoClientes.size(); i++) {
                    if (cliente1.getId() == ManejoDato.listadoClientes.get(i).getId()) { //Si la cedula es igual al id 
                        ManejoDato.listadoClientes.get(i).setApellido(clienteModificado.getApellido());
                        ManejoDato.listadoClientes.get(i).setNombre(clienteModificado.getNombre());
                        ManejoDato.listadoClientes.get(i).setDireccion(clienteModificado.getDireccion());
                        ManejoDato.listadoClientes.get(i).setTelefono(clienteModificado.getTelefono());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La ID cliente no existe");
            }
        }
    }

    /**
     * Metodo para eliminar clientes utilizando el numero de identidad
     *
     * @see ManejoDato
     */
    public void eliminarCliente() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id de la persona"));
        for (int i = 0; i < ManejoDato.listadoClientes.size(); i++) {
            if (id == ManejoDato.listadoClientes.get(i).getId()) {
                ManejoDato.listadoClientes.remove(i);
                JOptionPane.showMessageDialog(null, "El Cliente fue Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente NO existe");
            }
        }
    }

    /**
     * Metodo para buscar a los clientes dentro de la lista con el numero de
     * identidad
     *
     * @param cedula
     * @return objeto de la clase cliente
     * @see ManejoDato
     */
    public negocio.Cliente buscarClientes(int cedula) {
        for (int i = 0; i < ManejoDato.listadoClientes.size(); i++) {
            //Si la cedula es igual al id 
            if (cedula == ManejoDato.listadoClientes.get(i).getId()) {
                return ManejoDato.listadoClientes.get(i);
            }
        }
        return new negocio.Cliente();
    }
    public void agregarListaClientetxt() {
        Cliente conexionCliente = new Cliente();
        FileOutputStream fichero = null;
        try {
            fichero = new FileOutputStream("ListaClientes.txt");
            ObjectOutputStream conexion = new ObjectOutputStream(fichero);
            conexion.writeObject(listadoClientes);
            fichero.close();
            conexion.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    public void llamarListaClientestxt() {
        Cliente conexionCliente = new Cliente();
        FileInputStream ficheroEntrada = null;
        try {
            ficheroEntrada = new FileInputStream("ListaClientes.txt");
            try (ObjectInputStream conexionEntrada = new ObjectInputStream(ficheroEntrada)) {
                listadoClientes = (ArrayList<Cliente>) conexionEntrada.readObject();
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }
    }

    /**
     * Metodo para registrar cliente
     */
    @Override
    public void registrar() {
        this.agregarCliente();
    }

    /**
     * Metodo para ver cliente
     */
    @Override
    public void ver() {
        this.verTodosClientes();
    }

    /**
     * Metodo para modificar cliente
     */
    @Override
    public void modificar() {
        this.modificarCliente();
    }

    /**
     * Metodo para eliminar cliente
     */
    @Override
    public void eliminar() {
        this.eliminarCliente();
    }

}
