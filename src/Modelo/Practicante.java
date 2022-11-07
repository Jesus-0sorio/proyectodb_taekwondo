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
public class Practicante {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected String fechaIngreso;
    protected String nacionalidad;
    protected float peso;
    protected String personeria_juridica_liga;

    public Practicante(String cedula, String nombre, String apellido, String fechaNacimiento, String fechaIngreso, String nacionalidad, float peso, String personeria_juridica_liga) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.personeria_juridica_liga = personeria_juridica_liga;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPersoneria_juridica_liga() {
        return personeria_juridica_liga;
    }

    public void setPersoneria_juridica_liga(String personeria_juridica_liga) {
        this.personeria_juridica_liga = personeria_juridica_liga;
    }

   
}
