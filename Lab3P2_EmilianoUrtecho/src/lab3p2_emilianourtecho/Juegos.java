
package lab3p2_emilianourtecho;


public class Juegos extends Aplicaciones{
    private int edadRecomendada;

    public Juegos(int edadRecomendada, String nombre, String desarrollador, double precio, boolean estado, double rating, int cantDescargas) {
        super(nombre, desarrollador, precio, estado, rating, cantDescargas);
        this.edadRecomendada = edadRecomendada;
    }

    //getters
    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    //setters
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
    
    
}
