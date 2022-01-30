package mx.com.gm.peliculas.negocio;

import java.awt.Desktop;
import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Peliculas;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{

    @Override
    public void agregarPelicula(String archivoPelicula, String nombrePelicula) {
    
        
    System.out.println("Coloque el titulo de la pelicula que sera agregado");
    Scanner scanPelicula = new Scanner (System.in);
    String scan = scanPelicula.nextLine ();  
    
    AccesoDatosImpl movie = new AccesoDatosImpl ();
    movie.escribir(archivoPelicula, scan);
    
    }

    @Override
    public void listarPeliculas(String archivoPeliculas, String nombrePelicula) {
        
        AccesoDatosImpl listaCatalogo = new AccesoDatosImpl ();
        listaCatalogo.listar(archivoPeliculas, nombrePelicula);
    }

    @Override
    public void buscarPelicula(String archivoPeliculas, String buscar) {

        AccesoDatosImpl documento = new AccesoDatosImpl ();
        documento.buscarPelicula(archivoPeliculas, buscar);
    }

    @Override
    public void iniciarArchivo(String archivoPeliculas) {
   
        try {

            File documento = new File(archivoPeliculas);
            Desktop.getDesktop().open(documento);

        } catch (IOException ex) {

            System.out.println(ex);

    }
    
}

   