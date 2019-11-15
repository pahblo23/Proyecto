
package pulpepos;
import negocio.ManejoCliente;
import presentacion.Menu;
/**
 *
 * @author Pahblo
 */
public class PulpePOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoCliente x =new  ManejoCliente();
//        x.llamarListaClientestxt();
        Menu menuPrincipal=new Menu();
        menuPrincipal.mostrarMenu();
//        x.agregarListaClientetxt();
    }
    
}
