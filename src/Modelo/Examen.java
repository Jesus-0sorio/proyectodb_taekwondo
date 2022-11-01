/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author @jesus.osorio
 */
public class Examen {
    protected String cedula;
    protected String fechaPresentacion;
    protected String escuela;
    protected int puntajeCombate;
    protected int puntajeFigura;
    protected String nombreInstructor;
    protected char indicardorPrueba;

    public Examen(String cedula, String fechaPresentacion, String escuela, int puntajeCombate, int puntajeFigura, String nombreInstructor, char indicardorPrueba) {
        this.cedula = cedula;
        this.fechaPresentacion = fechaPresentacion;
        this.escuela = escuela;
        this.puntajeCombate = puntajeCombate;
        this.puntajeFigura = puntajeFigura;
        this.nombreInstructor = nombreInstructor;
        this.indicardorPrueba = indicardorPrueba;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(String fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getPuntajeCombate() {
        return puntajeCombate;
    }

    public void setPuntajeCombate(int puntajeCombate) {
        this.puntajeCombate = puntajeCombate;
    }

    public int getPuntajeFigura() {
        return puntajeFigura;
    }

    public void setPuntajeFigura(int puntajeFigura) {
        this.puntajeFigura = puntajeFigura;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public char getIndicardorPrueba() {
        return indicardorPrueba;
    }

    public void setIndicardorPrueba(char indicardorPrueba) {
        this.indicardorPrueba = indicardorPrueba;
    }
    
    
}
