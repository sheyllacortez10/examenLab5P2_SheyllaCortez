/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_sheyllacortez;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Tramites {
    //att
    private String nombre = "";
    private String despcrip = "";
    private Date fechasoli;
    private int ID = 0;
    
    //cons

    public Tramites() {
    }

    public Tramites(String nombre, String descrip, Date fechasoli, int ID) {
        this.nombre = nombre;
        this.despcrip = descrip;
        this.fechasoli = fechasoli;
        this.ID = ID;
    }
    
    //muta

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDespcrip() {
        return despcrip;
    }

    public void setDespcrip(String despcrip) {
        this.despcrip = despcrip;
    }

    public Date getFechasoli() {
        return fechasoli;
    }

    public void setFechasoli(Date fechasoli) {
        this.fechasoli = fechasoli;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Tramites{" + "nombre=" + nombre + ", despcrip=" + despcrip + ", fechasoli=" + fechasoli + ", ID=" + ID + '}';
    }
    
    
    
}
