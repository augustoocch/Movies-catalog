package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Peliculas;

public interface AccesoDatos {
   

void existe (String archivoPeliculas);

void listar (String archivoPeliculas, String nombrePelicula);
             
void escribir (String archivoPeliculas, String nombrePelicula); 
   
void buscarPelicula (String archivoPeliculas, String buscar);

void crear (String archivoPeliculas);

void borrar (String archivoPeliculas);
           
    
}

