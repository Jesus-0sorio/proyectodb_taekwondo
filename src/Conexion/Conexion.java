/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author @jesus.osorio
 */
public class Conexion {
    protected String usuario;
    protected String contrasena;
    protected String nombreDB;
    protected String estadoDB = "Desconectada";
    private static Connection conexionDB;

    public Conexion(String usuario, String contrasena, String nombreDB) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreDB = nombreDB;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreDB() {
        return nombreDB;
    }

    public void setNombreDB(String nombreDB) {
        this.nombreDB = nombreDB;
    }
    
    public String getEstadoDB() {
        return estadoDB;
    }

    public void setEstadoDB(String estadoDB) {
        this.estadoDB = estadoDB;
    }
    
    public Connection conectar(){
        try{     
            String sourceURL = "jdbc:mysql:///" + nombreDB;
            
            conexionDB = DriverManager.getConnection(sourceURL, usuario, contrasena);
            estadoDB = "Conectada";
            JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return conexionDB;
        }catch (SQLException sqle){
            JOptionPane.showMessageDialog(null, sqle.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return conexionDB;
    }
    
    public void desconectar() throws SQLException{
        try{     
            conexionDB.close();
            estadoDB = "Desconectada";
            JOptionPane.showMessageDialog(null, "Conexion Terminada", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException sqle){
            JOptionPane.showMessageDialog(null, sqle.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            conexionDB.close();
        } finally {
            conexionDB.close();
        }
    }
}
