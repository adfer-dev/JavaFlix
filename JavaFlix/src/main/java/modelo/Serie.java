/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrián Fernández García
 */
public class Serie extends Contenido {
    //numero de temporadas
    private int temporadas;
    //lista de capítulos que tiene la serie
    private ArrayList<Capitulo> capitulos;

    /**
     * Constructor
     * @param titulo
     * @param sinopsis
     * @param genero
     * @param anio
     * @param actores
     * @param portada
     * @param temporadas
     * @param capitulos 
     */
     public Serie(String titulo, String sinopsis, String genero, int anio, ArrayList<String> actores,ImageIcon portada,int temporadas, ArrayList<Capitulo> capitulos) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anio = anio;
        this.actores = actores;
        this.portada=portada;
        this.temporadas=temporadas;
        this.capitulos=capitulos;
        
    }
    
    //GETTERS & SETTERS

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    
    
}
