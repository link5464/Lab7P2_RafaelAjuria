/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;

import java.util.ArrayList;

/**
 *
 * @author rajur
 */
public class Album {
    String Nombre;
    String Fecha;
    String Genero;
    String Formato;
    String Productor;
    ArrayList<Cancion> Canciones;

    public Album(String Nombre, String Fecha, String Genero, String Formato, String Productor) {
        this.Canciones = new ArrayList();
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Genero = Genero;
        this.Formato = Formato;
        this.Productor = Productor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getProductor() {
        return Productor;
    }

    public void setProductor(String Productor) {
        this.Productor = Productor;
    }

    public ArrayList getCanciones() {
        return Canciones;
    }

    public void setCanciones(ArrayList Canciones) {
        this.Canciones = Canciones;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
