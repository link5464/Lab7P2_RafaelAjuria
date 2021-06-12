/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;

import java.io.Serializable;

/**
 *
 * @author rajur
 */
public class Cancion implements Serializable {
    String Nombre;
    int Duracion;
    String Compositor;
    String Artista;
    String Album;
    String Distribuidor;
    Boolean Exclusiva;
    String Productor;
    String ArtistaInvitado;
    
    
    
    
    private static final long SerialVersionUID=777L;

    public Cancion(String Nombre, int Duracion, String Compositor, String Distribuidor, Boolean Exclusiva, String Artista, String Album) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Compositor = Compositor;
        this.Distribuidor = Distribuidor;
        this.Exclusiva = Exclusiva;
        this.Artista = Artista;
        this.Album=Album;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getCompositor() {
        return Compositor;
    }

    public void setCompositor(String Compositor) {
        this.Compositor = Compositor;
    }

    public String getDistribuidor() {
        return Distribuidor;
    }

    public void setDistribuidor(String Distribuidor) {
        this.Distribuidor = Distribuidor;
    }

    public Boolean getExclusiva() {
        return Exclusiva;
    }

    public void setExclusiva(Boolean Exclusiva) {
        this.Exclusiva = Exclusiva;
    }

    public String getProductor() {
        return Productor;
    }

    public void setProductor(String Productor) {
        this.Productor = Productor;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getArtistaInvitado() {
        return ArtistaInvitado;
    }

    public void setArtistaInvitado(String ArtistaInvitado) {
        this.ArtistaInvitado = ArtistaInvitado;
    }
    
    
    
}
