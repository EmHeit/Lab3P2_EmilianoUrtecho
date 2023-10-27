
package lab3p2_emilianourtecho;


public class Aplicaciones{
    private String nombre;
    private String desarrollador;
    private double precio;
    private String estado;
    private double rating;
    private int cantDescargas;

    public Aplicaciones() {
    }

    public Aplicaciones(String nombre, String desarrollador, double precio, String estado, double rating, int cantDescargas) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.precio = precio;
        this.estado = estado;
        this.rating = rating;
        this.cantDescargas = cantDescargas;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public double getRating() {
        return rating;
    }

    public int getCantDescargas() {
        return cantDescargas;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCantDescargas(int cantDescargas) {
        this.cantDescargas = cantDescargas;
    }

    @Override
    public String toString() {
        return "Aplicaciones{" + "nombre=" + nombre + ", rating=" + rating + ", cantDescargas=" + cantDescargas + '}';
    }
    
    
    
}
