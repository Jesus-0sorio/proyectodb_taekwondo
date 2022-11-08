/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author juan_jose.saavedra
 */
public class BaseDatos extends javax.swing.JPanel {

    /**
     * Creates new form BaseDeDatos
     */
    
    private static Conexion db_connect = null;
    public BaseDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        formularioBD = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jLabel5 = new javax.swing.JLabel();
        JTextnombreBD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextusuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTextpwd = new javax.swing.JPasswordField();
        btn_conectar = new javax.swing.JButton();
        btn_desconectar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Base de datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("                         ");
        jPanel2.add(jLabel2, java.awt.BorderLayout.LINE_END);

        jLabel3.setText(" ");
        jPanel2.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jLabel4.setText("                         ");
        jPanel2.add(jLabel4, java.awt.BorderLayout.LINE_START);

        formularioBD.setBackground(new java.awt.Color(0, 0, 0));
        formularioBD.setLayout(new java.awt.GridLayout(6, 2));
        formularioBD.add(filler1);
        formularioBD.add(filler2);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de la base de datos");
        formularioBD.add(jLabel5);

        JTextnombreBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextnombreBDActionPerformed(evt);
            }
        });
        formularioBD.add(JTextnombreBD);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        formularioBD.add(jLabel6);

        JTextusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextusuarioActionPerformed(evt);
            }
        });
        formularioBD.add(JTextusuario);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");
        formularioBD.add(jLabel7);
        formularioBD.add(JTextpwd);

        btn_conectar.setText("Conectar");
        btn_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectarActionPerformed(evt);
            }
        });
        formularioBD.add(btn_conectar);

        btn_desconectar.setText("Desconectar");
        btn_desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desconectarActionPerformed(evt);
            }
        });
        formularioBD.add(btn_desconectar);

        jPanel2.add(formularioBD, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void JTextusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextusuarioActionPerformed

    private void btn_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectarActionPerformed
        String error = "";
        String nameDB = JTextnombreBD.getText();
        if(nameDB.isEmpty()){
            error += "El campo nombre de la base de datos no puede estar vacio";
        }
        String user = JTextusuario.getText();
        if(user.isEmpty()){
            error += "El campo usuario no puede estar vacio";
        }
        if(!error.isEmpty()){
            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String pwd =  new String(JTextpwd.getPassword());
        db_connect = new Conexion(user,pwd,nameDB);
        Principal.db = db_connect.conectar();
        Principal.estadoDB = db_connect.getEstadoDB();
    }//GEN-LAST:event_btn_conectarActionPerformed

    private void btn_desconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desconectarActionPerformed
        try {
            db_connect.desconectar();
            Principal.estadoDB = db_connect.getEstadoDB();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_desconectarActionPerformed

    private void JTextnombreBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextnombreBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextnombreBDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextnombreBD;
    private javax.swing.JPasswordField JTextpwd;
    private javax.swing.JTextField JTextusuario;
    private javax.swing.JButton btn_conectar;
    private javax.swing.JButton btn_desconectar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel formularioBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
