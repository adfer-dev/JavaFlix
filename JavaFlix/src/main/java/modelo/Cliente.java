/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Adrián Fernández García
 */
public class Cliente implements Serializable{
    //dni del cliente
    private String dni;
    //nombre del cliente
    private String nombre;
    //correo del cliente
    private String correo;
    //contraseña del cliente
    private String clave;
    //tarjeta de crédito del cliente
    private TarjetaCredito tarjeta;
    //suscripción elegida por el cliente
    private Suscripcion suscripcion;
    //lista de calificaciones que ha realizado el cliente
    private ArrayList<Calificacion> calificaciones;
    //lista de favoritos del cliente
    private ArrayList<Contenido> listaSeguimiento;

    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param correo
     * @param clave
     * @param tarjeta 
     */
    public Cliente(String dni, String nombre, String correo, String clave, TarjetaCredito tarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.tarjeta = tarjeta;
        this.suscripcion=null;
        this.calificaciones= new ArrayList();
        this.listaSeguimiento= new ArrayList();
    }
    
    //GETTERS & SETTERS

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public ArrayList<Contenido> getListaSeguimiento() {
        return listaSeguimiento;
    }

    public void setListaSeguimiento(ArrayList<Contenido> listaSeguimiento) {
        this.listaSeguimiento = listaSeguimiento;
    }
    
    
    
    
    @Override
    public boolean equals(Object obj) {
        
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        
        Cliente c= (Cliente)obj;
        
        return (this.dni.equals(c.dni));

    }

    @Override
    public String toString() {
        return this.dni+"  "+this.nombre;
    }
    
    
    
    
}
