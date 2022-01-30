package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.domain.Peliculas;

public interface CatalogoPeliculas {
    

void agregarPelicula (String archivoPeliculas, String nombrePelicula);

void listarPeliculas (String archivoPeliculas,String nombrePelicula);

void buscarPelicula (String archivoPeliculas, String buscar);

void iniciarArchivo (String archivoPeliculas);



}