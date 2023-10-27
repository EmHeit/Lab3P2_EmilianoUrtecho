
package lab3p2_emilianourtecho;


public class AppsUtilidad extends Aplicaciones{
    private String categoria;

    public AppsUtilidad(String categoria, String nombre, String desarrollador, double precio, char estado, double rating, int cantDescargas) {
        super(nombre, desarrollador, precio, estado, rating, cantDescargas);
        this.categoria = categoria;
    }

    //getters
    public String getCategoria() {
        return categoria;
    }

    //setters
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
