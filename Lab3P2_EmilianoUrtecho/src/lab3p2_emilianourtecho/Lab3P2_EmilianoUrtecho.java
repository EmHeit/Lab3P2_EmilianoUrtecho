
package lab3p2_emilianourtecho;

import java.util.Scanner;


public class Lab3P2_EmilianoUrtecho {
    
    static Scanner escan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int eleccion;
        System.out.println("        ~MENU DE PRUEBA~");
        System.out.println("1. Para el Administrador");
        System.out.println("2. Para el Usuario");
        System.out.println("3. SALIR");
        System.out.print("Elija una opcion: ");
        eleccion= escan.nextInt();
        
        do {
            switch(eleccion){
                case 1:
                    break;
                case 2:
                    break;
                case 3: // 
                    break;
                default: // NO SE
                    break;
            }
        } while (eleccion != 3);
    }
    
}
