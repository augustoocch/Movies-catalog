package cpjLaboratorioFinal;

import java.util.Scanner;



public class Menu {
    
    
    public int eleccion;

    public int Menu () {
      
    this.eleccion = eleccion;    
        
    }
    
    public void menuIniciador () {
                

                
        String menuInicial = new String ("\n Elija la opcion escribiendo el numero: \n"
        + "1: Iniciar Catalogo \n" + "2: Agregar pelicula \n"
        + "3: Listar pelicula \n" + "4: Buscar pelicula \n" + "0: Salir \n");
        System.out.println(menuInicial);
        
        CpjLaboratorioFinal vuelta = new CpjLaboratorioFinal();
        vuelta.elecciones();   
    }

    
