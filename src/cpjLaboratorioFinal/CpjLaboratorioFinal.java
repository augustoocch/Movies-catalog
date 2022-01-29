package cpjLaboratorioFinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Peliculas;

public class CpjLaboratorioFinal {
public static void main (String [] args ) {
   
//CREAR
    //AccesoDatosImpl crear = new AccesoDatosImpl ();
    //crear.crear("Peliculas");
 //LOCALIZAR   
    var archivoPeliculas = "/Users/augustoocchiuzzi/Desktop/JAVA/PROYECTOS/LaboratorioFinal/Peliculas.txt";
        
        String menuInicial = new String ("Elija la opcion escribiendo el numero: \n"
        + "1: Iniciar Catalogo \n" + "2: Agregar pelicula \n"
        + "3: Listar pelicula \n" + "4: Buscar pelicula \n" + "0: Salir \n");
        System.out.println(menuInicial);
//SCANNER            
        Scanner opciones = new Scanner(System.in);
        var eleccion = Integer.parseInt(opciones.nextLine());
   
//ELECCION
    var eleccionUsuario = (eleccion);
    var result = "";

    switch (eleccionUsuario) {
        case 1:
            result = "Abriendo documento";
            System.out.println(result);
            
            CatalogoPeliculasImpl abrirArchivo = new CatalogoPeliculasImpl();
            abrirArchivo.iniciarArchivo(archivoPeliculas);
            break;

        case 2:
            result = "Siga instrucciones";
            System.out.println(result);

            CatalogoPeliculasImpl agregarPeli = new CatalogoPeliculasImpl();
            agregarPeli.agregarPelicula(archivoPeliculas, archivoPeliculas);
            break;

        case 3:
            result = "Listando";
            System.out.println(result);
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
            System.out.println(result);
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
        menuInicial.repeat(1);
        }else if (respuesta.equals("NO")) {
        System.out.println("Operaciones de Catalogo finalizadas con exito");
    } else { System.out.println("Respete mayusculas. Opcion no leida");
    }

}

    

