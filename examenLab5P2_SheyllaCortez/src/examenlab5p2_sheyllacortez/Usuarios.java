/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_sheyllacortez;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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

    public Usuarios(String nombre, String apellido, String contrasena, Date fecha, String genero, String depa, String ID) {
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
    
    
    //ma para generar id
    public String myID(){
        Random rd = new Random();
        if (depa.equalsIgnoreCase("Francisco Morazan")) {
            ID += "01";
            ID += rd.nextInt(01, 28);
            ID += "-";
            ID += fecha.getYear() +1900;
            ID += "-";
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            return ID;
        } else if (depa.equalsIgnoreCase("Cortes")) {
            ID += "02";
            ID += rd.nextInt(01, 12);
            ID += "-";
            ID += fecha.getYear() + 1900;
            ID += "-";
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            return ID;
        } else if (depa.equalsIgnoreCase("Comayagua")) {
            ID += "03";
            ID += rd.nextInt(001, 21);
            ID += fecha.getYear() + 1900;
            ID += "-";
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            ID += rd.nextInt(0, 9);
            return ID;
        } else {
            System.out.println("No valido");
        }
        return "";
    }
    
}
