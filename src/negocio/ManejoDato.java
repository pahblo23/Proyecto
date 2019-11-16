package negocio;

import datos.Archivo;
import java.util.ArrayList;

/**
 *
 * @author Pahblo
 */
public class ManejoDato {

    public static ArrayList<Cliente> listadoClientes = new ArrayList<>();//Se crea una lista de tipo objetocliente
    public static ArrayList<Inventario> InventarioD = new ArrayList<>();
    public static ArrayList<negocio.Proveedor> Proveedores = new ArrayList<>();
    public static String rutaArchivo = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\PulpePOS\\src\\datos\\Datos.txt";
    public static Archivo<Inventario> archivo = new Archivo<>();

}
