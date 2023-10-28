
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
                    agregarAplicacion();
                    break;
                case 2://Biblioteca
                    Biblioteca();
                    break;
                case 3://Actualizar Aplicacion
                    actualizarAplicacion();
                    break;
                case 4://Eliminar Aplicacion
                    eliminarAplicacion();
                    break;
                case 5://Estadistica de Desarrollador
                    estadisticaDeDesarrollador();
                    break;
                case 6://SALIR
                    System.out.println("Si desea salir, presione otra vez la tecla 6 o si lo desea elija otra opcion");
                    break;
                default://NOSE
                    System.out.println("Lo siento, pero la tecla que presiono es invalida :(");
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
            
            AppsUtilidad appUtil = new AppsUtilidad(categoria, nombre, desarrollador, precio, false, 0.0, 0);
            aplicacion.add(appUtil);
            System.out.println("Se ha creado la aplicacion de utilidad");
        }else if (tipoApp == 2) {
            System.out.println("Ingrese que categoria es su Aplicacion: ");
            int edadRecomend = escan.nextInt();
            
            Juegos juego = new Juegos(edadRecomend, nombre, desarrollador, precio, false, 0.0, 0);
            aplicacion.add(juego);
            System.out.println("Se ha creado su videojuego");            
        }else{
            System.out.println("Lo siento pero la tecla que ha ingresado es invalida");
        }
        
    }
    public static void Biblioteca(){
        if (aplicacion.isEmpty()) {
            System.out.println("No se puede utilizar esta opcion, porque no hay aplicaciones");
        }else{
            System.out.println("Aplicaciones de utilidad: ");
            for (Aplicaciones aplicaciones : aplicacion) {
                if (aplicacion instanceof AppsUtilidad) {
                    System.out.println("- Nombre: "+ ((AppsUtilidad) aplicacion).getNombre());
                    System.out.println("- Desarrollador: "+ ((AppsUtilidad)aplicacion).getDesarrollador());
                    System.out.println("- Precio: "+ ((AppsUtilidad)aplicacion).getPrecio());
                    System.out.println("- Categoria: "+((AppsUtilidad)aplicacion).getCategoria());
                    System.out.println();
                    System.out.println();
                }
            }
            
            System.out.println("Aplicaciones de Juegos: ");
            for (Aplicaciones aplicaciones : aplicacion) {
                if (aplicacion instanceof Juegos) {
                    System.out.println("- Nombre: "+ ((Juegos) aplicacion).getNombre());
                    System.out.println("- Desarrollador: "+ ((Juegos) aplicacion).getDesarrollador());
                    System.out.println("- Precio: "+((Juegos) aplicacion).getPrecio());
                    System.out.println("- Edad Recomendada: "+((Juegos) aplicacion).getEdadRecomendada());
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }
    public static void actualizarAplicacion(){ //Modificar Aplicacion
        System.out.println("Ingrese el nombre de la aplicacion que va actualizar: ");
        String nombre = escan.nextLine();
        nombre = escan.nextLine();
        
        for (Aplicaciones aplicaciones : aplicacion) {
            if (aplicaciones.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Si no quiere modificar alguna de estas opciones solo ponga lo mismo");
                System.out.println();
                System.out.println("Ingrese el nuevo nombre de la app: ");
                String nuevoNombre = escan.nextLine();
                nuevoNombre = escan.nextLine();
                aplicaciones.setNombre(nuevoNombre);
                
                System.out.println("Ingrese el nuevo precio: ");
                double nuevoPrecio = escan.nextDouble();
                aplicaciones.setPrecio(nuevoPrecio);
                
                System.out.println("La aplicacion '"+nombre+"' se ha actualizado con exito!!!");
                
            }
        }
    }
    public static void eliminarAplicacion(){
        if (aplicacion.isEmpty()) {
            System.out.println("No puede eliminar algo que esta vacio");
        }else{
            System.out.print("Ingrese el nombre de la aplicacion que desea eliminar: ");
            String nombre = escan.nextLine();
            nombre = escan.nextLine();
            
            for (Aplicaciones aplicaciones : aplicacion) {
                if (aplicaciones.getNombre().equalsIgnoreCase(nombre)) {
                    aplicacion.remove(aplicaciones);
                    System.out.println("La aplicacion se ha eliminado");
                }else{
                    System.out.println("No puedes eliminar algo que no existe");
                }
            }
        }
    }
    public static void estadisticaDeDesarrollador(){
        System.out.println("Estadistica: ");
        for (Aplicaciones aplicaciones : aplicacion) {
            System.out.println("Nombre de la aplicacion: "+aplicaciones.getNombre());
            if (aplicaciones.getCantDescargas() == 0) {
                System.out.println("La app no tiene ninguna descarga");
            }else{
                System.out.println("Numero de Descargas: "+aplicaciones.getCantDescargas());
            }
            if (aplicaciones.getRating() == 0.0) {
                System.out.println("La app no tiene ningun RATING");
            }else{
                System.out.println("Ratings "+aplicaciones.getRating());
            }
            System.out.println("    --------------  ");
        }
        
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
                    buscarNombre();
                    break;
                case 2://Buscar por Categoria
                    buscarCategoria();
                    break;
                case 3://Biblioteca
                    biblioteca();
                    break;
                case 4://Mostrar Descargas
                    mostrarDescargas();
                    break;
                case 5://Eliminar Descarga
                    eliminarDescarga();
                    break;
                case 6://Calificar Aplicacion
                    calificarAplicacion();
                    break;
                case 7://SALIR
                    System.out.println("Si desea salir, presione otra vez la tecla 7 o elija otra opcion");
                    break;
                default://No se
                    System.out.println("Lo siento, pero la tecla que ha seleccionado es invalida");
                    break;
            }
        } while (eleccionUsuario != 7);
    }
    public static void buscarNombre(){
        System.out.print("Ingrese el nombre de la aplicacion: ");
        String nombre = escan.nextLine();
        nombre = escan.nextLine();
        
        boolean estado = false;
        for (int i = 0; i < aplicacion.size(); i++) {
            Aplicaciones aplicaciones = aplicacion.get(i);
            if (aplicaciones.getNombre().equals(nombre)) {
                System.out.println("La aplicacion "+nombre+" se ha encontrado");
                System.out.println("Desea descargarlo? [Si.) S / No.) N]");
                char descarga = escan.next().charAt(0);
                if (descarga == 's' || descarga == 'S' ) {
                    aplicaciones.setEstado(true);
                    aplicaciones.setCantDescargas(aplicaciones.getCantDescargas() + 1);
                    System.out.println("La aplicación " + nombre + " se ha descargado exitosamente.");
                }else if(descarga == 'n' || descarga == 'N'){
                    System.out.println("Esta bien, la aplicacion no ha sido descargada");
                }else{
                    System.out.println("No se pudo descargar la aplicacion");
                }
                estado = true;
            }
        }
        if (!estado) {
            System.out.println("Lo siento, pero no se ha encontrado ninguna aplicacion con ese nombre o tal vez necesita escribir mejor el nombre");
        }
    }
    public static void buscarCategoria(){
        System.out.println("Ingrese una categoria: ");
        String categoria = escan.nextLine();
        categoria = escan.nextLine();
        
        boolean estado = false;
        for (Aplicaciones aplicaciones : aplicacion) {
            if (aplicaciones instanceof AppsUtilidad) {
                AppsUtilidad appUtil = (AppsUtilidad) aplicaciones;
                if (appUtil.getCategoria().equalsIgnoreCase(categoria)) {
                    System.out.println("Nombre: "+aplicaciones.getNombre());
                    System.out.println("Desarrollador: "+aplicaciones.getDesarrollador());
                    System.out.println("Precio: " + aplicaciones.getPrecio());
                    System.out.println("Categoria: "+ appUtil.getCategoria());
                    System.out.println("");
                    System.out.println("    ---------------------   ");
                    estado = true;
                }
            }
        }
        if (!estado) {
            System.out.println("Lo siento pero no se ha encontrado ninguna app con esa categoria");
        }
       boolean estado1 = false;
        for (int i = 0; i < aplicacion.size(); i++) {
            Aplicaciones aplicaciones = aplicacion.get(i);
            if (aplicaciones.getNombre().equalsIgnoreCase(categoria)) {
                System.out.println("La aplicacion "+categoria+" se ha encontrado");
                System.out.println("Desea descargarlo? [Si.) S / No.) N]");
                char descarga = escan.next().charAt(0);
                if (descarga == 's' || descarga == 'S' ) {
                    aplicaciones.setCantDescargas(aplicaciones.getCantDescargas() + 1);
                    aplicaciones.setEstado(true);
                    aplicacion.add(aplicaciones);
                    System.out.println("La aplicación " + categoria + " se ha descargado exitosamente.");
                }else if(descarga == 'n' || descarga == 'N'){
                    System.out.println("Esta bien, la aplicacion no ha sido descargada");
                }else{
                    System.out.println("No se pudo descargar la aplicacion");
                }
                estado1 = true;
            }
        }
        if (!estado1) {
            System.out.println("Lo siento, pero no se ha encontrado ninguna aplicacion con ese nombre");
        }        
    }
    public static void biblioteca(){
        if (aplicacion.isEmpty()) {
            System.out.println("No se puede utilizar esta opcion, porque no hay aplicaciones");
        }else{
            for (Aplicaciones aplicaciones : aplicacion) {
                if (aplicacion instanceof AppsUtilidad) {
                    System.out.println("- Nombre: "+ ((AppsUtilidad) aplicacion).getNombre());
                    System.out.println("- Desarrollador: "+ ((AppsUtilidad)aplicacion).getDesarrollador());
                    System.out.println("- Precio: "+ ((AppsUtilidad)aplicacion).getPrecio());
                    System.out.println("- Categoria: "+((AppsUtilidad)aplicacion).getCategoria());
                    System.out.println();
                    System.out.println("    ------------------------------- ");
                }
            }
            for (Aplicaciones aplicaciones : aplicacion) {
                if (aplicacion instanceof Juegos) {
                    System.out.println("- Nombre: "+ ((Juegos) aplicacion).getNombre());
                    System.out.println("- Desarrollador: "+ ((Juegos) aplicacion).getDesarrollador());
                    System.out.println("- Precio: "+((Juegos) aplicacion).getPrecio());
                    System.out.println("- Edad Recomendada: "+((Juegos) aplicacion).getEdadRecomendada());
                    System.out.println();
                    System.out.println("    ------------------------------- ");
                }
            }
        }
        
    }
    public static void mostrarDescargas(){
        if (aplicacion.isEmpty()) {
            System.out.println("Lo siento, pero usted no ha descargado nada");
        }else{
            for (Aplicaciones aplicaciones : aplicacion) {
                System.out.println("Nombre: "+aplicaciones.getNombre());
                System.out.println("Desarrollador: "+aplicaciones.getDesarrollador());
                System.out.println("Precio: "+aplicaciones.getDesarrollador());
                AppsUtilidad appUtil = (AppsUtilidad)aplicaciones;
                Juegos juego = (Juegos) aplicaciones;
                
                System.out.println("    -------------------------   ");
                System.out.println();
            }
        }
    }
    public static void eliminarDescarga(){
        if (aplicacion.isEmpty()) {
            System.out.println("Aun no tiene ninguna app descargada");
        }else{
            System.out.print("Ingrese el nombre de la aplicacion descargada que desea eliminar: ");
            String nombre = escan.nextLine();
            nombre = escan.nextLine();
            
            for (Aplicaciones aplicaciones : aplicacion) {
                if (aplicaciones.getNombre().equalsIgnoreCase(nombre)) {
                    if (aplicaciones.getEstado()) {
                    aplicaciones.setEstado(false);
                    aplicaciones.setCantDescargas(aplicaciones.getCantDescargas() - 1);
                    System.out.println("La aplicacion se ha eliminado");                        
                    }

                }else{
                    System.out.println("No puedes eliminar algo que no tiene");
                }
            }
        }        
    }
    public static void calificarAplicacion(){
        System.out.println("Ingrese el nombre de la app que desea calificar: ");
        String nombre = escan.nextLine();
        nombre = escan.nextLine();
        
        boolean estado = false;
        for (int i = 0; i < aplicacion.size(); i++) {
            Aplicaciones aplicaciones = aplicacion.get(i);
            if (aplicaciones.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese su calificacion del 1 - 5 sobre la aplicacion "+nombre+": ");
                int rating = escan.nextInt();
                
                if (rating >= 0 && rating <= 5) {
                aplicaciones.setRating(rating);
                System.out.println("El rating de la aplicacion '"+nombre+"' es: "+rating);
                estado = true;                    
                }else{
                    System.out.println("Su rating debe estar en el rango");
                }
            }
        }
        if (!estado) {
            System.out.println("Lo siento, pero no se ha encontrado ninguna aplicacion con ese nombre");
        }        
        
    }
}
