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
    protected String personeriaJuridica;
    protected String fechaAfiliacion;
    protected String escuela;
    protected String ciudadSede;

    
    public Liga(String personeriaJuridica, String fechaAfiliacion, String escuela, String ciudadSede){
        this.personeriaJuridica = personeriaJuridica;
        this.fechaAfiliacion = fechaAfiliacion;
        this.escuela = escuela;
        this.ciudadSede = ciudadSede;
    }

    public String getPersoneriaJuridica() {
        return personeriaJuridica;
    }

    public void setPersoneriaJuridica(String personeriaJuridica) {
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
    
}
