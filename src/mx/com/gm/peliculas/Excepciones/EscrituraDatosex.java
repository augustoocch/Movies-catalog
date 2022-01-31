package mx.com.gm.peliculas.Excepciones;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import cpjLaboratorioFinal.*;

public class EscrituraDatosex {
    
    public static String EscrituraDatosex (String nombrePelicula) 
           
            throws AccesoDatosEx {
        System.out.println("Validando operacion");
        if (nombrePelicula.equals("")) {
            throw new AccesoDatosEx("No agrego ningun titulo valido");
        }
        return "Pelicula: " + '"' + nombrePelicula + '"' + ", agregada con exito";

    }
}

