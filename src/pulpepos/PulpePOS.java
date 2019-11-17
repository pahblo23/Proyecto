package pulpepos;


import negocio.ManejoCliente;

import presentacion.Menu;

/**
 * Clase principal
 *
 * @author Pablo Díaz =======
 * @author Pablo
 */
public class PulpePOS {

    /**
     * Metodo main
     *
     * @param args
     */
    public static void main(String[] args) {
        ManejoCliente objcliente = new ManejoCliente();
        objcliente.llamarListaClientestxt();
        Menu menuPrincipal = new Menu();
        menuPrincipal.mostrarMenu();

//        ManejoDato.archivo.guardar(ManejoDato.InventarioD, ManejoDato.rutaArchivo);
//        ManejoDato.archivo.guardar(ManejoDato.listadoClientes, ManejoDato.rutaArchivo);


        objcliente.agregarListaClientetxt ();

    }

}
