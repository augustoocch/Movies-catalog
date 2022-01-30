package mx.com.gm.peliculas.Excepciones;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import cpjLaboratorioFinal.*;

public class EscrituraDatosex {
    
    public static String EscrituraDatosex (String nombrePelicula) {
        

        
        if (nombrePelicula.equals("")) {
            throw new RuntimeException ("No agrego ningun titulo valido");

        }  
        return ("Pelicula: " + '"' + nombrePelicula + '"' + ", agregada con exito");

    }

    

