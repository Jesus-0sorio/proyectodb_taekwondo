/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author @jesus.osorio
 */
public class Director {
    
    protected String cedula;
    protected String nombre;
    protected String grado;
    protected int numeroDan;

    public Director(String cedula, String nombre, String grado, int numeroDan) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.grado = grado;
        this.numeroDan = numeroDan;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getNumeroDan() {
        return numeroDan;
    }

    public void setNumeroDan(int numeroDan) {
        this.numeroDan = numeroDan;
    }

    
    
    
}
