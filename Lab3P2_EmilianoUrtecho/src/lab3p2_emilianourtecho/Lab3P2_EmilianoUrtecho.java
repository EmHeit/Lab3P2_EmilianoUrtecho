
package lab3p2_emilianourtecho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab3P2_EmilianoUrtecho {
    
    static Scanner escan = new Scanner(System.in);
    static List<Aplicaciones> aplicacion = new ArrayList();
    
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
    
    // Metodos Administrador
    public static void crudAdministrador(){
        
        int eleccionAdministrador;
        System.out.println("    ~Menu Administrador~");
        System.out.println("1. Agregar Aplicacion");
        System.out.println("2. Biblioteca");
        System.out.println("3. Actualizacion");
        System.out.println("4. Eliminar Aplicacion");
        System.out.println("5. Estadisticas de Desarrollador");
        System.out.println("6. SALIR");
        System.out.print("Elija una opcion: ");
        eleccionAdministrador = escan.nextInt();
        
        do {
            switch(eleccionAdministrador){
                case 1://Agregar Aplicacion
                    break;
                case 2://Biblioteca
                    break;
                case 3://Actualizar Aplicacion
                    break;
                case 4://Eliminar Aplicacion
                    break;
                case 5://Estadistica de Desarrollador
                    break;
                case 6://SALIR
                    break;
                default://NOSE
                    break;
            }
        } while (eleccionAdministrador != 6);
    }
    
    public static void agregarAplicacion(){
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = escan.nextLine();
        nombre = escan.nextLine();
        
        System.out.print("Ingrese el nombre del desarrollador: ");
        String desarrollador = escan.nextLine();
        desarrollador = escan.nextLine();
        
        System.out.print("Ingrese el precio de la aplicacion: ");
        double precio = escan.nextDouble();
        
        System.out.println("Ingrese el tipo de aplicacion [1. app de utilidad / 2. app de juegos]");
        int tipoApp = escan.nextInt();
        
        if (tipoApp == 1) {
            System.out.println("Ingrese que categoria es su Aplicacion: ");
            String categoria = escan.nextLine();
            categoria = escan.nextLine();
            
            AppsUtilidad appUtil = new AppsUtilidad(nombre, desarrollador, precio,"Disponible", 0.0, 0);
            aplicacion.add(appUtil);
        }
        
    }
    public static void Biblioteca(){
        
    }
    public static void actualizarAplicacion(){
        
    }
    public static void eliminarAplicacion(){
        
    }
    public static void estadisticaDeDesarrollador(){
        
    }
    //Metodos de Usuario
    public static void crudUsuario(){
        
        int eleccionUsuario;
        System.out.println("    ~Menu Usuario~");
        System.out.println("1. Buscar por Nombre");
        System.out.println("2. Buscar por Categoria");
        System.out.println("3. Biblioteca");
        System.out.println("4. Mostrar Descargas");
        System.out.println("5. Eliminar Descarga");
        System.out.println("6. Calificar Aplicacion");
        System.out.println("7. SALIR");
        System.out.print("Elija una opcion: ");
        eleccionUsuario = escan.nextInt();
        
        do {
            switch(eleccionUsuario){
                case 1://Buscar por Nombre
                    break;
                case 2://Buscar por Categoria
                    break;
                case 3://Biblioteca
                    break;
                case 4://Mostrar Descargas
                    break;
                case 5://Eliminar Descarga
                    break;
                case 6://Calificar Aplicacion
                    break;
                case 7://SALIR
                    break;
                default://No se
                    break;
            }
        } while (eleccionUsuario != 7);
    }
    
    
    
}
