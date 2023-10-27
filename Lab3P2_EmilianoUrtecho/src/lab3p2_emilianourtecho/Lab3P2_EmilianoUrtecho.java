
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
                case 1: // Para el Administrador
                    
                    int eleccionAdministrador;
                    System.out.println("    ~Menu Administrador~");
                    System.out.println("1. Agregar Aplicacion");
                    System.out.println("2. Biblioteca");
                    System.out.println("3. Actualizacion");
                    System.out.println("4. Eliminar Aplicacion");
                    System.out.println("5. Estadisticas de Desarrollador");
                    System.out.print("Elija una opcion: ");
                    eleccionAdministrador = escan.nextInt();
                    
                    
                    
                    break;
                case 2: // Para el Usuario
                    
                    int eleccionUsuario;
                    System.out.println("    ~Menu Usuario~");
                    System.out.println("1. Buscar por Nombre");
                    System.out.println("2. Buscar por Categoria");
                    System.out.println("3. Biblioteca");
                    System.out.println("4. Mostrar Descargas");
                    System.out.println("5. Eliminar Descarga");
                    System.out.println("6. Calificar Aplicacion");
                    System.out.print("Elija una opcion: ");
                    eleccionUsuario = escan.nextInt();
                    
                    
                    
                    break;
                case 3: // SALIR
                    System.out.println("Si quiere salir, presione la telca 3 otra vez o elija otra opcion");
                    break;
                default: // NO SE
                    System.out.println("Lo siento, pero esa opcion no esta disponible, elija una opcion valida por favor.");
                    break;
            }
        } while (eleccion != 3);
    }
    
}
