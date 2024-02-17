/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_sheyllacortez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Civiles extends Usuarios{
    //att
    private ArrayList<Tramites> tramite = new ArrayList<>();

    public Civiles(String nombre, String apellido, String contrasena, Date fecha, String genero, String depa, String ID) {
        super(nombre, apellido, contrasena, fecha, genero, depa, ID);
    }

    public Civiles() {
    }
    
    //muta

    public ArrayList<Tramites> getTramite() {
        return tramite;
    }

    public void setTramite(ArrayList<Tramites> tramite) {
        this.tramite = tramite;
    }
    
    //ma

    @Override
    public String toString() {
        return super.toString() + " | " + "Civiles{" + "tramite=" + tramite + '}';
    }
    
}
