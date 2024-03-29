/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrián Fernández García
 */
public class Pelicula extends Contenido {
    //duracion en minutos de la película
    private int duracionMinutos;
    //director de la película
    private String director;
    
    /**
     * Constructor
     * @param titulo
     * @param sinopsis
     * @param genero
     * @param anio
     * @param actores
     * @param portada
     * @param duracionMinutos
     * @param director
     * @throws IOException 
     */
    public Pelicula(String titulo, String sinopsis, String genero, int anio, ArrayList<String> actores,ImageIcon portada, int duracionMinutos, String director) throws IOException {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anio = anio;
        this.actores = actores; 
        this.portada=portada;
        this.duracionMinutos=duracionMinutos;
        this.director=director;
    }
    
    //GETTERS & SETTERS

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    
    
    
    
    
}
