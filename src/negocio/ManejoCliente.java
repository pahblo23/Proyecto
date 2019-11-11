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
import negocio.Cliente;

public class ManejoCliente { 
    public ManejoCliente() {
    }
    //Crear lista de Clientes    
    ArrayList<negocio.Cliente> listadoClientes = new ArrayList<negocio.Cliente>();//Se crea una lista de tipo objetocliente que llama el meto 
    public void verTodosClientes() { //metodo se sobre escribe de la interfaz se usa para ver la lista clientes
        String concatena = "";
        for (int i = 0; i < listadoClientes.size(); i++) {
            concatena = concatena + "*Ciente" + (i + 1) + "      "
                    + "ID " + listadoClientes.get(i).getId() +"      "
                    + "Nombre " + listadoClientes.get(i).getNombre() + "      "
                    + "Apellido " + listadoClientes.get(i).getApellido() + "      "
                    + "Direccion " + listadoClientes.get(i).getDireccion() + "      "
                    + "Telefono " + listadoClientes.get(i).getTelefono() + "\n";
//            System.out.print("**********************************");
        }
        JOptionPane.showMessageDialog(null,concatena);
    }
    public void agregarCliente() {  //metodo para agregar objetos a la lista                          
        //Este metodo agregamos clientes a nuestra lista   
        int id =0;
        for (int i = 0; i < 1; i++) {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id de la persona"));
            if (listadoClientes.size() != 0) {
                for (int j = 0; j < listadoClientes.size(); j++) {
                    if (listadoClientes.get(j).getId() == id) {
                    JOptionPane.showMessageDialog(null,"Id ya existe, ingrese otra");
                    i--;
                    }
                }
            }
        }
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefon"));
        // cargar mis valores anteriores a mi objeto
        Cliente cliente1 = new Cliente(id, nombre, apellido,direccion,telefono);
        listadoClientes.add(cliente1);
        JOptionPane.showMessageDialog(null,"El Cliente fue Agregado");
    }
    public void modificarCliente() { //modifica los datos de la lista
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id de la persona que desea modificra"));
        for (int j = 0; j < listadoClientes.size(); j++) {
            if (listadoClientes.get(j).getId()== id){
                Cliente cliente1 = new Cliente();
                cliente1 = buscarClientes(id);
                int cedula = cliente1.getId();
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre", cliente1.getNombre());
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido", cliente1.getApellido());
                String direccion = JOptionPane.showInputDialog("Ingrese la direccion", cliente1.getDireccion());
                int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefon", cliente1.getTelefono()));
                Cliente clienteModificado = new Cliente(cedula, nombre, apellido, direccion, telefono);
                for (int i = 0; i < listadoClientes.size(); i++) {
                    if (cliente1.getId() == listadoClientes.get(i).getId()) { //Si la cedula es igual al id 
                        listadoClientes.get(i).setApellido(clienteModificado.getApellido());
                        listadoClientes.get(i).setNombre(clienteModificado.getNombre());
                        listadoClientes.get(i).setDireccion(clienteModificado.getDireccion());
                        listadoClientes.get(i).setTelefono(clienteModificado.getTelefono());
                    }
                }
            }else{ 
                JOptionPane.showMessageDialog(null,"La ID cliente no existe");
            }     
        }
    }
    public void eliminarCliente() { //elimina los datos de la lista
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id de la persona"));
        for (int i = 0; i < listadoClientes.size(); i++) {
            //Si la cedula es igual al id 
            if(id == listadoClientes.get(i).getId()){
               listadoClientes.remove(i);
               JOptionPane.showMessageDialog(null,"El Cliente fue Eliminado");
            }else{
               JOptionPane.showMessageDialog(null,"El Cliente NO existe"); 
            } 
        }    
    }
    public negocio.Cliente buscarClientes(int cedula) { //busca el metodo en la lista 
        for (int i = 0; i < listadoClientes.size(); i++) {            
            //Si la cedula es igual al id 
            if(cedula == listadoClientes.get(i).getId()){
                return listadoClientes.get(i);
            }
        }
        return new negocio.Cliente();// devuelve un objetoCliente de la lista
    }
}

