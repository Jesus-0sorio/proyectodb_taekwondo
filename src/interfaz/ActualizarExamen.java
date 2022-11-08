/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Modelo.Examen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ether
 */
public class ActualizarExamen extends javax.swing.JPanel {

    /**
     * Creates new form ACTUALIZAR_EXAMEN
     */
    public ActualizarExamen() {
        initComponents();
        ((JTextField) this.jDateFechaPresentacionBuscar.getDateEditor()).setEditable(false);
        cedulaExamen.setEnabled(false);
        jDateFechaPresentacion.setEnabled(false);
        jTextIdentificacionFederacion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_formu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cedulaExamen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateFechaPresentacion = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        escuelaExamen = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextPuntajeCombate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextPuntajeFiguras = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextNombreInstructor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboIndicadorPrueba = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextIdentificacionFederacion = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        panel_busqueda = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextCedulaBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateFechaPresentacionBuscar = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextPaisFederacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        panel_formu.setBackground(new java.awt.Color(0, 0, 0));
        panel_formu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cédula");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de presentación");

        jDateFechaPresentacion.setDateFormatString("yyyy/MM/d");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Escuela");

        escuelaExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "WTF", "ITF" }));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Puntaje de combate");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Puntaje de figuras");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre del instructor");

        jTextNombreInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreInstructorActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Indicador de prueba");

        jComboIndicadorPrueba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A", "N" }));
        jComboIndicadorPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboIndicadorPruebaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de identificación de la federación");

        jTextIdentificacionFederacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdentificacionFederacionActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        panel_busqueda.setBackground(new java.awt.Color(0, 0, 0));
        panel_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cédula");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de presentación");

        jDateFechaPresentacionBuscar.setDateFormatString("yyyy/MM/d");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
        panel_busqueda.setLayout(panel_busquedaLayout);
        panel_busquedaLayout.setHorizontalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_busquedaLayout.createSequentialGroup()
                .addGroup(panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_busquedaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateFechaPresentacionBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel_busquedaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jTextCedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_busquedaLayout.createSequentialGroup()
                            .addGap(181, 181, 181)
                            .addComponent(jLabel5)))
                    .addGroup(panel_busquedaLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel_busquedaLayout.setVerticalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_busquedaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_busquedaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jDateFechaPresentacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("País de la federación");

        javax.swing.GroupLayout panel_formuLayout = new javax.swing.GroupLayout(panel_formu);
        panel_formu.setLayout(panel_formuLayout);
        panel_formuLayout.setHorizontalGroup(
            panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_formuLayout.createSequentialGroup()
                            .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateFechaPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addComponent(escuelaExamen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextPuntajeCombate)
                                .addComponent(jTextPuntajeFiguras)
                                .addComponent(jTextNombreInstructor)
                                .addComponent(cedulaExamen)))
                        .addComponent(panel_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_formuLayout.createSequentialGroup()
                        .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(jComboIndicadorPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_formuLayout.createSequentialGroup()
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextPaisFederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_formuLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextIdentificacionFederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panel_formuLayout.setVerticalGroup(
            panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_formuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_formuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jDateFechaPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(escuelaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPuntajeCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPuntajeFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombreInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jComboIndicadorPrueba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextPaisFederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextIdentificacionFederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_formu, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Actualice un examen");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jLabel8.setText(" ");
        jPanel1.add(jLabel8, java.awt.BorderLayout.PAGE_END);

        jLabel9.setText("          ");
        jPanel1.add(jLabel9, java.awt.BorderLayout.LINE_END);

        jLabel10.setText("          ");
        jPanel1.add(jLabel10, java.awt.BorderLayout.LINE_START);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String error = "";
        String cedula = jTextCedulaBuscar.getText();
        String fechaPresentacion = ((JTextField)jDateFechaPresentacionBuscar.getDateEditor().getUiComponent()).getText();

        if(cedula.isEmpty()){
            error += "La cedula no puede estar vacia\n";
        }
        if(fechaPresentacion.isEmpty()){
            error += "La fecha de presentacion no puede estar vacia\n";
        }
        
        if(!error.isEmpty()){
            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String query = "select *  from EXAMENES where cedula_practicante = ? and fecha_presentacion = ?";
        try{
            PreparedStatement ps = Principal.db.prepareStatement(query);
            ps.setString(1, cedula);
            ps.setString(2, fechaPresentacion);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cedulaExamen.setText(rs.getString("cedula_practicante"));
                jDateFechaPresentacion.setDate(rs.getDate("fecha_presentacion"));
                escuelaExamen.setSelectedItem(rs.getString("escuela"));
                jTextPuntajeCombate.setText(rs.getString("puntaje_combate"));
                jTextPuntajeFiguras.setText(rs.getString("puntaje_figuras"));
                jTextNombreInstructor.setText(rs.getString("nombre_instructor"));
                jComboIndicadorPrueba.setSelectedItem(rs.getString("indicador_prueba"));
                jTextPaisFederacion.setText(rs.getString("pais_federacion"));
                jTextIdentificacionFederacion.setText(rs.getString("numero_identificacion_federacion"));                
            } else{
                JOptionPane.showMessageDialog(null, "Examen no registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String error = "";
        String cedula = cedulaExamen.getText();
        if(cedula.isEmpty()){
            error += "El campo cedula no puede estar vacio\n";
        }
        String fechaPresentacion = ((JTextField)jDateFechaPresentacion.getDateEditor().getUiComponent()).getText();
        if(fechaPresentacion.isEmpty()){
            error += "El campo fecha de presentacion no puede estar vacio\n";
        }
        String escuela = escuelaExamen.getSelectedItem().toString();
        if(escuela.equals("Seleccionar")){
            error += "Debe seleccionar una escuela\n";
        }
        int puntajeCombate = 0;
        try{
            puntajeCombate = Integer.parseInt(jTextPuntajeCombate.getText());
        } catch(NumberFormatException e){
            error += "El campo puntaje de combate debe ser un numero entero\n";
        }
        int puntajeFiguras = 0;
        try{
            puntajeFiguras = Integer.parseInt(jTextPuntajeFiguras.getText());
        } catch(NumberFormatException e){
            error += "El campo puntaje de figuras debe ser un numero entero\n";
        }
        String nombreInstructor = jTextNombreInstructor.getText();
        if(nombreInstructor.isEmpty()){
            error += "El campo nombre del instructor no puede estar vacio\n";
        }
        String indicadorPrueba = jComboIndicadorPrueba.getSelectedItem().toString();
        if(indicadorPrueba.equals("Seleccionar")){
            error += "Debe seleccionar un indicador de la prueba\n";
        }
        String paisFederacion = jTextPaisFederacion.getText(); //jTextPaisFederacion.getText()
        if(paisFederacion.isEmpty()){
            error += "El campo pais de la federacion no puede estar vacio\n";
        }
        String identificacion = jTextIdentificacionFederacion.getText();
        if(identificacion.isEmpty()){
            error += "El campo numero de identificacion de la federacion no puede estar vacio\n";
        }
        
        Examen examen = new Examen(cedula, fechaPresentacion, escuela, puntajeCombate, puntajeFiguras, nombreInstructor, indicadorPrueba, paisFederacion, identificacion);

        if(!error.isEmpty()){
            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "update EXAMENES set escuela = ?, puntaje_combate = ?, puntaje_figuras = ?, nombre_instructor = ?, indicador_prueba  = ?, pais_federacion = ? where cedula_practicante = ? and fecha_presentacion = ?";
        try{
            PreparedStatement ps = Principal.db.prepareStatement(query);
            ps.setString(1, examen.getEscuela());
            ps.setInt(2, examen.getPuntajeCombate());
            ps.setInt(3, examen.getPuntajeFigura());
            ps.setString(4, examen.getNombreInstructor());
            ps.setString(5, examen.getIndicardorPrueba());
            ps.setString(6, examen.getPaisFederacion());
            ps.setString(7, examen.getCedula());
            ps.setString(8, examen.getFechaPresentacion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void jTextIdentificacionFederacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdentificacionFederacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdentificacionFederacionActionPerformed

    private void jComboIndicadorPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboIndicadorPruebaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboIndicadorPruebaActionPerformed

    private void jTextNombreInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreInstructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreInstructorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField cedulaExamen;
    private javax.swing.JComboBox<String> escuelaExamen;
    private javax.swing.JComboBox<String> jComboIndicadorPrueba;
    private com.toedter.calendar.JDateChooser jDateFechaPresentacion;
    private com.toedter.calendar.JDateChooser jDateFechaPresentacionBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextCedulaBuscar;
    private javax.swing.JTextField jTextIdentificacionFederacion;
    private javax.swing.JTextField jTextNombreInstructor;
    private javax.swing.JTextField jTextPaisFederacion;
    private javax.swing.JTextField jTextPuntajeCombate;
    private javax.swing.JTextField jTextPuntajeFiguras;
    private javax.swing.JPanel panel_busqueda;
    private javax.swing.JPanel panel_formu;
    // End of variables declaration//GEN-END:variables
}
