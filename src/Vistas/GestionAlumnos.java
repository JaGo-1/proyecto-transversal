package Vistas;

import Modelo.Alumno;
import Persistencia.alumnoData;
import java.beans.PropertyVetoException;
import java.time.LocalDate;
import java.time.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    private alumnoData alumnoData = new alumnoData();
    private Alumno alumnoActual = null;

    public GestionAlumnos() {
        initComponents();
        this.setResizable(false);
        this.setMaximizable(false);

        //internalFrame siempre maximizado
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setFrameIcon(new ImageIcon());
        
        fecha_jDateChooser.getDateEditor().setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        dni_texto = new javax.swing.JLabel();
        apellido_jTextField = new javax.swing.JTextField();
        documento_jTextField = new javax.swing.JTextField();
        nombre_jTextField = new javax.swing.JTextField();
        estado_texto = new javax.swing.JLabel();
        apellido_texto = new javax.swing.JLabel();
        nombre_texto = new javax.swing.JLabel();
        fechNac_texto = new javax.swing.JLabel();
        buscar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        nuevo_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        fecha_jDateChooser = new com.toedter.calendar.JDateChooser();
        estado_jRadioButton1 = new javax.swing.JRadioButton();

        jButton4.setText("jButton1");

        bg.setBackground(new java.awt.Color(36, 37, 38));

        dni_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dni_texto.setText("Documento:");

        apellido_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        documento_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nombre_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        estado_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estado_texto.setText("Estado:");

        apellido_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellido_texto.setText("Apellido:");

        nombre_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre_texto.setText("Nombre:");

        fechNac_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechNac_texto.setText("Fecha de Nacimiento:");

        buscar_btn.setBackground(new java.awt.Color(36, 37, 38));
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda.png"))); // NOI18N
        buscar_btn.setBorder(null);
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(51, 51, 51));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        nuevo_btn.setBackground(new java.awt.Color(34, 84, 139));
        nuevo_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nuevo_btn.setText("Nuevo");
        nuevo_btn.setBorder(null);
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        guardar_btn.setBackground(new java.awt.Color(53, 82, 0));
        guardar_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guardar_btn.setText("Guardar");
        guardar_btn.setBorder(null);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setBackground(new java.awt.Color(122, 36, 24));
        eliminar_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminar_btn.setText("Eliminar");
        eliminar_btn.setBorder(null);
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_titulo.setText("Gestión de alumnos");

        estado_jRadioButton1.setText("Activo");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_titulo)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dni_texto)
                                    .addComponent(apellido_texto))
                                .addGap(489, 489, 489))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado_texto)
                                    .addComponent(nombre_texto)
                                    .addComponent(fechNac_texto))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellido_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(documento_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(estado_jRadioButton1)
                                            .addComponent(fecha_jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(154, 154, 154)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(label_titulo)
                .addGap(97, 97, 97)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(documento_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dni_texto)))
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_texto))
                .addGap(36, 36, 36)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_texto))
                .addGap(47, 47, 47)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estado_texto)
                    .addComponent(estado_jRadioButton1))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(fechNac_texto))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(fecha_jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_salir_btnActionPerformed

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
        // TODO add your handling code here:
        estado_jRadioButton1.setEnabled(true);
        documento_jTextField.setText("");
        apellido_jTextField.setText("");
        nombre_jTextField.setText("");
        estado_jRadioButton1.setSelected(true);
        fecha_jDateChooser.setDate(new Date());
        alumnoActual = null;
    }//GEN-LAST:event_nuevo_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(documento_jTextField.getText());
            String apellido = apellido_jTextField.getText();
            String nombre = nombre_jTextField.getText();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Los campos no pueden estar vacio.");
                return;
            }
            Boolean estado = estado_jRadioButton1.isSelected();
            java.util.Date date = fecha_jDateChooser.getDate();
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();    

            if (alumnoActual == null) {
                alumnoActual = new Alumno(dni, apellido, nombre, fecha, estado);
                alumnoData.guardarAlumno(alumnoActual);
                JOptionPane.showMessageDialog(this, "Alumno registrado correctamente");
            } else {
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNac(fecha);
                alumnoData.modificarAlumno(alumnoActual);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifique los datos ingresados.");

        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        // TODO add your handling code here
        if (alumnoActual != null) {
            alumnoData.bajaFisicaAlumno(alumnoActual.getIdAlumno());
            JOptionPane.showMessageDialog(this, "Alumno eliminado con exito.");

            documento_jTextField.setText("");
            apellido_jTextField.setText("");
            nombre_jTextField.setText("");
            estado_jRadioButton1.setSelected(true);
            fecha_jDateChooser.setDate(new Date());
            alumnoActual = null;
        } else {
            JOptionPane.showMessageDialog(this, "No hay alumno seleccionado.");
        }
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(documento_jTextField.getText());
            alumnoActual = alumnoData.buscarAlumnoPorDni(dni);

            if (alumnoActual != null) {
                estado_jRadioButton1.setEnabled(false);
                apellido_jTextField.setText(alumnoActual.getApellido());
                nombre_jTextField.setText(alumnoActual.getNombre());
                estado_jRadioButton1.setSelected(alumnoActual.isActivo());
                LocalDate lc = alumnoActual.getFechaNac();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                fecha_jDateChooser.setDate(date);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(this, "Usted debe ingresar un numero valido.");
        }

    }//GEN-LAST:event_buscar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_jTextField;
    private javax.swing.JLabel apellido_texto;
    private javax.swing.JPanel bg;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JLabel dni_texto;
    private javax.swing.JTextField documento_jTextField;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JRadioButton estado_jRadioButton1;
    private javax.swing.JLabel estado_texto;
    private javax.swing.JLabel fechNac_texto;
    private com.toedter.calendar.JDateChooser fecha_jDateChooser;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField nombre_jTextField;
    private javax.swing.JLabel nombre_texto;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
