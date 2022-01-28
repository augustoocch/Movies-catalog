package mx.com.gm.peliculas.domain;

import java.util.Objects;

public class Peliculas {
    
    private String nombre;

    
    public Peliculas () {
    
    }   
  
    public Peliculas(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre de pelicula: " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

    }
    
    
}