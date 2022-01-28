package mx.com.gm.peliculas.Excepciones;

public class LecturaDatosEx {
    public static String lecturaDatos (String nombrePelicula) {

            if (nombrePelicula.equals(null)) {
            throw new RuntimeException ("No se encontro ningun titulo asociado");
        }  
        return ("Pelicula: " + '"' + nombrePelicula + '"' + "encontrada");

    }