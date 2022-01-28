package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.Excepciones.*;


public class AccesoDatosImpl implements AccesoDatos{
    public void main(String[] args) {

    }

    @Override
    public void existe(String archivoPeliculas) {
        
        File documento = new File (archivoPeliculas);
        
        if (documento.exists()) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }

    }
    //LISTAR CARPETA
    @Override
    public void listar(String nombrePelicula) {
      
        
        List listado = new ArrayList();
        listado.add(nombrePelicula);

        listado.forEach(elemento -> {
            System.out.println("" + nombrePelicula);
        }
    }           
                
        
    //ANEXAR INFO
    @Override
    public void escribir(String nombre,String archivoPeliculas, String nombrePelicula) {
        
        //nombre.setNombre(nombrePelicula);
        
        File documento = new File(archivoPeliculas);
        try {
            PrintWriter documentoSalida = new PrintWriter(new FileWriter(documento, true));
            documentoSalida.println(nombrePelicula);
            documentoSalida.close();
            System.out.println(EscrituraDatosex.EscrituraDatosex(nombrePelicula));
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
        ex.printStackTrace();
        }
    }

    //BUQUEDA
    @Override
    public void buscarPelicula(String archivoPeliculas, String buscar) {
        
        System.out.println("Ingrese el nombre de la pelicula a buscar");
        Scanner scanbuscador = new Scanner (System.in);
        var peliculaBuscada = scanbuscador.nextLine ();
        
        File documento = new File(archivoPeliculas);
        try { var reader = new BufferedReader (new FileReader (archivoPeliculas));
        var lineaLeida = reader.readLine();
        if (lineaLeida.equals(peliculaBuscada)) {
        System.out.println("Pelicula encontrada" + lineaLeida);
        } else { 
        lineaLeida = reader.readLine ();
        } 
        reader.close();
        } catch (LecturaDatos ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
        ex.printStackTrace();
        }   
        }

    
    //CREACION DEL DOCUMENTO
    @Override
    public void crear(String archivoPeliculas) {
                
        File documento = new File ("/Users/augustoocchiuzzi/Desktop/JAVA/PROYECTOS/LaboratorioFinal/Peliculas.txt");
        try {
            PrintWriter documentoSalida = new PrintWriter (documento);
            documentoSalida.print("Se crea el documento: ");
            documentoSalida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    

    @Override
    public void borrar(String archivoPeliculas) {
        
        File documento = new File (archivoPeliculas);
        if (documento.delete()) {
            System.out.println("El documento ha sido eliminado exitosamente");
        } else { 
            System.out.println("El documento no puede ser eliminado");
        }
    }
}


/*
Posibilidad de lista

     /* File lista = new File(nombrePelicula);
        String[] listado = lista.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay nada para listar");
        } else {
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
*/
