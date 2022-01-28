package cpjLaboratorioFinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Peliculas;

public class CpjLaboratorioFinal {

    public static void main(String[] args){

    var archivoPeliculas = "/Users/augustoocchiuzzi/Desktop/JAVA/PROYECTOS/LaboratorioFinal/Peliculas.txt";
           
        String menuInicial = new String ();
        menuInicial ="Elija la opcion escribiendo el numero: \n"
        + "1: Iniciar Catalogo \n" + "2: Agregar pelicula \n"
        + "3: Listar pelicula \n" + "4: Buscar pelicula \n" + "0: Salir \n";
        System.out.println("" + menuInicial);
        
        Scanner opciones = new Scanner(System.in);
        var eleccion = Integer.parseInt(opciones.nextLine());
        var result = "";
        
    //ELECCION

    switch (eleccion) {
        case 1:
            result = "Iniciando documento";
            break;

        case 2:
            result = "Siga instrucciones";

            CatalogoPeliculasImpl agregarPeli = new CatalogoPeliculasImpl();
            agregarPeli.agregarPelicula(archivoPeliculas, archivoPeliculas);
            break;

        case 3:
            result = "Listando";
            CatalogoPeliculasImpl listador = new CatalogoPeliculasImpl();
            listador.listarPeliculas(archivoPeliculas);
            break;

        case 4:
            result = "Buscador";
            CatalogoPeliculasImpl buscador = new CatalogoPeliculasImpl();
            buscador.buscarPelicula(archivoPeliculas, "");
            break;

        case 0:
            result = "Menu finalizado";
            break;
        default:
            System.out.println ("Opcion no contemplada");
            
    }
        
    
        System.out.println("¿Desea volver al inicio del formulario?: SI/NO");
        Scanner scan = new Scanner (System.in);
        var respuesta = scan.nextLine();
        
        String menuInicial1 = new String ();
        menuInicial1 = menuInicial;


        if (respuesta.equals("SI")) {
            System.out.println(menuInicial1);
            Scanner opciones = new Scanner (System.in);
        }else if (respuesta.equals("NO")) {
        System.out.println("Operaciones de Catalogo finalizadas con exito");
    }
    }

}

    

