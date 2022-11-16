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
public class Liga {
    protected int personeriaJuridica;
    protected String fechaAfiliacion;
    protected String escuela;
    protected String ciudadSede;
    protected String identificacionFederacion;

    public Liga(int personeriaJuridica, String fechaAfiliacion, String escuela, String ciudadSede, String identificacionFederacion) {
        this.personeriaJuridica = personeriaJuridica;
        this.fechaAfiliacion = fechaAfiliacion;
        this.escuela = escuela;
        this.ciudadSede = ciudadSede;
        this.identificacionFederacion = identificacionFederacion;
    }

    public int getPersoneriaJuridica() {
        return personeriaJuridica;
    }

    public void setPersoneriaJuridica(int personeriaJuridica) {
        this.personeriaJuridica = personeriaJuridica;
    }

    public String getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(String fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCiudadSede() {
        return ciudadSede;
    }

    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }

    public String getIdentificacionFederacion() {
        return identificacionFederacion;
    }

    public void setIdentificacionFederacion(String identificacionFederacion) {
        this.identificacionFederacion = identificacionFederacion;
    }

    
    
}
