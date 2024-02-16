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
public class Usuarios {
    //att
    protected String nombre = "";
    protected String apellido = "";
    protected String contrasena = "";
    protected Date fecha;
    protected String genero = "";
    protected String depa = "";
    protected String ID = "";
    
    //Cons

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, Date fecha, String genero, String depa, String ID) {
        this.nombre = nombre; 
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.fecha = fecha;
        this.genero = genero;
        this.depa = depa;
        this.ID = ID;
        
    }
    
    //muta

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDepa() {
        return depa;
    }

    public void setDepa(String depa) {
        this.depa = depa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    //Ma
    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + ", fecha=" + fecha + ", genero=" + genero + ", depa=" + depa + ", ID=" + ID + '}';
    }
    
    
}
