
package presentacion;

import java.util.InputMismatchException;


public class SubMenu extends Menu{
    
    public SubMenu(){}

   
    public void mostrarSubMenu() {
                while (!salir){
                    System.out.println("1. Ver Registros"
                         + "\n2. Agregar Registro"
                         + "\n3. Modificar Registro"
                         + "\n4. Eliminar Registro"
                         + "\n5. Salir");
                    try {
                    System.out.println("\nPor favor digite el número de la sección a la que "
                                    + "desea acceder: ");
                    this.op=sc.nextInt();

                        switch(op){
                            case 1://ver registros
                                break;
                            case 2://agregar registros
                                break;
                            case 3://modificar registros
                                break;
                            case 4://eliminar registros
                                break;
                            case 5:
                                System.out.println("Es´ta seguro que desea abandonar esta sección (S/N)? ");
                                String resp;
                                resp=sc.nextLine();
                                    if ("S".equals(resp)){
                                    salir=true;
                                    }

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
