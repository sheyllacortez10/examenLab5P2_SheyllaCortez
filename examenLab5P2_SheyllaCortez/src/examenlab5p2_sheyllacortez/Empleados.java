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
public class Empleados extends Usuarios{
    //att
    private String carrera = "";
    private String puesto = "";
    private int anios = 0;
    
    //cons

    public Empleados() {
        super();
    }

    public Empleados(String nombre, String apellido,String contrasena, Date fecha, String genero, String depa, String ID, String carrera, String puesto, int anios) {
        super(nombre, apellido, contrasena, fecha, genero, depa, ID);
        this.carrera = carrera;
        this.puesto = puesto;
        this.anios = anios;
    }
    
    //muta

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    //ma

    @Override
    public String toString() {
        return "Empleados{" + "carrera=" + carrera + ", puesto=" + puesto + ", anios=" + anios + '}';
    }
    
}
