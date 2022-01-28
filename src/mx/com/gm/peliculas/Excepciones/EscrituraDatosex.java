package mx.com.gm.peliculas.Excepciones;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class EscrituraDatosex {
    
    public static String EscrituraDatosex (String nombrePelicula) {
        
        
        if (nombrePelicula.equals(null)) {
            throw new RuntimeException ("No agrego ningun titulo valido");
        }  
        return ("Pelicula: " + '"' + nombrePelicula + '"' + ", agregada con exito");

    }

    

