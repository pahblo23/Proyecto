package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import negocio.ManejoDato;

/**
 *
 * @author Pahblo
 */
/**
 * Clase que lleva el control de Archivos de texto.
 *
 * @param <T> Tipo de elementos a guardar, ya sea Inventario, Ventas, Cliente o
 * pedidos.
 */
public class Archivo<T> {

    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private FileInputStream fis;
    private ObjectInputStream ois;
    ArrayList<T> lista;

    /**
     * Inicializa la clase Archivo.
     */
    public Archivo() {
        fos = null;
        oos = null;
        fis = null;
        ois = null;
    }

    /**
     * Guarda una lista de productos a un archivo.
     *
     * @param lista Lista a guardar.
     * @param nombre Nombre del archivo.
     */
    public void guardar(ArrayList<T> lista, String nombre) {
        try {
            fos = new FileOutputStream(nombre);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new ArrayList<>(lista));
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.getLocalizedMessage());
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getLocalizedMessage());
        }
    }

    /**
     * Carga una lista desde un archivo.
     *
     * @param ruta
     * @param rutaArchivo
     * @return 
     *
     */
    public ArrayList<T> cargar(String ruta) {
//            ArrayList<T> productos = ArrayList();
        try {
            fis = new FileInputStream(ManejoDato.rutaArchivo);
            ois = new ObjectInputStream(fis);
            ArrayList<T> lista = (ArrayList<T>) ois.readObject();
//                productos = FXCollections.observableList(lista);
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.getLocalizedMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("ERROR: " + e.getLocalizedMessage());
        }
            return lista;
    }
}
