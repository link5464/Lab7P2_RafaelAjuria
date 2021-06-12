/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rajur
 */
public class Artista implements Serializable {
    String Nombre;
    String Genero;
    String Disquera;
    String Alias;
    String Tipo;
    ArrayList<Album> Albumes;

    
    
    private static final long serialVersionUID=777L;
    
    public Artista(String Nombre, String Genero, String Disquera, String Alias, String Tipo) {
        this.Albumes = new ArrayList();
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Disquera = Disquera;
        this.Alias = Alias;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDisquera() {
        return Disquera;
    }

    public void setDisquera(String Disquera) {
        this.Disquera = Disquera;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public ArrayList getAlbumes() {
        return Albumes;
    }

    public void setAlbumes(ArrayList Albumes) {
        this.Albumes = Albumes;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
    
}
