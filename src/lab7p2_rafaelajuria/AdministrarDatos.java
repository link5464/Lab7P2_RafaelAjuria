/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author rajur
 */
public class AdministrarDatos {
    ArrayList<Artista> Datos = new ArrayList();
    File file = null;

    public AdministrarDatos(String path) {
        file = new File(path);
    }

    
    public ArrayList<Artista> getDatos() {
        return Datos;
    }

    public void setDatos(ArrayList<Artista> Datos) {
        this.Datos = Datos;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void LoadMusic() {
        try {            
            Datos = new ArrayList();
            Artista temp;
            if (file.exists()) {
                FileInputStream entrada
                    = new FileInputStream(file);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Artista) objeto.readObject()) != null) {
                        Datos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void WriteFile() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(file);
            bw = new ObjectOutputStream(fw);
            for (Artista t : Datos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
}
