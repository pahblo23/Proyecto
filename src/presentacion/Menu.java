
package presentacion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc=new Scanner(System.in);
    String titulo;
    boolean salir =false;
    int op;

    public Menu(){}
    
    public Menu(String titulo) {
        this.titulo = titulo;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
//    SubMenu menuInventario=new SubMenu();
    
    //método para invocar el menú que se desea
    public void mostrarMenu(){
            while (!salir){
    
                System.out.println("***PULPE POS***");
                System.out.println("\n1. Inventario"
                     + "\n2. Ventas"
                     + "\n3. Clientes"
                     + "\n4. Pedidos"
                     + "\n5. Salir");
                try {
                System.out.println("\nPor favor digite el número de la sección a la que "
                                + "desea acceder: ");
                this.op=sc.nextInt();

                switch(op){
                    case 1://menuInventario.mostrarSubMenu();
                        break;
                    case 2://se llama al menú ventas
                        break;
                    case 3://se llama al menú clientes
                        break;
                    case 4://se llama al menú pedidos
                        break;
                    case 5:
                        System.out.println("Gracias por visitar la pulpería");
                        salir=true;
                        break;
                    default:
                        System.out.println("\nDebe elegir una de las 5 Opciones mostradas:\n");//aquí podemos meter un excepción
                 } 
                    }catch (InputMismatchException e) {
                        System.out.println("Debes insertar un número");
                        sc.next();
                    }            
        
    
            }

}
}
