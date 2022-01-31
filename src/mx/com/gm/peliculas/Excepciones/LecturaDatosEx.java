package mx.com.gm.peliculas.Excepciones;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;

public class LecturaDatosEx {
    public static String lecturaDatos (String nombrePelicula) 
            
            throws AccesoDatosEx {
        System.out.println("Validando operacion");
        if (nombrePelicula.equals(null)) {
            throw new AccesoDatosEx("No se encontro ningun titulo asociado");
        }
        return "Pelicula: " + '"' + nombrePelicula + '"' + ", encontrada";

    }
    