package cpjLaboratorioFinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Peliculas;

public class CpjLaboratorioFinal {
public static void main (String [] correr) {
    
//CREAR
    //AccesoDatosImpl crear = new AccesoDatosImpl ();
    //crear.crear("Peliculas");
    
//BORRAR
    //AccesoDatosImpl borrar = new AccesoDatosImpl ();
    //borrar.borrar("");
 
//LOCALIZAR   
    var archivoPeliculas = "/Users/augustoocchiuzzi/Desktop/JAVA/PROYECTOS/LaboratorioFinal/Peliculas.txt";
        
   
//MANDA A MENU
    Menu eleccionUsuario1 = new Menu();
    eleccionUsuario1.menuIniciador();
    
}
 //SCANNER
 
 public String elecciones () {
     
    var archivoPeliculas = "/Users/augustoocchiuzzi/Desktop/JAVA/PROYECTOS/LaboratorioFinal/Peliculas.txt";
    System.out.println("---------------");
    
//SCANNER

    Scanner opciones = new Scanner(System.in);
    var eleccionUsuario = Integer.parseInt(opciones.nextLine());

    var result = "";
//SWITCH DE ELECCION
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
            result = "\n Menu finalizado";
            System.out.println(result);
            break;
            
        default:
            System.out.println ("Opcion no contemplada");
            
    }
  //SCANNER FINAL       
        System.out.println("\n ¿Desea volver al inicio del formulario?: SI/NO");
        Scanner scan = new Scanner (System.in);
        var respuesta = scan.nextLine();
        
 //CONDICIONAL

        if (respuesta.equals("SI")) {
            
            Menu eleccionUsuario2 = new Menu();
            eleccionUsuario2.menuIniciador();

            
        } else if (respuesta.equals("NO")) {
            System.out.println("Operaciones de Catalogo finalizadas con exito");
            //System.exit(0);
        } else {
            System.out.println("\n Respete mayusculas. Opcion no leida \n");
            Menu eleccionUsuario2 = new Menu();
            eleccionUsuario2.menuIniciador();

        }
    }

}

    

